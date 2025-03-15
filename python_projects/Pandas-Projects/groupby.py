# https://www.programiz.com/python-programming/pandas/aggregate-function
import pandas as pd

# sytax
# df.aggregate(func, axis=0, *args, **kwargs)
data = {
    'Category': ['A', 'A', 'B', 'B', 'A', 'B'],
    'Value': [10, 15, 20, 25, 30, 35]
}
frame = pd.DataFrame(data)
print("***********Below 2 Statements are equals*********")
print("Sum of all values of Value column - ", frame['Value'].aggregate('sum'))
print("Sum of all values of Value column - ", frame['Value'].sum())
print("**********Below 2 Statements are equals**********")
print("Mean of all values of Value column - ", frame['Value'].aggregate('mean'))
print("Mean of all values of Value column - ", frame['Value'].mean())

print("Group by usage on above frame")
print("Sum of values grouping by category will result in - \n", frame.groupby('Category')['Value'].agg('sum'))
print("Mean of Values grouping by category will result in - \n",
      frame.groupby('Category')['Value'].agg('mean'))
print("Sum and Mean of Vlues grouping by category will result in - \n",
      frame.groupby('Category')['Value'].agg(['sum', 'mean']))

print("Different aggregate function for different columns")
data = {
    'Category': ['A', 'A', 'B', 'B', 'A', 'B'],
    'Value1': [10, 15, 20, 25, 30, 35],
    'Value2': [5, 8, 12, 15, 18, 21]
}
data_frame = pd.DataFrame(data)
agg_func = {
    "Value1": 'sum',
    "Value2": ['mean', 'sum']
}
print(data_frame.groupby('Category').aggregate(agg_func))

print("******** Group by Multiple columns **********")
data = {
    'Gender': ['Male', 'Female', 'Male', 'Female', 'Male'],
    'Grade': ['A', 'B', 'A', 'A', 'B'],
    'Score': [90, 85, 92, 88, 78]
}
pd_data_frame = pd.DataFrame(data)
print(pd_data_frame.groupby(['Gender', 'Grade'])['Score'].sum())
agg_func = {
    "Score": ['sum', 'mean']
}
print(pd_data_frame.groupby(['Gender', 'Grade']).aggregate(agg_func))

print(" ******** Categorical Usage *******")
data = {'Category': ['A', 'B', 'A', 'B', 'A', 'B'],
        'Sales': [100, 150, 200, 50, 300, 120]}
df = pd.DataFrame(data)
df['Category'] = pd.Categorical(df['Category'])
print(df.groupby('Category', observed=False)['Sales'].sum())
