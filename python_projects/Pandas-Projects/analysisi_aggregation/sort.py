# https://www.programiz.com/python-programming/pandas/sort

import pandas as pd

data = {'Name': ['Alice', 'Bob', 'Charlie'],
        'Age': [28, 22, 25]}
df = pd.DataFrame(data)

print("sort_values() takes ascending attribute which can be True/False - default is True")

print(" Sort by single columns ")
print(df.sort_values('Age'))
print(df.sort_values('Age', ascending=False))

print(" Sort by multiple column")
data = {'Name': ['Alice', 'Bob', 'Charlie', 'David'],
        'Age': [25, 22, 30, 22],
        'Score': [85, 90, 75, 80]}
df = pd.DataFrame(data)
print(df.sort_values(['Age', 'Score']))  # here ascending is default [True,True]
print(df.sort_values(['Age', 'Score'], ascending=[True, False]))
print("print frame with out index column \n", df.to_string(index=False))

print("******** sort by index using sort_index() *********")
df.set_index('Age', inplace=True)
print(df.sort_index())
df.reset_index(inplace=True)
print(df)
