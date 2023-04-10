-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.4-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para ejemplo
CREATE DATABASE IF NOT EXISTS `ejemplo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ejemplo`;

-- Volcando estructura para tabla ejemplo.persona
CREATE TABLE IF NOT EXISTS `persona` (
  `idpersona` int(11) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `cedula` int(11) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ejemplo.persona: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`idpersona`, `nombres`, `apellidos`, `cedula`, `direccion`, `telefono`) VALUES
	(12121, 'jose', 'aroca', 123, 'sdsdsds', 4324323),
	(940655845, 'jose', 'aroca', 123456, 'centenario', 23587864),
	(123, 'Jose', 'Aroca', 12345, 'sauces', 234323);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
