# Chọn image Node.js làm base image
FROM node:14

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Sao chép package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các phụ thuộc cho ứng dụng
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Mở cổng mà ứng dụng Node.js sẽ chạy
EXPOSE 3000

# Lệnh chạy ứng dụng khi container bắt đầu
CMD ["node", "app.js"]