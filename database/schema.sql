-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2026 at 05:33 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bfresult`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(100) NOT NULL,
  `Password` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('Admin', 'pass');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `session` varchar(50) NOT NULL,
  `student_id` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `course1code` varchar(100) NOT NULL,
  `course1name` varchar(200) NOT NULL,
  `course2code` varchar(100) NOT NULL,
  `course2name` varchar(200) NOT NULL,
  `course3code` varchar(100) NOT NULL,
  `course3name` varchar(200) NOT NULL,
  `course4code` varchar(100) NOT NULL,
  `course4name` varchar(200) NOT NULL,
  `course5code` varchar(100) NOT NULL,
  `course5name` varchar(200) NOT NULL,
  `course6code` varchar(100) NOT NULL,
  `course6name` varchar(200) NOT NULL,
  `course7code` varchar(100) DEFAULT NULL,
  `course7name` varchar(200) DEFAULT NULL,
  `course8code` varchar(100) DEFAULT NULL,
  `course8name` varchar(200) DEFAULT NULL,
  `course9code` varchar(100) DEFAULT NULL,
  `course9name` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`session`, `student_id`, `semester`, `course1code`, `course1name`, `course2code`, `course2name`, `course3code`, `course3name`, `course4code`, `course4name`, `course5code`, `course5name`, `course6code`, `course6name`, `course7code`, `course7name`, `course8code`, `course8name`, `course9code`, `course9name`) VALUES
('2019-20', 12008047, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008048, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008049, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008050, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008051, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008052, 1, 'CSE-1101', 'Computer Fundamentals ', 'CSE-1102', 'Computer Fundamentals LAB', 'CSE-1103', 'Discrete Mathematics', 'MATH-1104', 'Differential and Integral Calculus', 'CSE-1105', 'Electrical Circuits and Devices', 'CSE-1106', 'Electrical Circuits and Devices LAB', 'ENG-1107', 'Communicative English', 'CSE-1108', 'Structured Programming Language', 'CSE-1109', 'Structured Programming Language LAB'),
('2019-20', 12008047, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008048, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008049, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008050, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008051, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008052, 2, 'CSE-1201', 'Data Structures', 'CSE-1202', 'Data Structures LAB', 'CSE-1203', 'Analog Electronics', 'CSE-1204', 'Analog Electronics LAB', 'PHY-1205', 'Physics', 'MATH-1206', 'Differential Equations and Vector Analysis', 'ACCT-1207', 'Financial and Managerial Accounting', 'STAT-1208', 'Probability and Statistics', 'ECO-1209', 'Economics'),
('2019-20', 12008047, 3, 'CSE-2101', 'Algorithm Analysis and Design', 'CSE-2102', 'Algorithm Analysis and Design LAB', 'CSE-2103', 'Object Oriented Programming Language', 'CSE-2104', 'Object Oriented Programming Language LAB', 'CSE-2105', 'Digital Logic Design', 'CSE-2106', 'Digital Logic Design LAB', 'LAW-2107', 'Cyber Law and Engineering Ethics', 'MATH-2108', 'Algebra, Trigonometry and Matrices', 'BDS-2109', 'Liberation War and Bangladesh Studies'),
('2019-20', 12008048, 3, 'CSE-2101', 'Algorithm Analysis and Design', 'CSE-2102', 'Algorithm Analysis and Design LAB', 'CSE-2103', 'Object Oriented Programming Language', 'CSE-2104', 'Object Oriented Programming Language LAB', 'CSE-2105', 'Digital Logic Design', 'CSE-2106', 'Digital Logic Design LAB', 'LAW-2107', 'Cyber Law and Engineering Ethics', 'MATH-2108', 'Algebra, Trigonometry and Matrices', 'BDS-2109', 'Liberation War and Bangladesh Studies'),
('2019-20', 12008049, 3, 'CSE-2101', 'Algorithm Analysis and Design', 'CSE-2102', 'Algorithm Analysis and Design LAB', 'CSE-2103', 'Object Oriented Programming Language', 'CSE-2104', 'Object Oriented Programming Language LAB', 'CSE-2105', 'Digital Logic Design', 'CSE-2106', 'Digital Logic Design LAB', 'LAW-2107', 'Cyber Law and Engineering Ethics', 'MATH-2108', 'Algebra, Trigonometry and Matrices', 'BDS-2109', 'Liberation War and Bangladesh Studies');

-- --------------------------------------------------------

--
-- Table structure for table `course_distribution`
--

DROP TABLE IF EXISTS `course_distribution`;
CREATE TABLE IF NOT EXISTS `course_distribution` (
  `session` varchar(50) NOT NULL,
  `semester` int(11) NOT NULL,
  `Course_code` varchar(100) NOT NULL,
  `Course_title` varchar(200) NOT NULL,
  `Teacher_name` varchar(100) NOT NULL,
  `Teacher_email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `course_distribution`
