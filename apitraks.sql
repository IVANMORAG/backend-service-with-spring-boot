-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-07-2024 a las 04:50:20
-- Versión del servidor: 10.4.32-MariaDB-log
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `apitraks`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_api_traks`
--

CREATE TABLE `datos_api_traks` (
  `id` bigint(20) NOT NULL,
  `artista` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `trak` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `datos_api_traks`
--

INSERT INTO `datos_api_traks` (`id`, `artista`, `genero`, `trak`) VALUES
(1, 'Raton Vaquero', 'Noc', 'pop'),
(3, 'Lp', 'Pop', 'Lost of you');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos_api_traks`
--
ALTER TABLE `datos_api_traks`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datos_api_traks`
--
ALTER TABLE `datos_api_traks`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
