import pandas as pd

# define a dictionary with sample data which includes some missing values
data = {
    'A': [1, 2, 3, None, 5],
    'B': [None, 2, 3, 4, 5],
    'C': [1, 2, None, None, 5]
}

df = pd.DataFrame(data)
print("Original frame \n", df)
print("Remove nan values - this will remove rows with atleast 1 NaN value \n", df.dropna())

print("filling NaN values with the 0 \n", df.fillna(0))
print("filling NaN values with the mean of the column values \n", df.fillna(df.mean()))
print("filling NaN values differently in different columns ")
df['A'].fillna(value=df['A'].mean())
df['B'].fillna(value=df['B'].median())
df['C'].fillna(value=df['C'].mean())
print(df)

data = {
    'A': [1, 2, 2, 3, 3, 4],
    'B': [5, 6, 6, 7, 8, 8]
}
df = pd.DataFrame(data)
df.rename({'A': 'Name', 'B': 'Age'}, axis=1, inplace=True)
print("Renaming columns \n", df)
print("Dropping duplicates \n", df.drop_duplicates(subset=['Name']))
