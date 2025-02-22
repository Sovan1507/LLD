import pandas as pd

print("Dataframe is 2d array or combination of multiple series. where each column represents a series")
print("here also each records is indexed by default with numeric values starting 0")

print("Creating empty dataframe")

print(pd.DataFrame())

data = {'Name': ['John', 'Alice', 'Bob'],
        'Age': [25, 30, 35],
        'City': ['New York', 'London', 'Paris']}

print("Create dataframe from a dictionary")
frame_from_map = pd.DataFrame(data)
print(frame_from_map)

print("Unlike Series where the dictionary keys acts as the labels for the data, here the keys acts as the column names for the data")

print("Creating dataframe using list")
print("Since List has no way to provide dataframe column labels (Unlike dictionary, "
      "where the key act as the column names for the dataframe), "
      "for list we need to provide the column names, else the default column labels will be assigned")
data = [['John', 25, 'New York'],
        ['Alice', 30, 'London'],
        ['Bob', 35, 'Paris']]

print("Dataframe created from  List with default column names")
data_frame_from_list = pd.DataFrame(data)
print(data_frame_from_list)
print("Dataframe created from List with custom column names")
data_frame_from_list = pd.DataFrame(data, columns=['Name', 'Age', 'Address'])
print(data_frame_from_list)

print("Creating dataframe from the CSV")
csv_frame = pd.read_csv(r'C:\Users\sovan\Downloads\ODI_Analytics.csv')
csv_frame.head


