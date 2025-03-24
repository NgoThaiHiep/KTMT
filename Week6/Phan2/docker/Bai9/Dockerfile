# Sử dụng image redis:latest
FROM redis:latest

# Tạo thư mục log và thay đổi quyền sở hữu cho user redis
RUN mkdir -p /var/log/redis && chown redis:redis /var/log/redis

# Sao chép file redis.conf vào container
COPY redis.conf /usr/local/etc/redis/redis.conf

# Expose port 6379 (port mặc định của Redis)
EXPOSE 6379

# Chạy Redis với file cấu hình tùy chỉnh
CMD ["redis-server", "/usr/local/etc/redis/redis.conf"]