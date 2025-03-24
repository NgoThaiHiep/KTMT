# Sử dụng image nginx mới nhất
FROM nginx:latest

# Sao chép file index.html vào thư mục phục vụ của nginx
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Chạy nginx ở foreground
CMD ["nginx", "-g", "daemon off;"]