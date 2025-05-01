class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        l = list(itertools.permutations(nums))
        l = list(set(l))
        return l