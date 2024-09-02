CREATE TABLE IF NOT EXISTS category (
    id integer NOT NULL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id integer NOT NULL PRIMARY KEY,
    category_id integer NOT NULL,
    description VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    price NUMERIC(38, 2) NOT NULL,
    available_quantity DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE SEQUENCE IF NOT EXISTS category_seq INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS product_seq INCREMENT BY 50;