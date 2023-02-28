
--CREATE – is used to create the database or its objects (table index, function, views, store procedure and triggers).
CREATE TABLE employee_table(
    id int NOT NULL AUTO_INCREMENT,
    name varchar(45) NOT NULL,
    occupation varchar(35) NOT NULL,
    age int NOT NULL,
    PRIMARY KEY (id));

--ALTER -is used to alter the structure of the database.
ALTER TABLE cus_tbl
ADD cus_age varchar(40) NOT NULL;

-- DROP – is used to delete objects from the database.
DROP TABLE orders;
DROP DATABASE mytestdb_copy;

-- TRUNCATE –is used to remove all records from a table, including all spaces allocated for the records are removed.
TRUNCATE TABLE customer;

-- COMMENT
SELECT CustomerName, /*City,*/ Country FROM Customers;

-- RENAME
ALTER TABLE old_table_name RENAME new_table_name;
RENAME TABLE old_table_name TO new_table_name;
RENAME TABLE products TO products_old, products_new TO products;
