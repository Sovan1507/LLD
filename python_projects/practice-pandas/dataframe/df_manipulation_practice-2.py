import pandas as pd
from pandas.core.interchange.dataframe_protocol import Column

# add column

data = {'Name': ['John', 'Emma', 'Michael', 'Sophia'],
        'Height': [5.5, 6.0, 5.8, 5.3],
        'Qualification': ['BSc', 'BBA', 'MBA', 'BSc']}

frame = pd.DataFrame(data)

# add column
frame['City'] = ['NY', 'CAL', 'CHI', 'LA']
print(frame)

# add row
frame.loc[len(frame.index)] = ['Sovan', '5.9', 'Btech', 'BLR']
print(frame)

# remove column
frame.drop('City', axis=1, inplace=True)
print("after dropping city \n", frame)

# remove row
frame.set_index('Name', inplace=True)
frame.drop('Sophia', inplace=True)
print("After dropping Sophia default axis is 0 \n", frame)

# rename
frame.rename({'Height': 'New_Height'}, axis=1, inplace=True)
frame.rename({'Sovan': 'New_Sovan'}, inplace=True)
print("After renaming column height and row label Sovan \n", frame)
print("****** NOTE --- YOU CAN NOT RENAME INDEX COLUMN BUT CAN RENAME THE INDIVIDUAL INDEX/LABEL****")

print("************** Indexing and Slicing ******************")

data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Eve'],
    'Age': [25, 32, 18, 47, 33],
    'City': ['New York', 'Paris', 'London', 'Tokyo', 'Sydney']
}
frame = pd.DataFrame(data)
# print only Name
print(frame['Name'])
# print only Name and Age not city
print(frame[['Name', 'Age']])

print(" access using loc method ")
print('loc takes in range of row and columns')
print("Print only rows that names starts with Alice and end with Charlie")

frame.set_index('Name', inplace=True)
print(frame.loc['Alice':'Charlie', :])

print("Adding a new column")
frame['Height'] = [1, 2, 3, 4, 5]
print("print all rows that contain only City and Height")
print(frame.loc[:, 'City':'Height'])
print("print only rows that has age > 30 --  boolean indexing")
print(frame.loc[frame['Age'] > 30])

print("print rows from label Alice to David but with only City and Hright Column")
print(frame.loc['Alice':'David', 'City':'Height'])

print("********* Multi Index ****************")
data = {
    "Continent": ["North America", "Europe", "Asia", "North America", "Asia", "Europe", "North America", "Asia",
                  "Europe", "Asia"],
    "Country": ["United States", "Germany", "China", "Canada", "Japan", "France", "Mexico", "India", "United Kingdom",
                "Nepal"],
    "Population": [331002651, 83783942, 1439323776, 37742154, 126476461, 65273511, 128932753, 1380004385, 67886011,
                   29136808]
}
frame = pd.DataFrame(data)
frame.sort_values('Continent', inplace=True)
frame.set_index(['Continent', 'Country'], inplace=True)
print(frame)
print(
    "Here we have 2 level if indexing Continent and Country, Continent is the first level and country is the 2nd level "
    "you can access element by 1st level index or both 1st and 2nd level but data can not be accessed by the child index independently")
print("Access data using the parent index only \n", frame.loc['Asia'])
print("Access data using both level if index \n", frame.loc[('Asia', 'China')])
print("Accessing the data using only child index - frame.loc['China'] will fail")

print("Multi index with arrays")

# create arrays
continent = ['Asia', 'Asia', 'Asia', 'Asia', 'Europe', 'Europe', 'Europe', 'North America', 'North America',
             'North America']
country = ['China', 'India', 'Japan', 'Nepal', 'France', 'Germany', 'United Kingdom', 'Canada', 'Mexico',
           'United States']
population = [1439323776, 1380004385, 126476461, 29136808, 65273511, 83783942, 67886011, 37742154, 128932753, 331002651]

array_of_arrays = [continent, country]
multi_index = pd.MultiIndex.from_arrays(array_of_arrays, names=['Continent', 'Country'])
print(pd.DataFrame({"population": population}, index=multi_index))

print("*************** Shape**************** ")
data = {'Date': ['2023-08-01', '2023-08-01', '2023-08-02', '2023-08-02'],
        'Category': ['A', 'B', 'A', 'B'],
        'Value': [10, 20, 30, 40]}
frame = pd.DataFrame(data)
print(frame.pivot(index='Date', columns='Category', values='Value'))
print(frame.pivot_table(index='Category', values='Value', aggfunc='mean'))

data = {'Name': ['Alice', 'Bob'],
        'Math': [90, 85],
        'History': [75, 92]}
frame = pd.DataFrame(data)
frame.melt(id_vars='Name', value_name='Subject', value_vars='Score')