--

INSERT INTO `course_distribution` (`session`, `semester`, `Course_code`, `Course_title`, `Teacher_name`, `Teacher_email`) VALUES
('2019-20', 1, 'CSE-1101', 'Computer Fundamentals ', 'Khairun Nahar', 'knahareva@gmail.com'),
('2019-20', 1, 'CSE-1102', 'Computer Fundamentals LAB', 'Khairun Nahar', 'knahareva@gmail.com'),
('2019-20', 1, 'CSE-1103', 'Discrete Mathematics', 'Aditi Sarkar', 'aditi1_cse@cou.ac.bd'),
('2019-20', 1, 'MATH-1104', 'Differential and Integral Calculus', 'Dr. Md. Abdul Hakim', 'mahakim1972@gmail.com'),
('2019-20', 1, 'CSE-1105', 'Electrical Circuits and Devices', 'Nayan Banik', 'cse.nayan@gmail.com'),
('2019-20', 1, 'CSE-1106', 'Electrical Circuits and Devices LAB', 'Nayan Banik', 'cse.nayan@gmail.com'),
('2019-20', 1, 'ENG-1107', 'Communicative English', 'Renaissance Ahmed Sayma', 'renaissance.eng09@gmail.com'),
('2019-20', 1, 'CSE-1108', 'Structured Programming Language', 'Md Abul Bashar', 'abulbashar@gmail.com'),
('2019-20', 1, 'CSE-1109', 'Structured Programming Language LAB', 'Nayan Banik', 'cse.nayan@gmail.com'),
('2019-20', 2, 'CSE-1201', 'Data Structures', 'Md. Hasan Hafizur Rahman', 'hasancse03@gmail.com'),
('2019-20', 2, 'CSE-1202', 'Data Structures LAB', 'Md. Hasan Hafizur Rahman', 'hasancse03@gmail.com'),
('2019-20', 2, 'CSE-1203', 'Analog Electronics', 'Meskat Jahan', 'mj@cou.ac.bd'),
('2019-20', 2, 'CSE-1204', 'Analog Electronics LAB', 'Meskat Jahan', 'mj@cou.ac.bd'),
('2019-20', 2, 'PHY-1205', 'Physics', 'Dr. Mohammad Julhash Miah', 'mmjulhash@yahoo.com'),
('2019-20', 2, 'MATH-1206', 'Differential Equations and Vector Analysis', 'Md. Joni Alam', 'jalamju09@gmail.com'),
('2019-20', 2, 'ACCT-1207', 'Financial and Managerial Accounting', 'Rabaya Zaman', 'rabaya07@gmail.com'),
('2019-20', 2, 'STAT-1208', 'Probability and Statistics', 'Dr. Dulal Nandi', 'nandidulalchandra@yahoo.com'),
('2019-20', 2, 'ECO-1209', 'Economics', 'Dr. Md. Shamimul Islam', 'mimul81@yahoo.com'),
('2019-20', 3, 'CSE-2102', 'Algorithm Analysis and Design LAB', 'Aditi Sarkar', 'aditi1_cse@cou.ac.bd');

-- --------------------------------------------------------

--
-- Table structure for table `lab`
--

