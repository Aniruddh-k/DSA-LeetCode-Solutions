# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        queue=deque([root])
        c=0
        while queue:
            size=len(queue)
            if size>=1:
                c+=1
            for i in range(size):
                m=queue.popleft()
                if m.left:
                    queue.append(m.left)
                if m.right:
                    queue.append(m.right)
        return c
