class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        digit_value = {
            2:['a','b','c'],
            3:['d','e','f'],
            4:['g','h','i'],
            5:['j','k','l'],
            6:['m','n','o'],
            7:['p','q','r','s'],
            8:['t','u','v'],
            9:['w','x','y','z']
        }
        output = []
        n = list(digits)
        for num in n:
            if int(num) in digit_value:
                output.append(digit_value[int(num)])
        combinations = list(itertools.product(*output))
        return [''.join(comb) for comb in combinations]
        
