import pandas as pd

date_string = '2001-12-24 12:38'
print(pd.to_datetime(date_string))

print("Add a row converting the date string to acctual datetime format")
df = pd.DataFrame({'date_str': ['2021-01-13', '2022-10-22', '2023-12-03']})
df['date_time_format'] = pd.to_datetime(df['date_str'])
print(df)

print("Add extract year, month, date, week, day of week")
df['year'] = df['date_time_format'].dt.year
df['month'] = df['date_time_format'].dt.month
df['day'] = df['date_time_format'].dt.day
df['day_name'] = df['date_time_format'].dt.day_name()
df['week'] = df['date_time_format'].dt.isocalendar().week
print(df)

print("using dat time as an index")
dates = ['2021-01-01', '2021-01-02', '2021-01-03', '2021-01-04', '2021-01-05']
frame = pd.DataFrame({"temperature": [10, 20, 30, 40, 50]}, index=pd.to_datetime(dates))
frame.index.name = 'Index'
print(frame)
