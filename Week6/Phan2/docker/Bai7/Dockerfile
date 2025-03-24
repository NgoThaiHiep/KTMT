# Sử dụng image python chính thức
FROM python:3.9-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép mã nguồn
COPY app.py .

# Thiết lập biến môi trường
ENV APP_ENV=development

# Chạy ứng dụng
CMD ["python", "app.py"]