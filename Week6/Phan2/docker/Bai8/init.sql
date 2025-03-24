-- Tạo database
CREATE DATABASE myapp;

-- Kết nối tới database vừa tạo
\c myapp

-- Tạo bảng users
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

-- Chèn dữ liệu mẫu
INSERT INTO users (username, email) VALUES
    ('user1', 'user1@example.com'),
    ('user2', 'user2@example.com');