DROP TABLE IF EXISTS `lab`;
CREATE TABLE IF NOT EXISTS `lab` (
  `student_id` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `course_code` varchar(100) NOT NULL,
  `course_title` varchar(200) NOT NULL,
  `labTest1` float NOT NULL,
  `labTest2` float NOT NULL,
  `attendance` float NOT NULL,
  `labreport` float NOT NULL,
  `labQviva` float NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `lab`
--

INSERT INTO `lab` (`student_id`, `semester`, `course_code`, `course_title`, `labTest1`, `labTest2`, `attendance`, `labreport`, `labQviva`, `total`) VALUES
(12008047, 3, 'CSE-2102', 'Algorithm Analysis and Design LAB', 10, 7, 5, 10, 5, 37),
(12008048, 3, 'CSE-2102', 'Algorithm Analysis and Design LAB', 8, 7, 5, 6, 4.5, 30.5),
(12008049, 3, 'CSE-2102', 'Algorithm Analysis and Design LAB', 10, 8, 5, 10, 5, 38);

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE IF NOT EXISTS `marks` (
  `student_id` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `course_code` varchar(100) NOT NULL,
  `course_title` varchar(200) NOT NULL,
  `mid1` float NOT NULL,
  `mid2` float NOT NULL,
  `assignment` float NOT NULL,
  `quiz` float NOT NULL,
  `presentation` float NOT NULL,
  `attendance` float NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`student_id`, `semester`, `course_code`, `course_title`, `mid1`, `mid2`, `assignment`, `quiz`, `presentation`, `attendance`, `total`) VALUES
(12008047, 1, 'CSE-1103', 'Discrete Mathematics', 9, 9, 5, 5, 5, 5, 38),
(12008048, 1, 'CSE-1103', 'Discrete Mathematics', 10, 8, 5, 5, 5, 5, 38),
(12008049, 1, 'CSE-1103', 'Discrete Mathematics', 9.5, 10, 5, 5, 5, 5, 39.5),
(12008050, 1, 'CSE-1103', 'Discrete Mathematics', 9.5, 8.5, 4.5, 5, 5, 5, 37.5),
(12008051, 1, 'CSE-1103', 'Discrete Mathematics', 9.5, 6.5, 5, 5, 5, 5, 36);

-- --------------------------------------------------------

--
-- Table structure for table `marks2`
--

DROP TABLE IF EXISTS `marks2`;
CREATE TABLE IF NOT EXISTS `marks2` (
  `student_id` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `course_code` varchar(100) NOT NULL,
  `course_title` varchar(200) NOT NULL,
  `mid1` float NOT NULL,
  `mid2` float NOT NULL,
  `attendance` float NOT NULL,
  `a_p_q` float NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `session` varchar(50) NOT NULL,
  `student_id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`session`, `student_id`, `name`, `date_of_birth`, `gender`, `email`, `phone`, `address`) VALUES
('2019-20', 12008048, 'Md Mehedi Hasan', '2000-02-07', 'Male', 'mehedihasana383@gmail.com', '01840821435', 'Cumilla'),
('2019-20', 12008049, 'Sumaia Akter Shimu', '2001-02-12', 'Female', 'sumaiashimu@gmail.com', '01647693623', 'Tangail'),
('2019-20', 12008050, 'Sumaiya Akther', '2023-12-08', 'Female', 'aktersumaiya343@gmail.com', '01601640116', 'Sylhet'),
('2019-20', 12008051, 'Md. Rakib Hossain', '2001-06-27', 'Male', 'rakibjoy@stud.cou.ac.bd', '01934740908', 'Debidwar,Chittagong'),
('2019-20', 12008052, 'Md. Naeem Uddin Khandakar', '1997-12-02', 'Male', 'naeemkhandakar570@gmail.com', '01550033858', 'Feni'),
('2019-20', 12008047, 'Joyita Ghosh', '2001-06-01', 'Female', 'ghoshjoyita38@gmail.com', '01314392349', 'Cumilla');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `name` varchar(200) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `password` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `designation`, `email`, `phone`, `password`) VALUES
('Aditi Sarkar', 'Assistant Professor', 'aditi1_cse@cou.ac.bd', '01949839301', 'aditisarkar'),
('Khairun Nahar', 'Assistant Professor', 'knahareva@gmail.com', '01916181771', 'khairunnahar'),
('Meskat Jahan', 'Assistant Professor', 'mj@cou.ac.bd', '01912194688', 'meskatjahan'),
('Mahmuda Khatun', 'Assistant Professor', 'nishucse03@gmail.com', '01686006797', 'mahmudakhatun'),
('Nayan Banik', 'Assistant Professor', 'cse.nayan@gmail.com', '01516134626', 'nayanbanik');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
