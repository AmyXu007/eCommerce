# -------------------------------------------------------------
# SQL Script to Create Two PizzaHutDB Tables
# -------------------------------------------------------------
Use Buy4U; 

DROP TABLE IF EXISTS Photo;

DROP TABLE IF EXISTS Products;
DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS OrderDetails;
DROP TABLE IF EXISTS ShoppingCart;
DROP TABLE IF EXISTS Products;
DROP TABLE IF EXISTS Review;
DROP TABLE IF EXISTS Customer;
/* The Customer table contains attributes of interest of a customer. */
CREATE TABLE Customer
(
    username VARCHAR (32) NOT NULL,
    password VARCHAR (32) NOT NULL,
    first_name VARCHAR (32) NOT NULL,
    middle_name VARCHAR (32),
    last_name VARCHAR (32) NOT NULL,
    cc_number VARCHAR (19) NOT NULL, /* Credit Card Number, max 19 digits */
    cc_expires VARCHAR (4) NOT NULL, /* Expiration date in MMYY format, e.g., 0523 meaning May 2023 */
    cc_security_code VARCHAR (4) NOT NULL, /* American Express 4 digits; other credit cards 3 digits */
    address1 VARCHAR (128) NOT NULL,
    address2 VARCHAR (128),
    city VARCHAR (64) NOT NULL,
    state VARCHAR (2) NOT NULL,
    zipcode VARCHAR (10) NOT NULL, /* e.g., 24060-1804 */
    email VARCHAR (128) NOT NULL,      
    PRIMARY KEY (username)
);

/* The Photo table contains attributes of interest of a customer's photo. */
CREATE TABLE Photo
(
       id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
       extension ENUM('jpeg', 'jpg', 'png') NOT NULL,
       customer_id INT UNSIGNED
);

CREATE TABLE ShoppingCart
(
	id INT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customer_username VARCHAR (32) NOT NULL,
	product_id INT UNSIGNED NOT NULL,
	count INT UNSIGNED NOT NULL
);

CREATE TABLE Orderdetails
(
  Detail_ID int(11) NOT NULL AUTO_INCREMENT,
  Detail_OrderID int(11) NOT NULL,
  Detail_ProductID int(11) NOT NULL,
  Detail_Name varchar(250) COLLATE latin1_german2_ci NOT NULL,
  Detail_Price float NOT NULL,
  Detail_Quantity int(11) NOT NULL,
  PRIMARY KEY (Detail_ID)
);
CREATE TABLE Products
(
	Products_Id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Products_Name varchar(100) COLLATE latin1_german2_ci NOT NULL,
  	Product_Price float NOT NULL,
	Product_Desc text COLLATE latin1_german2_ci NOT NULL,
	Product_Image LongBLOB NOT NULL,
  	Product_CategoryID int(11) DEFAULT NULL,
  	Product_UpdateDate DATE NOT NULL ,
  	Product_Stock int(11) DEFAULT NULL
);
CREATE TABLE Review
(
	Products_Id int(11) NOT NULL primary key,
	Review_Id int(11) Not Null,
	Review_content VARCHAR(250) NOT NULL,
	Customer_username VARCHAR (32) NOT NULL
);
CREATE TABLE Orders
(
	order_id INT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customer_username VARCHAR (32) NOT NULL,
	order_price FLOAT NOT NULL,
	order_date DATE NOT NULL,
   	order_address1 VARCHAR (128) NOT NULL,
	order_address2 VARCHAR (128),
	order_city VARCHAR (64) NOT NULL,
	order_state VARCHAR (2) NOT NULL,
	order_zipcode VARCHAR (10) NOT NULL, /* e.g., 24060-1804 */
	order_email VARCHAR (128) NOT NULL     
	
);
