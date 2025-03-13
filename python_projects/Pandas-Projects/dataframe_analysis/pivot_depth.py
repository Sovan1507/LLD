# https://www.programiz.com/python-programming/pandas/pivot

import pandas as pd
import numpy as np

print("-------------------PIVOT----------------")

data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02'],
        'City': ['New York', 'Los Angeles', 'New York', 'Los Angeles'],
        'Temperature': [32, 75, 30, 77],
        'Humidity': [80, 10, 85, 5]}
frame = pd.DataFrame(data)

print("lets pivot with a single data: Temperature, "
      "that means the pivoted frame will only TEMPERATURE data")

print(frame.pivot(index='Date', columns='City', values='Temperature'))

print("Pivot with multiple data, here we want to show both TEMPERATURE and HUMIDITY data in the pivoted frame")
print(frame.pivot(index='Date', columns='City', values=['Temperature', 'Humidity']))

print("-------------------PIVOT_TABLE----------------")
data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02'],
        'City': ['New York', 'Los Angeles', 'New York', 'Los Angeles'],
        'Temperature': [32, 75, 30, 77],
        'Humidity': [80, 10, 85, 5]}
frame = pd.DataFrame(data)
print("***** aggfunc='mean' is by default if not set ******")
print("Pivot_table with single value=Temperature, that means the pivoted frame will hold only Temperature data")
print(frame.pivot_table(index='Date', columns='City', values='Temperature'))

print(
    "Pivot table with multiple values Temperature and Humidity, that means the pivoted frame will hold both temperature and humidity data")
print(frame.pivot_table(index='Date', columns='City', values=['Temperature', 'Humidity']))

print("------------------Multi Index----------------")
data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02', '2023-01-01', '2023-01-01', '2023-01-02',
                 '2023-01-02'],
        'City': ['New York', 'Los Angeles', 'New York', 'Los Angeles', 'Delhi', 'Chennai', 'Delhi', 'Chennai'],
        'Country': ['USA', 'USA', 'USA', 'USA', 'India', 'India', 'India', 'India'],
        'Temperature': [32, 75, 30, 77, 75, 80, 78, 79]}
data_frame = pd.DataFrame(data)
multi_index_fame = data_frame.pivot_table(index=['Country', 'City'], columns='Date', values='Temperature')
print(multi_index_fame)
print(multi_index_fame.loc['India'])
print(multi_index_fame.loc[('USA', 'New York')])

print("----------- dropna and fillvalue--------------------")
print("fill_value - will fill the NaN value with some default value")
print("dropna - by default True - this will remove the row with NaN values")
data = {'Date': ['2023-01-01', '2023-01-01', '2023-01-02', '2023-01-02', '2023-01-03', '2023-01-03', '2023-01-03'],
        'City': ['New York', 'Los Angeles', 'New York', 'Los Angeles', 'New York', 'Los Angeles', 'Chicago'],
        'Temperature': [32, 75, 30, 77, np.nan, 76, np.nan]}
df = pd.DataFrame(data)
print(df.pivot_table(index='Date', columns='City', values='Temperature', dropna=False))
print("lets fill_value with 0")
print(df.pivot_table(index='Date', columns='City', values='Temperature', dropna=False, fill_value=0.0))
