FROM node:18

WORKDIR /app

# Sao chép file package.json và package-lock.json (nếu có)
COPY package*.json ./

# Cài đặt dependency
RUN npm install

# Sao chép toàn bộ mã nguồn còn lại
COPY . .

# Mở cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["node", "app.js"]
