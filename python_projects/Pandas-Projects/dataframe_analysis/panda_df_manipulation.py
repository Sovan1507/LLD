import pandas as pd

print(" -- here we will modify the frame such as add, delete, modify rows and columns in the frame ")

print("--- add a new column")

# define a dictionary containing student data
data = {'Name': ['John', 'Emma', 'Michael', 'Sophia'],
        'Height': [5.5, 6.0, 5.8, 5.3],
        'Qualification': ['BSc', 'BBA', 'MBA', 'BSc']}

print(
    " -- add anew column called address, NOTE - THE NEW COLUMN LENGTH SHOULD MATCH THE EXISTING COLUMN LENGTH, HERE ITS 4")
address = ["NY", "LDN", "DEL", 'CAL']
frame = pd.DataFrame(data)
frame['Address'] = address
print("-- frame after adding a new column")
print(frame)

print("-- add row to the datafreme, which is not as easy as adding columns, "
      "since adding columns is same as adding new key value pair in the map, but "
      "adding row means we need to add data to each existing columns/entry of the map")
print("-- so adding row is done is using loc()"
      "step-1 get the current length of the frame using frame.len() "
      "step-2 add the new row at the index frame[frame.len()]")

frame.loc[len(frame.index)] = ["sovan", 5.8, "Btech", "Blr"]
print("-- frame after adding a new row")
print(frame)

print("NOTE ----- Once the column is set as an index, "
      "then that column wont be counted when you are trying to add a new row to dataframe")
frame.set_index('Name', inplace=True)
print("after seeting Name column as index : ")
print(frame)
frame.set_index('Height', inplace=True)
print("after overriding Name with Height column as index , the Name index column will be removed from the frame ")
print(frame)

print("now lets try to add a row to the frame -- this will pass ----")
frame.loc[len(frame.index)] = ["b-tech", "blr"]
print(frame)

print("NOW LETS TRY TO ADD A ROW TO THE FRAME ****** THIS WILL FAIL SO COMMENTED *******")
# frame.loc[len(frame.index)] = ["titikshya", 5.4, "b-tech", "blr"]
# print(frame)

print("-- Dropping rows and columns")

# create a sample DataFrame
data = {'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Felipe', 'Rita'],
        'Age': [25, 30, 35, 40, 22, 29],
        'City': ['New York', 'London', 'Paris', 'Tokyo', 'Bogota', 'Banglore']}
data_frame = pd.DataFrame(data)

print("-- dropping row with index 4, by default the index will be treated as row index")
data_frame.drop(4, axis=0, inplace=True)
print("--  above statement can also be written as below 2, "
      "since the index provided will ve treated as row index unless explicitly mentioned as column index")
# data_frame.drop(4, inplace=True)
# data_frame.drop(index=4, inplace=True)
print("-- Dropping mulriple rows")
data_frame.drop([1, 3], axis=0, inplace=True)
print(data_frame)

print("-- deleting columns")
data = {'Name': ['Alice', 'Bob', 'Charlie', 'David'],
        'Age': [25, 30, 35, 40],
        'City': ['New York', 'London', 'Paris', 'Tokyo'],
        'Height': ['165', '178', '185', '171'],
        'Profession': ['Engineer', 'Entrepreneur', 'Unemployed', 'Actor'],
        'Marital Status': ['Single', 'Married', 'Divorced', 'Engaged']}

pd_data_frame = pd.DataFrame(data)
print("--- in order to delete the column we need to provide the column name and axis=1")
pd_data_frame.drop('Age', axis=1, inplace=True)
print("--- the above command can also be written as below")
# pd_data_frame.drop(columns='Age', axis=1, inplace=True)
print("-- dropping multiple columns")
pd_data_frame.drop(['Height', 'Marital Status'], axis=1, inplace=True)

print(
    "--  Rename column labels, it willuse the rename function")
data = {'Name': ['Alice', 'Bob', 'Charlie', 'David'],
        'Age': [25, 30, 35, 40],
        'City': ['New York', 'London', 'Paris', 'Tokyo']}
d = pd.DataFrame(data)
print("-- renaming single column using columns tag, so we dont need to use the axis=1")
d.rename(columns={'Name': 'First Name'}, inplace=True)
print("-- here we are trying to rename multiple columns using mapper so we have to use axis=1")
d.rename(mapper={'Age': 'Age_Num', 'City': 'Address'}, axis=1, inplace=True)
print(d)

print("-- Rename row label, its also called as index")
print("Renaming Index column name is not possible .. lets try that")
print("--- making City as index --")
d.set_index("Address", inplace=True)
print("---- Renaming index column 'City' to 'New_City' -- this not going to have any effect-----")
d.rename({"Address": "New_Address"}, axis=1, inplace=True)
print(d)