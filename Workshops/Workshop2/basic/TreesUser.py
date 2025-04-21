from antlr4.Utils import escapeWhitespace
from antlr4.tree.Tree import Tree
from antlr4.tree.Trees import Trees

# need forward declaration
Parser  = None

class TreesUser(Trees):

    # Print out a whole tree in prettier form
    # Based on Trees.toStringTree()
    # indent is the number of indents to use in the display
    @classmethod
    def PrettyPrint(cls, t:Tree, ruleNames:list=None, recog:Parser=None, indent:int=0):
        # indentation is the indent to actually display
        indentation = ''
        for n in range(indent):
            indentation += '   '
        if recog is not None:
            ruleNames = recog.ruleNames
        s = escapeWhitespace(cls.getNodeText(t, ruleNames), False)
        retval = indentation + s + "\n"
        if t.getChildCount()>0:
            # we have children to deal with
            for i in range(0, t.getChildCount()):
                retval += cls.PrettyPrint(t.getChild(i), ruleNames, indent=indent+1)
        return retval
