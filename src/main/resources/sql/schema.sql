CREATE SCHEMA IF NOT EXISTS tableware_store;

USE tableware_store;

CREATE TABLE IF NOT EXISTS roles (
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50),
    patronymic VARCHAR(50),
    login VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    role INT,
    FOREIGN KEY (role) REFERENCES roles(role_id)
);

CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    articlenumber VARCHAR(50) NOT NULL,
    title VARCHAR(100) NOT NULL,
    details TEXT,
    category VARCHAR(50),
    photo BLOB,
    manufacturer VARCHAR(100),
    price DECIMAL(19, 4) NOT NULL,
    discount DECIMAL(5, 2),
    quantity INT NOT NULL,
    status VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(50),
    deliverydate DATE,
    pickuppoint VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS order_product (
    order_id INT,
    product_id INT,
    quantity INT NOT NULL,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO roles(role_id, role_name) VALUES (1, 'Администратор');



