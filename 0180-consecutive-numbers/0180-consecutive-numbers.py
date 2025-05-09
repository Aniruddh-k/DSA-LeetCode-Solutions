import pandas as pd

def consecutive_numbers(logs: pd.DataFrame) -> pd.DataFrame:
    l = list(logs['num'])
    c_num = []

    for i in range(2, len(l)):
        # Check if 3 consecutive numbers are the same
        if l[i] == l[i-1] == l[i-2]:
            triplet_sum = l[i] + l[i-1] + l[i-2]
            if triplet_sum % 3 == 0:
                c_num.append(l[i])
    c_num = list(set(c_num))
    return pd.DataFrame({'ConsecutiveNums': c_num})
