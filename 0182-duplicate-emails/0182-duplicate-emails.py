import pandas as pd

def duplicate_emails(person: pd.DataFrame) -> pd.DataFrame:
    l = []
    for index,row in person.iterrows():
        l.append(row['email'])
    l.sort()
    duplicate = []
    for i in range(1,len(l)):
        if l[i-1] == l[i]:
            if l[i] not in duplicate :
                duplicate.append(l[i])
    output = {
        'Email':duplicate
    }
    return pd.DataFrame(output)
    