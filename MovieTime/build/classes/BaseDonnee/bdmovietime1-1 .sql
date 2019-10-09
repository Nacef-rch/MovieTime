-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 11 mai 2019 à 13:53
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bdmovietime1`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `username` varchar(20) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `password` varchar(30) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`username`, `mail`, `password`, `date`) VALUES
('kbfiras', 'firas17kaabi@gmail.com', '22154231', '1997-09-17'),
('firas', 'firas17kaabi@gmail.com', '22154231', '1997-09-17'),
('nacef', 'nacef@gmail.com', '22154231', '1998-06-06'),
('nacef01', 'nacef@gmail.com', '22154231', '1998-06-06'),
('nacef04', 'nacef@gmail.com', '22154231', '1998-06-06'),
('nacef07', 'nacef@gmail.com', '22154231', '1998-06-06'),
('nacef03', 'nacef01@gmail.com', '22154231', '1998-06-06'),
('nacef09', 'nacef@gmail.com', 'nacef', '1998-06-06'),
('nacef10', 'nacef@gmail.com', '22154231', '2019-05-27');

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

DROP TABLE IF EXISTS `film`;
CREATE TABLE IF NOT EXISTS `film` (
  `id` int(11) NOT NULL,
  `nom` varchar(40) NOT NULL,
  `annee` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `genre` varchar(40) NOT NULL,
  `note` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `poster` varchar(50) NOT NULL,
  `bg` varchar(50) NOT NULL,
  `url` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `film`
--

INSERT INTO `film` (`id`, `nom`, `annee`, `time`, `genre`, `note`, `description`, `poster`, `bg`, `url`) VALUES
(1, 'Avengers : End Game', 2019, 149, 'action', 'film.png', 'As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.', 'film.png', 'film.png', 'https://www.youtube.com/embed/6ZfuNTqbHE8?autoplay=1'),
(2, 'start game', 2018, 200, 'action', 'film.png', 'As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.', 'film.png', 'film.png', 'https://www.youtube.com/embed/6ZfuNTqbHE8?autoplay=1'),
(3, 'aquaman', 2018, 200, 'action', 'film.png', 'As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.', 'film.png', 'film.png', 'https://www.youtube.com/embed/WDkg3h8PCVU?autoplay=1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
