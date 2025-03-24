# Sử dụng python:3.9 làm base image
FROM python:3.9

# Tạo thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy file requirements.txt và cài đặt dependencies
COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt

# Copy app.py vào container
COPY app.py .

# Expose port 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
