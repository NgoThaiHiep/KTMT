# Sử dụng image postgres:15
FROM postgres:15

# Sao chép file SQL vào thư mục khởi tạo của PostgreSQL
COPY init.sql /docker-entrypoint-initdb.d/

# Thiết lập biến môi trường (mật khẩu mặc định cho user postgres)
ENV POSTGRES_PASSWORD=mysecretpassword

# Expose port 5432
EXPOSE 5432