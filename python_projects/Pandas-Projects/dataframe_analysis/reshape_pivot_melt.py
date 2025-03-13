import pandas as pd

print("pivot - here 3 things needed"
      "1 (index) - original column whose distinct data will act as label/index"
      "2 (columns)- the original column name whose distinct data can act as columns of the pivoted frame"
      "3 (values)- the original column whose values will act as the data for the pivoted frame")

print("Pivot is used when you have duplicate data")
# create a DataFrame
data = {'Date': ['2023-08-01', '2023-08-01', '2023-08-02', '2023-08-02'],
        'Category': ['A', 'B', 'A', 'B'],
        'Value': [10, 20, 30, 40]}
df = pd.DataFrame(data)
print("original frame")
print(df)

print("index means the column that will be used as index")
print("Coumns means the column that will be used as the columns, here Category is used as Column"
      "so all the distinct values of the Category column from the original dataframe will be used as the column in the pivoted frame")
print(df.pivot(index='Date', columns='Category', values='Value'))

print("pivot_table"
      "1 (index) - the original column whose distinct data acts the index/label of the pivoted frame"
      "2 (values) - the original column whose data will be processed by the 'aggrfunc as shown below' for the data of pivoted frame"
      "3 - (aggfunc) - this will be used to evaluate the data for the pivoted frame")

print("----------- pivot-table helps in summarizing data based on a specific columns ----------")

data = {'Category': ['A', 'B', 'A', 'B', 'A', 'B'],
        'Value': [10, 20, 30, 40, 50, 60]}
frame = pd.DataFrame(data)
print("original dataframe")
print(frame)
print("We are trying to find the mean or average of Value for distinct values of category")
print(frame.pivot_table(index='Category', values='Value', aggfunc='mean'))

print("-----Use of melt()--------")
import pandas as pd

# create a sample DataFrame
data = {'Name': ['Alice', 'Bob'],
        'Math': [90, 85],
        'History': [75, 92]}
df = pd.DataFrame(data)
print("frame before melt() \n", frame)
print("frame after melt ()"
      "1 - (id_vars) - this will take the column name that will be unchanged/untouched"
      "2 - (var_name) - the new column name whose data will be the distinct column names (other than column used for id_vars) of the original frame"
      "3 - (value_name) - represents the values/data for the columns other than the column used for id_vars")
print(df.melt(id_vars='Name', var_name='Subject', value_name='Score'))
