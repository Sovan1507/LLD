import pandas as pd

print("-- print function can be sued to display the dataframes, however for large dataframes the print function dusplay only fraction of the data")
print(" -- so dataframes provide its own function to get overview of the dataframe, functions sucha as, head(), tail(), info()")

data = {'Name': ['John', 'Alice', 'Bob', 'Emma', 'Mike', 'Sarah', 'David', 'Linda', 'Tom', 'Emily'],
        'Age': [25, 30, 35, 28, 32, 27, 40, 33, 29, 31],
        'City': ['New York', 'Paris', 'London', 'Sydney', 'Tokyo', 'Berlin', 'Rome', 'Madrid', 'Toronto', 'Moscow']}
df = pd.DataFrame(data)
print("-- printing the info of the dataframe")
print(df.info())
print("-- printing the 1st 3 rows of the frame using head(3)")
print(df.head(3))
print("-- by default hgead prints the 1st 5 rows of the frame")
print(df.head())


print("-- similar to head tail() is used to print print the rows from the end of the frame")
print("-- printing the last 3 rows of the frame using tail(3)")
print(df.tail(3))
print("-- printing the last 5 rows of the frame using tail()")
print(df.tail())


