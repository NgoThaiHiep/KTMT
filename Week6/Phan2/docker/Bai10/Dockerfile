# Sử dụng image php:8.2-apache
FROM php:8.2-apache

# Cài đặt các tiện ích cần thiết (nếu cần)
RUN apt-get update && apt-get install -y \
    && rm -rf /var/lib/apt/lists/*

# Sao chép mã nguồn từ máy host vào container
COPY ./src /var/www/html

# Cấu hình Apache
RUN chown -R www-data:www-data /var/www/html \
    && a2enmod rewrite

# Mở port 80
EXPOSE 80

# Khởi động Apache
CMD ["apache2-foreground"]