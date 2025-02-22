import pandas as pd

print("Index acts as the unique identifiers for each row in a series and dataframe")
print("Index is used to access data with efficiency")

print("3 types of index -- default index, Setting index, Range Index")

print(" --- Default index ---")

print(
    "this is the index pandas create when no custom index are provided.. the default index is the numeric values tarting from 0")

data = {'Name': ['John', 'Alice', 'Bob'],
        'Age': [25, 28, 32],
        'City': ['New York', 'London', 'Paris']}

frame_default_index = pd.DataFrame(data)
print(frame_default_index)

print(" --  Setting index --")

print("here we can set the column values as the index, "
      "means if we set the index as Name, then the values in the Name column will act as the index, "
      "for individual records")

frame_set_index = pd.DataFrame(data)
frame_set_index.set_index('Name', inplace=True)

print("here 'Name' column itself acts as an index, No extra index column used like before")

print(frame_set_index)

print(" -- range Index --")

print("here we can set custom index with a range ex: range from 1 ro 10")
frame_range_index = pd.DataFrame(data, pd.RangeIndex(5, 8, name='Index'))
print(frame_range_index)

print("if the range exceeds the # of records in the dataframe then it will throw error like below"
      "where the datafrema has 3 records, but the range is from 5 to 10, which exceeds the # of records available"
      " so error is thrown")
# frame_range_index = pd.DataFrame(data, pd.RangeIndex(5, 10, name='Index'))

print("--- Renaming Index ---")
print("here the rename method takes in a map/dictionary which contains the mapping of existing and the new index name")
frame_index_rename = pd.DataFrame(data)
frame_index_rename.rename(index={0:'A', 1:'B'}, inplace=True)
print("here we just updated 2 indexes, the 3rd one remains the same")
print(frame_index_rename)

print("-- restting index -- THIS IS IMPORTANT ----------------- CHECK THE OUTPUT")
print(" here we have reset_index function which will add an extra index column to the frame")
frame_index_rename.reset_index(inplace=True)
print(frame_index_rename)



