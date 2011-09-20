-- --------------------------------------------------------
-- -----  LankaFuelMart DB DUMP  --------------------------
-- --------------------------------------------------------

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `LankaFuelMart`
--
CREATE DATABASE `LankaFuelMart` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `LankaFuelMart`;

-- --------------------------------------------------------

CREATE TABLE CreditSlipOrders
(
orderNo varchar(50),
date datetime,
company varchar(50),
vehicleNo varchar(50), 
item varchar(50),
qty varchar(50),  
rate varchar(50), 
amount varchar(50),
shift varchar(50), 
PRIMARY KEY (orderNo)
);

CREATE TABLE CreditCardOrders
(
orderNo varchar(50),
date datetime,
cardnumber varchar(50),
cardtype varchar(50), 
vehicleNo varchar(50), 
item varchar(50),
qty varchar(50),  
rate varchar(50), 
amount varchar(50),
shift varchar(50), 
PRIMARY KEY (orderNo)
);

CREATE TABLE Products
(
productId varchar(50),
item varchar(50),
unit varchar(50),  
rate varchar(50), 
lastChanged varchar(50),
PRIMARY KEY (productId)
);

CREATE TABLE Customers
(
customerId varchar(50),
customer varchar(50),
company varchar(50),
vehicles varchar(50),  
type varchar(50),  
creditLimit varchar(50),  
totalAmount varchar(50),  
address varchar(50), 
contactNo varchar(50),
PRIMARY KEY (customerId)
);

create table Login
(
strUser varchar(20) primary key,
strPass varchar(20)
);

insert into Login values ('user', 'sa');

----------------------------

select  orderNo, date, company, vehicleNo, item, qty, rate, amount, shift 
from CreditSlipOrders 
where DATE_FORMAT(date,'%Y-%m-%d')

select  orderNo, date, company, vehicleNo, item, qty, rate, amount, shift from CreditSlipOrders 
where date>'2011-09-18 00:00:00' AND date<'2011-09-19 00:00:00'


