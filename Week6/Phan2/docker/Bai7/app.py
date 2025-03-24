import os

# Đọc biến môi trường APP_ENV
app_env = os.getenv('APP_ENV')

# In giá trị biến môi trường
print(f"Application environment: {app_env}")