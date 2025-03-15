# https://www.programiz.com/python-programming/pandas/filtering
import pandas as pd

data = {'Name': ['Alice', 'Bob', 'Charlie', 'David'],
        'Department': ['HR', 'Marketing', 'Marketing', 'IT'],
        'Salary': [50000, 60000, 55000, 70000]}

print("*** filtering columns Name to Department ***")

print("---------Filtering using loc() loc uses the range-------")
frame = pd.DataFrame(data)
print(frame.loc[:, 'Name':'Department'])

print("---------Filtering using filter() filter uses specific columns unlike loc() which uses range--------")
print(frame.filter(items=['Name', 'Department']))

print("***** isin() usage *********")
print("***** below 2 are same *********")
print(frame.loc[frame['Salary'].isin([50000, 55000])])
print(frame[frame.Salary.isin([50000, 55000])])

print(" ******* usage of contains() ********")
print("All below 3 are same results the same")
print(frame.loc[frame['Department'].str.contains("Market")])
print(frame.loc[frame.Department.str.contains("Market")])
print(frame[frame.Department.str.contains("Market")])

print("******* query() usage ***********")
print(frame.query("Department == 'Marketing' and Salary > 55000"))
