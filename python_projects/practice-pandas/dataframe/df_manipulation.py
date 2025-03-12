from turtledemo.penrose import start

import pandas as pd

data = {"name": ["a", "b"], "age": [10, 20]}

print("Create Dataframe from a dictionary.. then update the defautt index")
print("RangeIndex takes the range that is exclusive of the last index")

data_frame = pd.DataFrame(data, index=pd.RangeIndex(10, 12))

print(data_frame)

print(data_frame.info())

print(" add column to the dataframe -- > its easy since you just have to add a new key-value pair where"
      " key will act as the column name and values will act as data")

data_frame["city"] = ["ctc", "blr"]
print(data_frame)

print("printing data_frame.loc type", type(data_frame.loc))

print(" Add new row to the dataframe, that means you need to add new element to each column")

data_frame.loc[len(data_frame.index)] = ["c", "30", "bbsr"]
print(data_frame)

data = {'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Felipe', 'Rita'],
        'Age': [25, 30, 35, 40, 22, 29],
        'City': ['New York', 'London', 'Paris', 'Tokyo', 'Bogota', 'Banglore']}

# delete row  - 3 ways
df = pd.DataFrame(data)

print(" -------  after dropping index 4 -------")
df.drop(4, axis=0, inplace=True)  # delete index 4
print(df)
print(" -------after dropping index 5 -------")
df.drop(index=5, axis=0, inplace=True)  # delete index 5
print(df)
print(" -------after dropping index 1 and 3 -------")
df.drop([1, 3], axis=0, inplace=True)  # delete indexes 1 and 3
print(df)

# delete column - 3 ways
df = pd.DataFrame(data)
print(" ------- after dropping column age -------")
df.drop('Age', axis=1, inplace=True)  # delete Age column
print(df)
print(" ------- after dropping column city -------")
df.drop(columns='City', axis=1, inplace=True)  # delete City column
print(df)
print(" ------- after dropping list of columns -------")
df.drop(["Name"], axis=1, inplace=True)  # delete list of columns
print(df)

# rename rows - 2 ways
df = pd.DataFrame(data)
print("----- After renaming index 0 to x -------")
df.rename({0: "x"}, axis=0, inplace=True)
print(df)
print(" ------- After renaming index 1 to y and 2 to z simulatenously -------")
df.rename(mapper={1: "y", 2: "z"}, axis=0, inplace=True)
print(df)
# rename columns - 2 ways
print(" ------- after renaming name to new_name and city to new_city simulataneously -------")
df.rename({"Name": "new _name", "City": "new _city"}, axis=1, inplace=True)
print(df)
df.rename(mapper={"Age": " new_age"}, axis=1, inplace=True)
print(df)
