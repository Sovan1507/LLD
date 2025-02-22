import pandas as pd

print("https://www.programiz.com/python-programming/pandas/series")
print("Series is 1D array which can hold any data type")
print("this is also represented as the column of a dataframe")
print("dtype is represents the type of the data of a series")
print("dtype is object when there are more than 1 type data in the series as shown below")
print("Indexing and Labeling as same in series.. the term is interchangebly used")

l = [1, 2, "5"]
# create series
print("Creating series from a list")
default_indexed_series = pd.Series(l)
print(default_indexed_series)

#access series
print("Accessing series by index/label 2")
print(default_indexed_series[2])

print("Default labels of the series is the numeric index/label starting from 0, as shown above")
print("however we can set our own index/label column which will act as labels as shown below.. the index/label is shown as brown i guess thats because may be the index is a optional args")

custom_indexed_series = pd.Series(l, index = ["x", "y", "z"])
print(custom_indexed_series)

print("To access the element now we have to access it via the new index/label value instead of the default numeric index/label value")
print(custom_indexed_series['z'])

print("create series from python dict")
print("here the keys will act as index/label by default, thats the advantage of using dict in series")

dict = {'a': 1, 'b': 2, 'c': 3}
series_from_dict_default_key_index = pd.Series(dict)
print(series_from_dict_default_key_index)

print("you can select the series items by their index/label names here you cant update the labels")
select_records_by_label = pd.Series(dict, index = ['b','a'])
print(select_records_by_label)



