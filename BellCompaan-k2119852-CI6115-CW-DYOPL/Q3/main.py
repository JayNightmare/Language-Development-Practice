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
        if tree is None:
            return None

        # Get the rule name for this node
        if tree.getChildCount() == 0:  # Terminal node
            return tree.getText()

        rule = parser.ruleNames[tree.getRuleIndex()]

        if rule == 'prog':
            # Visit all statements
            for i in range(tree.getChildCount()):
                if tree.getChild(i).getText() != '<EOF>':
                    self.visit(tree.getChild(i), parser)

        elif rule == 'assignment':
            var_name = tree.getChild(0).getText()
            value = self.visit(tree.getChild(2), parser)
            self.variables[var_name] = value
            return value

        elif rule == 'fcCreation':
            # Get the root path from the rootSpecifier
            root_path = self.visit(tree.getChild(2), parser)
            return FileCollection(root_path)

        elif rule == 'selCreation':
            # Get the filter from the selfilter
            return self.visit(tree.getChild(2), parser)

        elif rule == 'selfilter':
            # Determine which type of filter this is
            first_child = tree.getChild(0).getText()
            
            if first_child == 'name':
                return Selector.name(tree.getChild(2).getText())
            elif first_child == 'size':
                return Selector.size(tree.getChild(2).getText())
            elif first_child == 'date':
                return Selector.date(tree.getChild(2).getText())
            elif first_child == 'not':
                inner = self.visit(tree.getChild(2), parser)
                return Selector.not_(inner)
            elif first_child == '(':
                return self.visit(tree.getChild(1), parser)
            else:  # Must be an intersect operation
                left = self.visit(tree.getChild(0), parser)
                right = self.visit(tree.getChild(2), parser)
                return left.intersect(right)

        elif rule == 'fcApplySelector':
            fc_name = tree.getChild(0).getText()
            sel_name = tree.getChild(3).getText()
            if fc_name in self.variables and sel_name in self.variables:
                fc = self.variables[fc_name]
                selector = self.variables[sel_name]
                result = fc.apply(selector)
                result.list()

        elif rule == 'fcList':
            fc_name = tree.getChild(0).getText()
            if fc_name in self.variables:
                self.variables[fc_name].list()

        elif rule == 'message':
            message = tree.getChild(2).getText().strip('"')
            print(message)

        elif rule == 'expression':
            return self.visit(tree.getChild(0), parser)

        elif rule == 'rootSpecifier':
            return tree.getChild(0).getText()

        # For any other rules, just return the text
        return tree.getText()

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
    print("\nExecuting Script:")
    print("-----------------")

    # Visit the tree
    visitor = FspowVisitor()
    visitor.visit(tree, parser)

if __name__ == '__main__':
    main()
