-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 12 mai 2019 à 04:07
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
('nacef10', 'nacef@gmail.com', '22154231', '2019-05-27'),
('nacef17', 'buhbb@gmail.com', '97084602', '2019-05-15');

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

DROP TABLE IF EXISTS `film`;
CREATE TABLE IF NOT EXISTS `film` (
  `id` int(11) NOT NULL,
  `nom` varchar(40) NOT NULL,
  `annee` int(11) NOT NULL,
  `time` varchar(20) NOT NULL,
  `genre` varchar(40) NOT NULL,
  `note` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `poster` varchar(50) NOT NULL,
  `url` varchar(100) NOT NULL,
  `genre2` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `film`
--

INSERT INTO `film` (`id`, `nom`, `annee`, `time`, `genre`, `note`, `description`, `poster`, `url`, `genre2`) VALUES
(1, 'Avengers : Infinity War', 2018, '149 min', 'action / adventure / superhero / fantasy', '45stars.png', 'As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.', 'avengers.jpg', 'https://www.youtube.com/embed/6ZfuNTqbHE8?autoplay=1', 'action'),
(2, 'Hereditary', 2018, '127 min', 'horror / mystery /thriller', '35stars.png', 'When Ellen, the matriarch of the Graham family, passes away, her daughter\'s family begins to unravel cryptic and increasingly terrifying secrets about their ancestry. The more they discover, the more they find themselves trying to outrun the sinister fate they seem to have inherited. Making his feature debut, writer-director Ari Aster unleashes a nightmare vision of a domestic breakdown that exhibits the craft and precision of a nascent auteur, transforming a familial tragedy into something ominous and deeply disquieting, and pushing the horror movie into chilling new terrain with its shattering portrait of heritage ', 'hereda.jpg', 'https://www.youtube.com/embed/V6wWKNij_1M?autoplay=1', 'horror'),
(3, 'Aquaman', 2018, '144 min', 'fantasy / superhero / adventure / action', '4stars.png', 'From Warner Bros. Pictures and director James Wan comes an action-packed adventure that spans the vast, visually breathtaking underwater world of the seven seas, \"Aquaman,\" starring Jason Momoa in the title role. The film reveals the origin story of half-human, half-Atlantean Arthur Curry and takes him on the journey of his lifetime--one that will not only force him to face who he really is, but to discover if he is worthy of who he was born to be... a king.', 'aquaman.jpg', 'https://www.youtube.com/embed/ZmqJJqFX_CU?autoplay=1', 'adventure '),
(4, 'The Meg', 2018, '113 min', 'thriller / action  / horror', '35stars.png', 'A deep-sea submersible--part of an international undersea observation program--has been attacked by a massive creature, previously thought to be extinct, and now lies disabled at the bottom of the deepest trench in the Pacific... with its crew trapped inside. With time running out, expert deep sea rescue diver Jonas Taylor (Jason Statham) is recruited by a visionary Chinese oceanographer (Winston Chao), against the wishes of his daughter Suyin (Li Bingbing), to save the crew--and the ocean itself--from this unstoppable threat: a pre-historic 75-foot-long shark known as the Megalodon. What no one could have imagined is that, years before, Taylor had encountered this same terrifying creature. Now, teamed with Suyin, he must confront his fears and risk his own life to save everyone trapped below.', 'themeg.jpg', 'https://www.youtube.com/embed/GGYXExfKhmo?autoplay=1', 'horror'),
(5, 'Escape Room', 2019, '99 min', 'thriller / action / horror', '35stars.png', 'Escape Room is a psychological thriller about six strangers who find themselves in circumstances beyond their control and must use their wits to find the clues or die.', 'escaperoom.jpg', 'https://www.youtube.com/embed/6dSKUoV0SNI?autoplay=1', 'horror'),
(6, 'Mechanic: Resurrection', 2016, '99 min', 'action / crime / thriller', '', 'Arthur Bishop (Jason Statham) returns as the Mechanic in the sequel to the 2011 action thriller. When the deceitful actions of a cunning but beautiful woman (Jessica Alba) force him to return to the life he left behind, Bishop\'s life is once again in danger as he has to complete an impossible list of assassinations of the most dangerous men in the world.', 'jason.jpg', 'https://www.youtube.com/embed/G-P3f_wDXvs?autoplay=1', 'action'),
(7, 'Annabelle: Creation', 2017, '109 min', 'horror / thriller / mystery ', '35stars.png', 'A couple still grieving the death of their daughter take in children from a local orphanage, but the family are soon terrorized by a demented doll known as Annabelle. Anthony LaPaglia, Miranda Otto, Stephanie Sigman, Talitha Bateman, and Lulu Wilson star in this horror sequel from director David F. Sandberg (Lights Out).\r\n', 'annabelle.jpg', 'https://www.youtube.com/embed/KisPhy7T__Q?autoplay=1', 'horror '),
(8, 'Venom', 2018, '112 min', 'science-fiction / superhero /action ', '35stars.png', 'Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of an alien symbiote that gives him a violent super alter-ego: Venom. Soon, he must rely on his newfound powers to protect the world from a shadowy organisation looking for a symbiote of their own', 'venom.jpg', 'https://www.youtube.com/embed/xLCn88bfW1o?autoplay=1', 'action'),
(9, 'Glass', 2019, '130 min', 'thriller / drama / fantasy', '35stars.png', 'From Unbreakable, Bruce Willis returns as David Dunn as does Samuel L. Jackson as Elijah Price, known also by his pseudonym Mr. Glass. Joining from Split are James McAvoy, reprising his role as Kevin Wendell Crumb and the multiple identities who reside within, and Anya Taylor-Joy as Casey Cooke, the only captive to survive an encounter with The Beast. Following the conclusion of Split, Glass finds Dunn pursuing Crumb\'s superhuman figure of The Beast in a series of escalating encounters, while the shadowy presence of Price emerges as an orchestrator who holds secrets critical to both men.', 'Glass.jpg', 'https://www.youtube.com/embed/aBL6COBGjCA?autoplay=1', 'drama'),
(10, 'Interstellar', 2014, '169 min', 'science-fiction / drama / adventure', '45stars.png', 'With our time on Earth coming to an end, a team of explorers undertakes the most important mission in human history; traveling beyond this galaxy to discover whether mankind has a future among the stars. ', 'intersteller.jpg', 'https://www.youtube.com/embed/zSWdZVtXT7E?autoplay=1', 'drama '),
(11, 'Aladdin', 1992, '90 min', 'adventure / animation / fantasy', '4stars.png', 'A street rat frees a genie from a lamp, granting all of his wishes and transforming himself into a charming prince in order to marry a beautiful princess. But soon, an evil sorcerer becomes hell-bent on securing the lamp for his own sinister purposes.', 'alad.jpg', 'https://www.youtube.com/embed/HlULSKurtzg?autoplay=1', 'adventure'),
(12, 'Johnny English 3', 2018, '89 min', 'comedy', '35stars.png', 'When her majesty\'s crown jewels are stolen by a conniving Frenchman, who also plans to steal the queen\'s throne, spy Johnny English, a bit unseasoned but intensely enthusiastic, is thrown onto the case. Fast cars, high tech gadgets, top secret info--Johnny can hardly believe it. He may be in over his head, but his courage and dedication are unmatched--especially after he meets double agent Lorna Campbell and discovers that falling in love makes saving the nation even more exciting.', 'english.jpg', 'https://www.youtube.com/embed/9cBN9_9oK4A?autoplay=1', 'comedy'),
(13, 'Green Book', 2018, '130 min', 'drama / comedy', '4stars.png', 'When Tony Lip (Mortensen), a bouncer from an Italian-American neighborhood in the Bronx, is hired to drive Dr. Don Shirley (Ali), a world-class Black pianist, on a concert tour from Manhattan to the Deep South, they must rely on \"The Green Book\" to guide them to the few establishments that were then safe for African-Americans. Confronted with racism, danger-as well as unexpected humanity and humor-they are forced to set aside differences to survive and thrive on the journey of a lifetime.', 'greenbook.jpg', 'https://www.youtube.com/embed/GhdFHzVNDlQ?autoplay=1', 'drama'),
(14, 'Happy Death Day', 2019, '100 min', 'horro / mystery / thriller', '35stars.png', 'Jessica Rothe leads the returning cast of HAPPY DEATH DAY 2U, the follow-up to Blumhouse\'s (Split, Get Out, The Purge series) surprise 2017 smash hit of riveting, repeating twists and comic turns. This time, our hero Tree Gelbman (Rothe) discovers that dying over and over was surprisingly easier than the dangers that lie ahead. Jason Blum once again produces and Christopher Landon returns to write and direct this next chapter, while Happy Death Day executive producers Angela Mancuso and John Baldecchi are newly joined by EP Samson Mucke (Scouts Guide to the Zombie Apocalypse).', 'hbd.jpg', 'https://www.youtube.com/embed/THq6KlWgiqw?autoplay=1', 'horror'),
(15, 'It', 2017, '135 min', 'horror / thriller', '4stars.png', 'New Line Cinema\'s horror thriller \"IT,\" directed by Andy Muschietti (\"Mama\"), is based on the hugely popular Stephen King novel of the same name, which has been terrifying readers for decades. When children begin to disappear in the town of Derry, Maine, a group of young kids are faced with their biggest fears when they square off against an evil clown named Pennywise, whose history of murder and violence dates back for centuries.', 'it.jpg', 'https://www.youtube.com/embed/hAUTdjf9rko?autoplay=1', 'horror'),
(16, 'Men in Black II', 2002, '88 min', 'action / adventure / comedy', '4stars.png', 'Otherworldly villains are on the loose again, and it\'s up to Earth\'s interstellar police force to bring them to justice in this sequel to the sci-fi comedy blockbuster Men in Black. Agent Jay (Will Smith) has become a high-ranking member of the Men in Black, the secret government task force designed to deal with unruly visitors from other worlds, while his former cohort, Agent Kay (Tommy Lee Jones), had his memory wiped clean and now lives a simple but contented life as a mailman. However, an especially nasty alien threat has reared its not-so-ugly head; Serleena (Lara Flynn Boyle) is a shape-shifting Kylothian alien who is in pursuit of another escaped visitor who holds the key to powers that would allow her to destroy the world. Making Serleena all the more dangerous is the fact she\'s taken on the appearance of a lingerie model, making her irresistible to most men. When the rampaging Serleena takes control of the MIB offices, Jay is forced to turn to the only man who can help him save the world -- the former Agent Kay. After restoring Kay\'s memory, the two remaining Men in Black set out to conquer Serleena with a motley band of friendly aliens, including a handful of worm creatures and a talking dog named Frank (voice of Tim Blaney).', 'maninblack.jpg', 'https://www.youtube.com/embed/p4NJHqoojOU?autoplay=1', 'comedy'),
(17, 'The Boss Baby', 2019, '97 min', 'animation / comedy / family', '35stars.png', 'DreamWorks Animation and the director of Madagascar invite you to meet a most unusual baby. He wears a suit, speaks with the voice and wit of Alec Baldwin, and stars in the animated comedy, DreamWorks\' The Boss Baby. The Boss Baby is a hilariously universal story about how a new baby\'s arrival impacts a family, told from the point of view of a delightfully unreliable narrator, a wildly imaginative 7 year old named Tim. With a sly, heart-filled message about the importance of family, DreamWorks\' The Boss Baby is an authentic and broadly appealing original comedy for all ages.', 'bossbb.jpg', 'https://www.youtube.com/embed/r8kE7rSzfQs?autoplay=1', 'comedy'),
(18, 'John Wick: Chapter 2', 2017, '122 min', 'action / thriller / crime', '4stars.png', 'In this third installment of the adrenaline-fueled action franchise, super-assassin John Wick (Reeves) returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin\'s guild, the High Table, John Wick is excommunicado, but the world\'s most ruthless hit men and women await his every turn.', 'jhonwick.jpg', 'https://www.youtube.com/embed/XGk2EfbD_Ps?autoplay=1', 'action');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
