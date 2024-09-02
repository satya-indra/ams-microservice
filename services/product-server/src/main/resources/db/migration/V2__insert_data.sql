-- Insert dummy categories
INSERT INTO category (id, description, name) VALUES
(nextval('category_seq'), 'Various types of keyboards', 'Keyboards'),
(nextval('category_seq'), 'Different models of mice', 'Mice'),
(nextval('category_seq'), 'Monitors of various sizes', 'Monitors'),
(nextval('category_seq'), 'External storage devices', 'Storage Devices');

-- Insert dummy products
INSERT INTO product (id, category_id, description, name, price, available_quantity) VALUES
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Keyboards'), 'Mechanical Keyboard', 'Product 1', 50.99, 100),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Keyboards'), 'Wireless Keyboard', 'Product 2', 30.49, 200),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Mice'), 'Gaming Mouse', 'Product 3', 25.99, 150),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Mice'), 'Ergonomic Mouse', 'Product 4', 20.99, 80),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Monitors'), '4K Monitor', 'Product 5', 300.99, 60),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Monitors'), '1080p Monitor', 'Product 6', 150.00, 120),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Storage Devices'), '1TB External HDD', 'Product 7', 70.99, 300),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Storage Devices'), '512GB SSD', 'Product 8', 100.99, 50),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Keyboards'), 'Compact Keyboard', 'Product 9', 40.00, 70),
(nextval('product_seq'), (SELECT id FROM category WHERE name = 'Mice'), 'Bluetooth Mouse', 'Product 10', 18.75, 90);