FROM python:3.9

WORKDIR /app

# Sao chép file requirements.txt vào container
COPY requirements.txt ./

# Cài đặt các package Python từ requirements.txt
RUN pip install -r requirements.txt

# Sao chép toàn bộ source code còn lại vào container
COPY . .

# Mở cổng 5000 (giả sử ứng dụng Flask hoặc FastAPI)
EXPOSE 5000

# Chạy ứng dụng
CMD ["python", "app.py"]
