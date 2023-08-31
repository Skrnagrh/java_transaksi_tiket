-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 31 Agu 2023 pada 08.28
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jv_tugasutama`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `Nama` varchar(255) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Konfirmasi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`Nama`, `UserName`, `Password`, `Konfirmasi`) VALUES
('samsul', 'samsullla', '123456', '123456'),
('samsudin', 'udin', 'password', 'password');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabelkereta`
--

CREATE TABLE `tabelkereta` (
  `Kodekereta` varchar(10) NOT NULL,
  `Namakereta` varchar(255) NOT NULL,
  `Jurusan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tabelkereta`
--

INSERT INTO `tabelkereta` (`Kodekereta`, `Namakereta`, `Jurusan`) VALUES
('KA01', 'ARGOJATI', 'JAKARTA - SERANG'),
('KA01', 'ARGOJATI', 'JAKARTA - CILEGON'),
('KA02', 'ARGO PARAHYANGAN', 'JAKARTA - BOGOR'),
('KA02', 'ARGO PARAHYANGAN', 'JAKARTA - BANDUNG'),
('KA03', 'ARGO BROMO ANGGREK', 'JAKARTA - PEKALONGAN'),
('KA03', 'ARGO BROMO ANGGREK', 'JAKARTA - SEMARANG'),
('KA04', 'ARGO WILIS', 'JAKARTA - SOLO'),
('KA04', 'ARGO WILIS', 'JAKARTA - YOGYAKARTA'),
('KA05', 'GAYAMANA', 'JAKARTA - SURABAYA'),
('KA05', 'GAYAMANA', 'JAKARTA - MALANG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tablepenumpang`
--

CREATE TABLE `tablepenumpang` (
  `No` int(11) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Kodekereta` varchar(10) NOT NULL,
  `Namakereta` varchar(255) NOT NULL,
  `Jurusan` varchar(255) NOT NULL,
  `Jenistiket` varchar(255) NOT NULL,
  `Hargatiket` decimal(10,2) NOT NULL,
  `Jumlahtiket` int(11) NOT NULL,
  `TotalBayar` decimal(10,2) NOT NULL,
  `Bayar` decimal(10,2) NOT NULL,
  `kembalian` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tablepenumpang`
--

INSERT INTO `tablepenumpang` (`No`, `Nama`, `Kodekereta`, `Namakereta`, `Jurusan`, `Jenistiket`, `Hargatiket`, `Jumlahtiket`, `TotalBayar`, `Bayar`, `kembalian`) VALUES
(4, 'Ridwan', 'KA02', 'ARGO PARAHYANGAN', 'JAKARTA - BOGOR', 'Eksekutif', '100000.00', 1, '100000.00', '100000.00', '0.00'),
(111, 'Reno', 'KA01', 'ARGOJATI', 'JAKARTA - CILEGON', 'Ekonomi', '75000.00', 3, '225000.00', '300000.00', '75000.00'),
(1234, 'Mila', 'KA03', 'ARGO BROMO ANGGREK', 'JAKARTA - SEMARANG', 'Bisnis', '170000.00', 1, '170000.00', '200000.00', '30000.00'),
(1235, 'misja', 'KA03', 'ARGO BROMO ANGGREK', 'JAKARTA - PEKALONGAN', 'Ekonomi', '90000.00', 1, '90000.00', '100000.00', '10000.00');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tablepenumpang`
--
ALTER TABLE `tablepenumpang`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tablepenumpang`
--
ALTER TABLE `tablepenumpang`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12334;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
