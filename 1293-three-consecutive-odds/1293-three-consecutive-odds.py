class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        oddC = 0
        for i in range(len(arr)):
            if arr[i]%2 != 0:
                oddC +=1
                if oddC == 3:
                    return True
            else:
                oddC = 0
        return False