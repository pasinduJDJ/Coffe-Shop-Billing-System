-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 03, 2022 at 03:19 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: jdjcoffeeshop
--

-- --------------------------------------------------------

--
-- Table structure for table admin
--

DROP TABLE IF EXISTS admin;
CREATE TABLE IF NOT EXISTS admin (
  admin_id int(5) NOT NULL,
  admin_name varchar(20) DEFAULT NULL,
  u_no varchar(5) DEFAULT NULL,
  PRIMARY KEY (admin_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table billreport
--

DROP TABLE IF EXISTS billreport;
CREATE TABLE IF NOT EXISTS billreport (
  item_id int(5) NOT NULL,
  item_name varchar(40) DEFAULT NULL,
  item_price int(5) DEFAULT NULL,
  item_qty int(3) DEFAULT NULL,
  item_tot int(5) DEFAULT NULL,
  bill_num int(5) DEFAULT NULL,
  PRIMARY KEY (item_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table billreport2
--

DROP TABLE IF EXISTS billreport2;
CREATE TABLE IF NOT EXISTS billreport2 (
  bill_no int(5) NOT NULL,
  dis_rate int(4) DEFAULT NULL,
  tot_bill int(10) DEFAULT NULL,
  PRIMARY KEY (bill_no)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table cashier
--

DROP TABLE IF EXISTS cashier;
CREATE TABLE IF NOT EXISTS cashier (
  cashier_id int(5) NOT NULL,
  job_id int(5) DEFAULT NULL,
  name varchar(20) DEFAULT NULL,
  tp int(13) DEFAULT NULL,
  u_no varchar(5) DEFAULT NULL,
  PRIMARY KEY (cashier_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table cashier
--

INSERT INTO cashier (cashier_id, job_id, name, tp, u_no) VALUES
(10, 101, 'Pasindu', 767066455, 'C001');

-- --------------------------------------------------------

--
-- Table structure for table item
--

DROP TABLE IF EXISTS item;
CREATE TABLE IF NOT EXISTS item (
  i_id int(5) NOT NULL,
  i_name varchar(40) DEFAULT NULL,
  i_price int(5) DEFAULT NULL,
  qty int(3) DEFAULT NULL,
  a_id int(5) DEFAULT NULL,
  PRIMARY KEY (i_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table item
--

INSERT INTO item (i_id, i_name, i_price, qty, a_id) VALUES
(1, 'Chocolate Milk Shake', 200, 10, 1),
(2, 'Vanila Cake', 500, 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table login
--

DROP TABLE IF EXISTS login;
CREATE TABLE IF NOT EXISTS login (
  user_id varchar(5) NOT NULL,
  user_name varchar(20) DEFAULT NULL,
  user_type varchar(10) DEFAULT NULL,
  password int(6) DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table login
--

INSERT INTO login (user_id, user_name, user_type, password) VALUES
('C003', 'Anuruddha', 'Cashier', 123),
('A001', 'jdj', 'Admin', 123),
('C0001', 'Pathirage@', 'Cashier', 123),
('C004', 'JDJ', 'Cashier', 123),
('C001', 'Priyanthi', 'Cashier', 123),
('C002', 'Dulanjana', 'Cashier', 234);

-- --------------------------------------------------------

--
-- Table structure for table orderdeta
--

DROP TABLE IF EXISTS orderdeta;
CREATE TABLE IF NOT EXISTS orderdeta (
  order_id int(5) NOT NULL,
  tot_amount int(10) DEFAULT NULL,
  dis_rate int(4) DEFAULT NULL,
  c_id varchar(5) DEFAULT NULL,
  PRIMARY KEY (order_id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table orderdeta
--

INSERT INTO orderdeta (order_id, tot_amount, dis_rate, c_id) VALUES
(59997, 2945, 5, 'C002');

-- --------------------------------------------------------

--
-- Table structure for table orderitem
--

DROP TABLE IF EXISTS orderitem;
CREATE TABLE IF NOT EXISTS orderitem (
  order_no int(5) DEFAULT NULL,
  item_no int(5) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
