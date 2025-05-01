class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        l = list(itertools.permutations(nums))
        return l
        