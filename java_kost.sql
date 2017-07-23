-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 23, 2017 at 09:06 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_kost`
--

-- --------------------------------------------------------

--
-- Table structure for table `det_fasilitas`
--

CREATE TABLE `det_fasilitas` (
  `kd_kamar` varchar(8) NOT NULL,
  `kd_fasilitas` varchar(8) NOT NULL,
  `total_biaya_tambahan` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `det_fasilitas`
--

INSERT INTO `det_fasilitas` (`kd_kamar`, `kd_fasilitas`, `total_biaya_tambahan`) VALUES
('K-01', 'FAS-01', 0);

-- --------------------------------------------------------

--
-- Table structure for table `det_transaksi`
--

CREATE TABLE `det_transaksi` (
  `kd_transaksi` varchar(8) NOT NULL,
  `kd_pelanggan` varchar(8) NOT NULL,
  `total_bulan` int(11) NOT NULL,
  `total` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `det_transaksi`
--

INSERT INTO `det_transaksi` (`kd_transaksi`, `kd_pelanggan`, `total_bulan`, `total`) VALUES
('BYR0001', 'PEL0001', 1, 500000),
('BYR0002', 'PEL0002', 1, 500000),
('BYR0003', 'PEL0003', 1, 750000);

-- --------------------------------------------------------

--
-- Stand-in structure for view `test`
-- (See below for the actual view)
--
CREATE TABLE `test` (
`kd_transaksi` varchar(8)
,`total` bigint(20)
,`nama_lengkap` varchar(50)
);

-- --------------------------------------------------------

--
-- Table structure for table `t_fasilitas`
--

CREATE TABLE `t_fasilitas` (
  `kd_fasilitas` varchar(8) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `biaya_tambahan` bigint(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_fasilitas`
--

INSERT INTO `t_fasilitas` (`kd_fasilitas`, `nama`, `biaya_tambahan`, `stok`) VALUES
('FAS-01', 'Bed', 0, 20);

-- --------------------------------------------------------

--
-- Table structure for table `t_kamar`
--

