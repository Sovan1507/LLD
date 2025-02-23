import pandas as pd

print ("--- allows to store multiple values in a single datastructure, it provides better performance and flexibility than the python list -- ")

print("-- creating pandas array from python list")

l = [1, 2,3, 4]

print(pd.array(l))
print(pd.array([1, 2,3, 4]))

print("-- Explicitly specify the data type of the array elements")
print("-- here we have set the data with int values but the datattype is set to float")
print(pd.array([1, 2,3,4], dtype='float'))
print("-- here we have set the data with float values but the datattype is set to int")
print(pd.array([1.1, 2.2,3.3,4.4], dtype='int'))
print("-- here we have set the data with float values but the datattype is set to string")
print(pd.array([1.1, 2.2,3.3,4.4], dtype='bool'))
print("-- here we have set the data with float values but the datattype is set to string")
print(pd.array([1.1, 2.2,3.3,4.4], dtype='str'))

print("--  creating series with panda array.. this is the same way we create series with python array")
print("-- 1st column represents the index (default is the numeric vaue starting from 0), the right column represents the values of series")
print(pd.Series([1,2,3,4]))