# https://www.programiz.com/python-programming/pandas/indexing-slicing
# https://www.programiz.com/python-programming/pandas/select
import pandas as pd

# create a DataFrame
data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Eve'],
    'Age': [25, 32, 18, 47, 33],
    'City': ['New York', 'Paris', 'London', 'Tokyo', 'Sydney']
}
frame = pd.DataFrame(data)
print(frame)

print("Frame Slicing -- 1")
print(frame.loc[0:2, 'Name':'Age'])
print("Frame Slicing -- 2")
print(frame.loc[:, 'Name'])

print("Boolean indexing----3")
print(frame['Age'] > 30)
print(frame.loc[frame['Age'] > 30])

print(" slicing using query ---")
print(frame.query('Age > 30'))

print("Selecting multiple columns without index : index=False will remove the index column from frame")
age_city_ = frame.loc[:, 'Age':'City']
print(age_city_.to_string(index=False))

print("select rows with a specific list of values")
print(frame.loc[frame['City'].isin(['New York', 'London'])])
