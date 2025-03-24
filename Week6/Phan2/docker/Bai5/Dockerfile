# Sử dụng image golang để build ứng dụng
FROM golang:1.21 AS builder

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép mã nguồn vào container
COPY main.go .

# Build ứng dụng Go
RUN CGO_ENABLED=0 GOOS=linux go build -o myapp main.go

# Sử dụng image alpine nhẹ để chạy ứng dụng
FROM alpine:latest

# Sao chép file binary từ giai đoạn builder
COPY --from=builder /app/myapp /myapp

# Expose port 8080
EXPOSE 8085

# Chạy ứng dụng
CMD ["/myapp"]