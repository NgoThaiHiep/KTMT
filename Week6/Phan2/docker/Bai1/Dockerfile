# Sử dụng node:18 làm base image
FROM node:18

# Tạo thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy file app.js vào container
COPY app.js .

# Mở cổng 3000
EXPOSE 3000

# Cài đặt các dependencies (nếu có) và chạy ứng dụng
CMD ["node", "app.js"]