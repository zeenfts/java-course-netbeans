-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2019 at 07:04 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsimulasiabsen`
--

-- --------------------------------------------------------

--
-- Table structure for table `datadosen`
--

CREATE TABLE `datadosen` (
  `NIDN` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Mata Kuliah diampu` varchar(50) NOT NULL,
  `Jurusan` varchar(50) NOT NULL,
  `Fakultas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datadosen`
--

INSERT INTO `datadosen` (`NIDN`, `Nama`, `Status`, `Mata Kuliah diampu`, `Jurusan`, `Fakultas`) VALUES
('100049001', 'Qomar ', 'Dosen', 'Algoritma dan Pemrograman A', 'Sistem Informasi', 'Rekayasa Industri'),
('100049101', 'Jennie', 'Dosen', 'Kepemimpinan dan Keterampilan Interpersonal', 'Sistem Informasi', 'Rekayasa Industri'),
('100049201', 'Michael', 'Dosen', 'Perilaku Organisasi', 'Sistem Informasi', 'Rekayasa Industri'),
('100049301', 'Vika', 'Dosen', 'Bahasa Indonesia', 'Sistem Informasi', 'Rekayasa Industri'),
('100049701', 'Lisa', 'Dosen', 'Matriks dan Ruang Vektor', 'Sistem Informasi', 'Rekayasa Industri'),
('2323', 'Aufa', 'sdsd', 'sffsf', 'Adbis', 'fkb');

-- --------------------------------------------------------

--
-- Table structure for table `datamahasiswa`
--

