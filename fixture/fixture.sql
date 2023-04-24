-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-04-2023 a las 13:44:40
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fixture`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `Id` varchar(5) NOT NULL,
  `nombre` varchar(10) NOT NULL,
  `descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`Id`, `nombre`, `descripcion`) VALUES
('ARG', 'ARGENTINA', ''),
('AUS', 'AUSTRALIA', ''),
('BEL', 'BÉLGICA', ''),
('BRA', 'BRASIL', ''),
('CAN', 'CANADÁ', ''),
('CMR', 'CAMERÚN', ''),
('CRC', 'COSTA RICA', ''),
('CRO', 'CROACIA', ''),
('DEN', 'DINAMARCA', ''),
('ECU', 'ECUADOR', ''),
('ENG', 'INGLATERRA', ''),
('ESP', 'ESPAÑA', ''),
('FRA', 'FRANCIA', ''),
('GER', 'ALEMANIA', ''),
('GHA', 'GHANA', ''),
('IRN', 'IRÁN', ''),
('JPN', 'JAPÓN', ''),
('KOR', 'COREA DEL ', ''),
('KSA', 'ARABIA S.', ''),
('MAR', 'MARRUECOS', ''),
('MEX', 'MÉXICO', ''),
('NED', 'PAÍSES BAJ', ''),
('POL', 'POLONIA', ''),
('POR', 'PORTUGAL', ''),
('QAT', 'CATAR', ''),
('SEN', 'SENEGAL', ''),
('SRB', 'SERBIA', ''),
('SUI', 'SUIZA', ''),
('TUN', 'TÚNEZ', ''),
('URU', 'URUGUAY', ''),
('USA', 'ESTADOS UN', ''),
('WAL', 'GALES', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fases`
--

CREATE TABLE `fases` (
  `Id_fase` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fases`
--

INSERT INTO `fases` (`Id_fase`, `nombre`) VALUES
(1, 'GRUPOS'),
(2, 'SEMIFINALES'),
(3, 'FINALES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participantes`
--

CREATE TABLE `participantes` (
  `id_par` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `participantes`
--

INSERT INTO `participantes` (`id_par`, `nombre`) VALUES
(1, 'Mariela'),
(2, 'Marcos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `Id` int(11) NOT NULL,
  `Fase` int(11) NOT NULL,
  `Ronda` int(11) NOT NULL,
  `Equipo1` varchar(10) NOT NULL,
  `Equipo2` varchar(10) NOT NULL,
  `Goles1` int(11) NOT NULL,
  `Goles2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partidos`
--

INSERT INTO `partidos` (`Id`, `Fase`, `Ronda`, `Equipo1`, `Equipo2`, `Goles1`, `Goles2`) VALUES
(1, 1, 1, 'ARG', 'KSA', 0, 0),
(2, 1, 1, 'POL', 'MEX', 0, 0),
(3, 1, 1, 'ARG', 'MEX', 0, 0),
(4, 1, 1, 'KSA', 'POL', 0, 0),
(5, 1, 2, 'USA', 'BRA', 0, 0),
(6, 1, 2, 'BEL', 'CAN', 0, 0),
(7, 1, 2, 'CAN', 'USA', 0, 0),
(8, 1, 2, 'BRA', 'BEL', 0, 0),
(9, 2, 1, 'ARG', 'BEL', 0, 0),
(10, 2, 2, 'BRA', 'POL', 0, 0),
(12, 3, 1, 'POL', 'BEL', 0, 0),
(13, 3, 2, 'ARG', 'BRA', 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pronostico`
--

CREATE TABLE `pronostico` (
  `id_prono` int(11) NOT NULL,
  `fase` int(11) NOT NULL,
  `ronda` int(11) NOT NULL,
  `participante` varchar(10) NOT NULL,
  `partido` varchar(10) NOT NULL,
  `equipo` varchar(10) NOT NULL,
  `resultado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pronostico`
--

INSERT INTO `pronostico` (`id_prono`, `fase`, `ronda`, `participante`, `partido`, `equipo`, `resultado`) VALUES
(1, 0, 0, '0', 'ARGKSA', 'ARG', 'GANO'),
(2, 0, 0, '0', 'POLMEX', 'MEX', 'PERDIO'),
(3, 0, 0, '0', 'ARGMEX', 'ARG', 'GANO'),
(4, 0, 0, '0', 'KSAPOL', 'POL', 'EMPATO'),
(5, 0, 0, '1', 'ARGKSA', 'ARG', 'PERDIO'),
(6, 0, 0, '1', 'POLMEX', 'MEX', 'EMPATO'),
(7, 0, 0, '1', 'ARGMEX', 'ARG', 'GANO'),
(8, 0, 0, '1', 'KSAPOL', 'POL', 'GANO'),
(10, 0, 1, '0', 'USABRA', 'BRA', 'GANO'),
(11, 0, 1, '0', 'BELCAN', 'BEL', 'EMPATO'),
(12, 0, 1, '0', 'CANUSA', 'USA', 'EMPATO'),
(13, 0, 1, '0', 'BRABEL', 'BRA', 'GANO'),
(14, 0, 1, '1', 'USABRA', 'BRA', 'GANO'),
(15, 0, 1, '1', 'BELCAN', 'BEL', 'GANO'),
(16, 0, 1, '1', 'CANUSA', 'USA', 'EMPATO'),
(17, 0, 1, '1', 'BRABEL', 'BRA', 'GANO'),
(26, 1, 0, '0', 'ARGBEL', 'ARG', 'GANO'),
(27, 1, 0, '1', 'ARGBEL', 'ARG', 'PERDIO'),
(28, 1, 1, '0', 'BRAPOL', 'BRA', 'GANO'),
(29, 1, 1, '1', 'BRAPOL', 'POL', 'PERDIO'),
(30, 2, 0, '0', 'POLBEL', 'BEL', 'PERDIO'),
(31, 2, 0, '1', 'POLBEL', 'BEL', 'GANO'),
(32, 2, 1, '0', 'ARGBRA', 'BRA', 'PERDIO'),
(33, 2, 1, '1', 'ARGBRA', 'ARG', 'GANO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rondas`
--

CREATE TABLE `rondas` (
  `id_fase` int(11) NOT NULL,
  `id_ronda` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rondas`
--

INSERT INTO `rondas` (`id_fase`, `id_ronda`, `nombre`) VALUES
(1, 1, 'GRUPO 1'),
(1, 2, 'GRUPO 2'),
(2, 1, 'SEMIFINAL 1'),
(2, 2, 'SEMIFINAL 2'),
(3, 1, '3 Y 4 PUESTO'),
(3, 2, 'FINAL');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `fases`
--
ALTER TABLE `fases`
  ADD PRIMARY KEY (`Id_fase`);

--
-- Indices de la tabla `participantes`
--
ALTER TABLE `participantes`
  ADD PRIMARY KEY (`id_par`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `pronostico`
--
ALTER TABLE `pronostico`
  ADD PRIMARY KEY (`id_prono`);

--
-- Indices de la tabla `rondas`
--
ALTER TABLE `rondas`
  ADD PRIMARY KEY (`id_fase`,`id_ronda`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `participantes`
--
ALTER TABLE `participantes`
  MODIFY `id_par` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `partidos`
--
ALTER TABLE `partidos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `pronostico`
--
ALTER TABLE `pronostico`
  MODIFY `id_prono` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
