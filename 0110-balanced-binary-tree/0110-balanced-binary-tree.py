# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root is None: return True # Empty tree is balanced
        return self.bfs(root, root)

    def bfs(self, tree, start):
        queue = deque([(start, 0, None)]) # (tree, depth, parent)
        record = []
        
        while queue:
            node, depth, parent = queue.popleft()
            record.append((node, depth, parent))
            if node.left is not None:
                queue.append((node.left, depth + 1, node))
            if node.right is not None:
                queue.append((node.right, depth + 1, node))
        
        # Compute max depths
        max_depths = {}
        for node, depth, parent in reversed(record):
            # Set max depth for leaf nodes to their own depth (no children to contribute)
            if node.left is None and node.right is None:
                max_depths[node] = depth
            if parent:
            # If this node has a parent, update the parent's max depth with this node's subtree max
                max_depths[parent] = max(max_depths.get(parent, 0), max_depths[node])
            # Ensure non-leaf nodes get updated max depth
            if node.left or node.right:
                max_depths[node] = max(max_depths.get(node, 0), depth)
        
        # Compute heights depths
        heights = {}
        for node, depth, _ in record:
            heights[node] = max_depths[node] - depth
        
        # Calculate Balance
        for node, _, _ in record:
            left_height = heights.get(node.left, -1) if node.left else -1
            right_height = heights.get(node.right, -1) if node.right else -1
            if abs(left_height - right_height) > 1:
                return False
        return True