DROP TABLE IF EXISTS PRODUCTS;
  
CREATE TABLE PRODUCTS(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  productname VARCHAR(250) NOT NULL,
  productcategory VARCHAR(250) NOT NULL,
  quantity int(8) DEFAULT NULL,
  price int(8) DEFAULT NULL
);

DROP TABLE IF EXISTS UserTransaction;
  
CREATE TABLE UserTransaction(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  userId VARCHAR(250) NOT NULL,
  transdate date
  );

DROP TABLE IF EXISTS Purchases;
  
CREATE TABLE Purchases(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  transid int (10)	,
  productid int(10),
  quantity int(8) DEFAULT NULL,
  
  taxrate int(10)
 );

DROP TABLE IF EXISTS Taxrate;
  
CREATE TABLE Taxrate(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category varchar(250),
  taxrate int(10),
 );


insert into usertransaction (userid,transdate) values ('user1',CURRENT_DATE());
insert into usertransaction (userid,transdate) values ('user2',CURRENT_DATE());
insert into usertransaction (userid,transdate) values ('user3',CURRENT_DATE());
insert into purchases (productid,quantity,taxrate,transid) values (1,1,10,1);
insert into purchases (productid,quantity,taxrate,transid) values (3,1,9,1);
insert into purchases (productid,quantity,taxrate,transid) values (7,1,15,1);
