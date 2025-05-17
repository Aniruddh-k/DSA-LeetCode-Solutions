# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def isSymmetry(p,q):
            if p is None and q is not None:
                return False
            elif p is not None and q is None:
                return False
            elif p is None and q is None:
                return True
            else:
                if p.val!=q.val:
                    return False
            return isSymmetry(p.left,q.right) and isSymmetry(p.right,q.left)
        return isSymmetry(root.left,root.right)
        