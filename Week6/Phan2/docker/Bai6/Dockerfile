# Stage 1: Build ứng dụng
FROM node:18 AS builder

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép file package.json và cài đặt dependencies
COPY package.json .
RUN npm install

# Sao chép mã nguồn
COPY index.js .

# Stage 2: Chạy ứng dụng
FROM node:18-alpine

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép node_modules và mã nguồn đã build từ stage builder
COPY --from=builder /app/node_modules ./node_modules
COPY --from=builder /app/index.js .

# Expose port 3000
EXPOSE 3006

# Chạy ứng dụng
CMD ["node", "index.js"]