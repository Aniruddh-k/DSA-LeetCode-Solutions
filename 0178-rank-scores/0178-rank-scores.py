import pandas as pd

def order_scores(scores: pd.DataFrame) -> pd.DataFrame:
    l = []
    for index,row in scores.iterrows():
        l.append(row['score'])
    l.sort(reverse = True)
    s = list(dict.fromkeys(l))
    d = {
        'score' : [],
        'rank' : []
    }
    for values in l:
        d['score'].append(values)
        d['rank'].append(s.index(values)+1)
    return pd.DataFrame(d)
