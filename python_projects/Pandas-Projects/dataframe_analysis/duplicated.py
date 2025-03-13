# https://www.programiz.com/python-programming/pandas/handle-duplicate-values

import pandas as pd

# create dataframe
data = {
    'Name': ['John', 'Anna', 'John', 'Anna', 'John'],
    'Age': [28, 24, 28, 24, 19],
    'City': ['New York', 'Las Vegas', 'New York', 'Las Vegas', 'Chicago']
}
df = pd.DataFrame(data)
print("original frame \n", df)

print("duplicated() compares all the row data by default")
print(df.duplicated())

print("if we want duplicated to compare the data for specific column then we can provide the column names as args")
print("duplicated based on 'Name' column only \n", df.duplicated(subset=['Name']))
print("duplicated based on 'Name' and 'Age' columns \n", df.duplicated(subset=['Name', 'Age']))

data = {
    'Name': ['John', 'Anna', 'John', 'Anna', 'John'],
    'Age': [28, 24, 28, 24, 19],
    'City': ['New York', 'Los Angeles', 'New York', 'Los Angeles', 'Chicago']
}
df = pd.DataFrame(data)
print("Removing Duplicates entries \n", df.drop_duplicates())
print("drop_duplicates() keeps the first unique entry and remove the subsequent duplicate entry by default"
      "however we can use keep='last' to remove the first duplicate entry and keep the last unique entry")
print("Removing Duplicates entries keeping last \n", df.drop_duplicates(keep='last'))