CREATE TABLE `t_kamar` (
  `kd_kamar` varchar(8) NOT NULL,
  `luas_kamar` varchar(10) NOT NULL,
  `harga_bulanan` bigint(20) NOT NULL,
  `tgl_habis` date DEFAULT NULL,
  `kd_pemilik` varchar(8) NOT NULL,
  `kd_pelanggan` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_kamar`
--

INSERT INTO `t_kamar` (`kd_kamar`, `luas_kamar`, `harga_bulanan`, `tgl_habis`, `kd_pemilik`, `kd_pelanggan`) VALUES
('K-01', '3.5X2.5 M', 500000, '2017-07-25', 'P1', 'PEL0001'),
('K-02', '3.5X2.5 M', 500000, '2017-07-24', 'P1', 'PEL0002'),
('K-03', '4.5X3.5 M', 750000, '2017-07-27', 'P1', 'PEL0003');

-- --------------------------------------------------------

--
-- Table structure for table `t_pelanggan`
--

CREATE TABLE `t_pelanggan` (
  `kd_pelanggan` varchar(8) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `jenis_kelamin` enum('P','W') NOT NULL,
  `alamat_asal` varchar(160) NOT NULL,
  `pekerjaan` varchar(12) NOT NULL,
  `tgl_sewa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pelanggan`
--

INSERT INTO `t_pelanggan` (`kd_pelanggan`, `nama_lengkap`, `jenis_kelamin`, `alamat_asal`, `pekerjaan`, `tgl_sewa`) VALUES
('PEL0001', 'Lingga Pangestu', 'P', 'Jalan Cicabe ', 'Pelajar', '2017-06-25'),
('PEL0002', 'M. Afif', 'W', 'Jl, Cinta citata No.1010011101 Bandung', 'Pelajar', '2017-06-24'),
('PEL0003', 'Insan Nasuha', 'W', 'Jl. Kita Bersama Selamanya No. 99FF Bandung', 'Pelajar', '2017-06-27');

-- --------------------------------------------------------

--
-- Table structure for table `t_pemilik`
--

CREATE TABLE `t_pemilik` (
  `kd_pemilik` varchar(8) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` varchar(160) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pemilik`
--

INSERT INTO `t_pemilik` (`kd_pemilik`, `nama_lengkap`, `no_telp`, `alamat`, `username`, `password`) VALUES
('P1', 'John Doe', '083821787756', 'Jl. Jalan, Bandung 40283 RT 01/01 No. 1', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `t_transaksi`
--

CREATE TABLE `t_transaksi` (
  `kd_transaksi` varchar(8) NOT NULL,
  `tgl_bayar` date NOT NULL,
  `kd_pemilik` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `t_transaksi`
--

INSERT INTO `t_transaksi` (`kd_transaksi`, `tgl_bayar`, `kd_pemilik`) VALUES
('BYR0001', '2017-07-01', 'P1'),
('BYR0002', '2017-06-24', 'P1'),
('BYR0003', '2017-06-27', 'P1');

-- --------------------------------------------------------

--
-- Structure for view `test`
--
DROP TABLE IF EXISTS `test`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `test`  AS  select `t_transaksi`.`kd_transaksi` AS `kd_transaksi`,`det_transaksi`.`total` AS `total`,`t_pelanggan`.`nama_lengkap` AS `nama_lengkap` from ((`det_transaksi` join `t_transaksi` on((`det_transaksi`.`kd_transaksi` = `t_transaksi`.`kd_transaksi`))) join `t_pelanggan` on((`det_transaksi`.`kd_pelanggan` = `t_pelanggan`.`kd_pelanggan`))) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `det_fasilitas`
--
ALTER TABLE `det_fasilitas`
  ADD KEY `kd_kamar` (`kd_kamar`),
  ADD KEY `kd_fasilitas` (`kd_fasilitas`);

--
-- Indexes for table `det_transaksi`
--
ALTER TABLE `det_transaksi`
  ADD KEY `kd_transaksi` (`kd_transaksi`),
  ADD KEY `kd_pelanggan` (`kd_pelanggan`);

--
-- Indexes for table `t_fasilitas`
--
ALTER TABLE `t_fasilitas`
  ADD PRIMARY KEY (`kd_fasilitas`);

--
-- Indexes for table `t_kamar`
--
ALTER TABLE `t_kamar`
  ADD PRIMARY KEY (`kd_kamar`),
  ADD KEY `kd_pelanggan` (`kd_pelanggan`),
  ADD KEY `kd_pemilik` (`kd_pemilik`);

--
-- Indexes for table `t_pelanggan`
--
ALTER TABLE `t_pelanggan`
  ADD PRIMARY KEY (`kd_pelanggan`);

--
-- Indexes for table `t_pemilik`
--
ALTER TABLE `t_pemilik`
  ADD PRIMARY KEY (`kd_pemilik`);

--
-- Indexes for table `t_transaksi`
--
ALTER TABLE `t_transaksi`
  ADD PRIMARY KEY (`kd_transaksi`),
  ADD KEY `kd_pemilik` (`kd_pemilik`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `det_fasilitas`
--
ALTER TABLE `det_fasilitas`
  ADD CONSTRAINT `det_fasilitas_ibfk_1` FOREIGN KEY (`kd_kamar`) REFERENCES `t_kamar` (`kd_kamar`),
  ADD CONSTRAINT `det_fasilitas_ibfk_2` FOREIGN KEY (`kd_fasilitas`) REFERENCES `t_fasilitas` (`kd_fasilitas`);

--
-- Constraints for table `det_transaksi`
--
ALTER TABLE `det_transaksi`
  ADD CONSTRAINT `det_transaksi_ibfk_1` FOREIGN KEY (`kd_transaksi`) REFERENCES `t_transaksi` (`kd_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `det_transaksi_ibfk_2` FOREIGN KEY (`kd_pelanggan`) REFERENCES `t_pelanggan` (`kd_pelanggan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `t_kamar`
--
ALTER TABLE `t_kamar`
  ADD CONSTRAINT `t_kamar_ibfk_1` FOREIGN KEY (`kd_pemilik`) REFERENCES `t_pemilik` (`kd_pemilik`),
  ADD CONSTRAINT `t_kamar_ibfk_2` FOREIGN KEY (`kd_pelanggan`) REFERENCES `t_pelanggan` (`kd_pelanggan`);

--
-- Constraints for table `t_transaksi`
--
ALTER TABLE `t_transaksi`
  ADD CONSTRAINT `t_transaksi_ibfk_1` FOREIGN KEY (`kd_pemilik`) REFERENCES `t_pemilik` (`kd_pemilik`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
