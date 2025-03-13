# https://www.programiz.com/python-programming/pandas/multiindex
import pandas as pd
from numpy.f2py.crackfortran import include_paths

# create a dictionary
data = {
    "Continent": ["North America", "Europe", "Asia", "North America", "Asia", "Europe", "North America", "Asia",
                  "Europe", "Asia"],
    "Country": ["United States", "Germany", "China", "Canada", "Japan", "France", "Mexico", "India", "United Kingdom",
                "Nepal"],
    "Population": [331002651, 83783942, 1439323776, 37742154, 126476461, 65273511, 128932753, 1380004385, 67886011,
                   29136808]
}

print("Multi index is used when we have duplicate data in random order. like below")
frame = pd.DataFrame(data)
print(frame)

print("If you notice the continent column has duplicate values at random index, lets sort that")
frame.sort_values('Continent', inplace=True)
print("After sorting by Continent, the frame would be like below")
print(frame)
print(
    "Setting index as the combination of the Continent and Country, because here the Continent and Country combination is unique")
frame.set_index(['Continent', 'Country'], inplace=True)
print("After Setting Index.. frame would be like below")
print(frame)

print(
    "lets access the elements now using Continent.. Note access by Country will not work - since Country is the child of continent, refer to the https://www.programiz.com/python-programming/pandas/multiindex")
print(frame.loc['Asia'])
print("lets access the elements now using the combination of Continent and Country")
print(frame.loc[('Asia', 'China')])

print("multi index from array ")
continent = ['Asia', 'Asia', 'Asia', 'Asia', 'Europe', 'Europe', 'Europe', 'North America', 'North America',
             'North America']
country = ['China', 'India', 'Japan', 'Nepal', 'France', 'Germany', 'United Kingdom', 'Canada', 'Mexico',
           'United States']
population = [1439323776, 1380004385, 126476461, 29136808, 65273511, 83783942, 67886011, 37742154, 128932753, 331002651]

arrays = [continent, country]
multi_index_arrays = pd.MultiIndex.from_arrays(arrays, names=["Continent", "Country"])
print(pd.DataFrame({"pop": population}, index=multi_index_arrays))