CREATE TABLE `datamahasiswa` (
  `NIM` varchar(10) NOT NULL,
  `Nama Mahasiswa` varchar(50) NOT NULL,
  `Kelas` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Jenis Kelamin` varchar(50) NOT NULL,
  `Jurusan` varchar(50) NOT NULL,
  `Fakultas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datamahasiswa`
--

INSERT INTO `datamahasiswa` (`NIM`, `Nama Mahasiswa`, `Kelas`, `Status`, `Jenis Kelamin`, `Jurusan`, `Fakultas`) VALUES
('1212490001', 'Zayn Fachri', 'SI-100-01', 'Mahasiswa', 'Laki-Laki', 'Sistem Informasi', 'Rekayasa Industri'),
('1212490041', 'Ahmad Moussa', 'SI-100-02', 'Mahasiswa', 'Laki-Laki', 'Sistem Informasi', 'Rekayasa Industri'),
('1212490081', 'Jennifer Hezn', 'SI-100-03', 'Mahasiswa', 'Perempuan', 'Sistem Informasi', 'Rekayasa Industri'),
('1212490121', 'Maryam Peshkova', 'SI-100-04', 'Mahasiswa', 'Perempuan', 'Sistem Informasi', 'Rekayasa Industri'),
('123104205', 'Saya', 'sdd', '2323sf', 'dffdf', '23', 'ddff');

-- --------------------------------------------------------

--
-- Table structure for table `datamatakuliah`
--

CREATE TABLE `datamatakuliah` (
  `Hari` varchar(50) NOT NULL,
  `Waktu` varchar(50) NOT NULL,
  `Kode` varchar(50) NOT NULL,
  `Mata Kuliah` varchar(50) NOT NULL,
  `Ruangan` varchar(50) NOT NULL,
  `s_num` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datamatakuliah`
--

INSERT INTO `datamatakuliah` (`Hari`, `Waktu`, `Kode`, `Mata Kuliah`, `Ruangan`, `s_num`) VALUES
('Senin', '07.30-10.30', 'ISH1E3', 'Algoritma dan Pemrograman A', 'KU3.07.07', 1),
('Senin', '13.30-15.30', 'LUH1A2', 'Bahasa Indonesia', 'KU3.14.14', 2),
('Senin', '16.30-18.30', 'ISH1F1', 'Praktikum Algoritma dan Pemrograman A', 'KU2.07.01', 3),
('Selasa', '08.30-11.30', 'SEH1F3', 'Probabilitas dan Statistika', 'KU3.14.07', 4),
('Selasa', '13.30-16.30', 'ISH1G3', 'Perilaku Organisasi', 'KU3.07.14', 5),
('Kamis', '07.30-10.30', 'HUH1G3', 'Pancasila dan Kewarganegaraan', 'KU2.14.01', 6),
('Kamis', '13.00-16.00', 'MUH1G3', 'Matriks dan Ruang Vektor', 'KU3.07.01', 7),
('Sabtu', '08.30-11.30', 'ISH1C3', 'Kepemimpinan dan Keterampilan Interpersonal', 'KU3.14.01', 8),
('efefef', '343', 'ddfdfdfdfdf', '3434', 'dfdfdf', 9);

-- --------------------------------------------------------

--
-- Table structure for table `logindb`
--

CREATE TABLE `logindb` (
  `Username` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Surname` varchar(50) NOT NULL,
  `Id No.` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logindb`
--

INSERT INTO `logindb` (`Username`, `Status`, `Password`, `FullName`, `Surname`, `Id No.`) VALUES
('Admin01', 'Admin', '098poi', 'Gama', '', 'wwee2'),
('asdfg', 'Mahasiswa', '0987', 'Zayn Fachri', '', '1212490001'),
('kiopl', 'Mahasiswa', '4567', 'Maryam Peshkova', '', '1212490121'),
('mnhj', 'Mahasiswa', '1234', 'Jennifer Hezn', '', '1212490081'),
('qweee', 'Dosen', '1212', 'Lisa', '', '100049701'),
('qwery', 'Dosen', '12345', 'Mina', '', '100049101');

-- --------------------------------------------------------

--
-- Table structure for table `rfidcard`
--

CREATE TABLE `rfidcard` (
  `Rfid Reader No` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Id No.` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Mata Kuliah` varchar(50) NOT NULL,
  `Tanggal Tap` varchar(50) NOT NULL,
  `Waktu Tap` varchar(50) NOT NULL,
  `Ruangan` varchar(50) NOT NULL,
  `Kehadiran` varchar(10) NOT NULL,
  `s_num` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rfidcard`
--

INSERT INTO `rfidcard` (`Rfid Reader No`, `Status`, `Id No.`, `Name`, `Mata Kuliah`, `Tanggal Tap`, `Waktu Tap`, `Ruangan`, `Kehadiran`, `s_num`) VALUES
('rfidReader 2', 'Dosen', '100044001', 'Qomar', 'Algoritma dan Pemrograman A', 'Monday, 22/04/2019 ', '6.12.13 WIB', 'KU3.07.07', 'Hadir', 18),
('rfidReader 2', 'Mahasiswa', '1212490081', 'Jennifer Hezn', 'Algoritma dan Pemrograman A', 'Monday, 22/04/2019 ', '6.24.22 WIB', 'KU3.07.07', 'Hadir', 21),
('rfidReader 5', 'Dosen', '100049301', 'Vika', 'Bahasa Indonesia', 'Monday, 22/04/2019 ', '8.34.31 WIB', 'KU3.14.14', 'Hadir', 22),
('rfidReader 4', 'Dosen', '100049101', 'Jennie', 'Kepemimpinan dan Keterampilan Interpersonal', 'Monday, 22/04/2019 ', '8.35.0 WIB', 'KU3.14.01', 'Hadir', 23),
('rfidReader 4', 'Dosen', '100049701', 'Lisa', 'Matriks dan Ruang Vektor', 'Wednesday, 24/04/2019 ', '12.17.19 WIB', 'KU3.07.01', 'Hadir', 24),
('rfidReader 4', 'Mahasiswa', '1212490001', 'Zayn Fachri', 'Matriks dan Ruang Vektor', 'Wednesday, 24/04/2019 ', '12.46.56 WIB', 'KU3.07.01', 'Hadir', 25),
('rfidReader 2', 'Dosen', '100049101', 'Jennie', 'Kepemimpinan dan Keterampilan Interpersonal', 'Wednesday, 24/04/2019 ', '14.20.39 WIB', 'KU3.14.01', 'Hadir', 26),
('rfidReader 4', 'Mahasiswa', '1212490121', 'Maryam Peshkova', 'Matriks dan Ruang Vektor', 'Wednesday, 24/04/2019 ', '15.6.8 WIB', 'KU3.07.01', 'Hadir', 27),
('rfidReader 4', 'Mahasiswa', '1212490081', 'Jennifer Hezn', 'Matriks dan Ruang Vektor', 'Wednesday, 24/04/2019 ', '15.6.30 WIB', 'KU3.07.01', 'Hadir', 28),
('rfidReader 4', 'Mahasiswa', '1212490121', 'Maryam Peshkova', 'Matriks dan Ruang Vektor', 'Wednesday, 24/04/2019 ', '17.10.41 WIB', 'KU3.07.01', 'Hadir', 29),
('rfidReader 5', 'Dosen', '100049101', 'Jennie', 'Kepemimpinan dan Keterampilan Interpersonal', 'Wednesday, 24/04/2019 ', '17.16.52 WIB', 'KU3.14.01', 'Hadir', 30),
('rfidReader 5', 'Mahasiswa', '1212490001', 'Zayn Fachri', 'Kepemimpinan dan Keterampilan Interpersonal', 'Wednesday, 24/04/2019 ', '17.17.56 WIB', 'KU3.14.01', 'Hadir', 31),
('rfidReader 1', 'Dosen', '100049701', 'Lisa', 'Matriks dan Ruang Vektor', 'Thursday, 25/04/2019 ', '13.9.42 WIB', 'KU3.07.01', 'Hadir', 32),
('rfidReader 1', 'Mahasiswa', '1212490121', 'Maryam Peshkova', 'Matriks dan Ruang Vektor', 'Thursday, 25/04/2019 ', '13.10.9 WIB', 'KU3.07.01', 'Hadir', 33),
('rfidReader 1', 'Mahasiswa', '1212490081', 'Jennifer Hezn', 'Matriks dan Ruang Vektor', 'Thursday, 25/04/2019 ', '13.38.24 WIB', 'KU3.07.01', 'Hadir', 34),
('rfidReader 4', 'Dosen', '100049701', 'Lisa', 'Matriks dan Ruang Vektor', 'Saturday, 27/04/2019 ', '6.53.33 WIB', 'KU3.07.01', '', 35),
('rfidReader 4', 'Mahasiswa', '1212490121', 'Maryam Peshkova', 'Matriks dan Ruang Vektor', 'Saturday, 27/04/2019 ', '6.53.53 WIB', 'KU3.07.01', '', 36),
('rfidReader 4', 'Mahasiswa', '1212490081', 'Jennifer Hezn', 'Matriks dan Ruang Vektor', 'Saturday, 27/04/2019 ', '6.54.31 WIB', 'KU3.07.01', '', 37);

-- --------------------------------------------------------

--
-- Table structure for table `rfidreader`
--

CREATE TABLE `rfidreader` (
  `s_num` int(11) NOT NULL,
  `Serial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rfidreader`
--

INSERT INTO `rfidreader` (`s_num`, `Serial`) VALUES
(1, 'rfidReader 1'),
(2, 'rfidReader 2'),
(3, 'rfidReader 3'),
(4, 'rfidReader 4'),
(5, 'rfidReader 5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datadosen`
--
ALTER TABLE `datadosen`
  ADD PRIMARY KEY (`NIDN`);

--
-- Indexes for table `datamahasiswa`
--
ALTER TABLE `datamahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `datamatakuliah`
--
ALTER TABLE `datamatakuliah`
  ADD PRIMARY KEY (`s_num`);

--
-- Indexes for table `logindb`
--
ALTER TABLE `logindb`
  ADD PRIMARY KEY (`Username`),
  ADD KEY `Username` (`Username`),
  ADD KEY `Username_2` (`Username`);

--
-- Indexes for table `rfidcard`
--
ALTER TABLE `rfidcard`
  ADD PRIMARY KEY (`s_num`);

--
-- Indexes for table `rfidreader`
--
ALTER TABLE `rfidreader`
  ADD PRIMARY KEY (`s_num`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datamatakuliah`
--
ALTER TABLE `datamatakuliah`
  MODIFY `s_num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `rfidcard`
--
ALTER TABLE `rfidcard`
  MODIFY `s_num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `rfidreader`
--
ALTER TABLE `rfidreader`
  MODIFY `s_num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
