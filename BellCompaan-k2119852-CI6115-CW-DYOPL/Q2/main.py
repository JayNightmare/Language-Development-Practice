import sys
from antlr4 import *
from fspowLexer import fspowLexer
from fspowParser import fspowParser
from FileCollection import FileCollection
from Selector import Selector
from TreesUser import TreesUser

class FspowVisitor:
    def __init__(self):
        self.variables = {}

    def visit(self, tree, parser):
        node_text = TreesUser.getNodeText(tree, parser.ruleNames)
        
        if node_text == "prog":
            for i in range(tree.getChildCount()):
                self.visit(tree.getChild(i), parser)
                
        elif node_text == "assignment":
            var_name = tree.getChild(0).getText()
            self.visit(tree.getChild(2), parser)  # visit the expression
            
        elif node_text == "fcCreation":
            root_path = tree.getChild(2).getChild(0).getText()  # get STRING from rootSpecifier
            return FileCollection(root_path)
            
        elif node_text == "selCreation":
            selector = self.visit_selfilter(tree.getChild(2), parser)  # visit the selfilter
            return selector
            
        elif node_text == "fcApplySelector":
            fc_name = tree.getChild(0).getText()
            sel_name = tree.getChild(3).getText()
            if fc_name in self.variables and sel_name in self.variables:
                fc = self.variables[fc_name]
                selector = self.variables[sel_name]
                result = fc.apply(selector)
                result.list()
                
        elif node_text == "fcList":
            fc_name = tree.getChild(0).getText()
            if fc_name in self.variables:
                self.variables[fc_name].list()
                
        elif node_text == "message":
            message = tree.getChild(2).getText().strip('"')
            print(message)
            
        elif node_text == "expression":
            result = self.visit(tree.getChild(0), parser)
            if tree.getParent().getChild(0) is not None:
                var_name = tree.getParent().getChild(0).getText()
                self.variables[var_name] = result
            return result

    def visit_selfilter(self, tree, parser):
        node_text = TreesUser.getNodeText(tree, parser.ruleNames)
        
        if node_text == "FilterName":
            return Selector.name(tree.getChild(2).getText())
            
        elif node_text == "FilterSize":
            return Selector.size(tree.getChild(2).getText())
            
        elif node_text == "FilterDate":
            return Selector.date(tree.getChild(2).getText())
            
        elif node_text == "FilterIntersect":
            left = self.visit_selfilter(tree.getChild(0), parser)
            right = self.visit_selfilter(tree.getChild(2), parser)
            return left.intersect(right)
            
        elif node_text == "FilterNot":
            inner = self.visit_selfilter(tree.getChild(2), parser)
            return Selector.not_(inner)
            
        elif node_text == "FilterParens":
            return self.visit_selfilter(tree.getChild(1), parser)

def main():
    if len(sys.argv) != 2:
        print("Usage: python main.py <input_file>")
        return

    input_file = sys.argv[1]
    input_stream = FileStream(input_file)
    lexer = fspowLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = fspowParser(stream)
    tree = parser.prog()

    # Print the parse tree for debugging
    print("Parse Tree:")
    print(TreesUser.PrettyPrint(tree, None, parser))
    
    # Visit the tree
    visitor = FspowVisitor()
    visitor.visit(tree, parser)

if __name__ == '__main__':
    main()
