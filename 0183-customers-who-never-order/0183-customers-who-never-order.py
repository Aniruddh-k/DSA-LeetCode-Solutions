import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    cid = []
    oid = []
    for index,rows in customers.iterrows():
        cid.append(rows['id'])
    for index,rows in orders.iterrows():
        oid.append(rows['customerId'])
    output = []
    for value in cid:
        if value not in oid:
            output.append(customers.loc[customers['id'] == value, 'name'].iloc[0])

    d = {
        'Customers':output
    }
    return pd.DataFrame(d)
    