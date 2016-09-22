-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

  -- -----------------------------------------------------
  -- Schema fiskaliburdb
  -- -----------------------------------------------------
  CREATE SCHEMA IF NOT EXISTS `fiskaliburdb` DEFAULT CHARACTER SET utf8 ;
  USE `fiskaliburdb` ;

  -- -----------------------------------------------------
  -- Table Kasa
  -- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `fiskaliburdb`.`kasa` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `broj_kase` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `komitent_id` INT(11) NULL DEFAULT 0,
  `broj_modula` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `broj_terminala` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `sim_kartica` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `pin` INT(5) NULL DEFAULT 0,
  `telefon` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `adresa_instaliranja` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `model_id` INT(5) NULL DEFAULT 0,
  `defiskalicacija` TINYINT(1) NULL DEFAULT false,
  `datum_defiskalizacije` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `opis` VARCHAR(255) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  
  PRIMARY KEY (`id`))  
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_unicode_ci;

  -- -----------------------------------------------------
  -- Table Komitent
  -- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `fiskaliburdb`.`komitent` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `naziv_komitenta` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `telefon` VARCHAR(15) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `adresa` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `broj_ugovora` VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `jib` VARCHAR(13) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `pib` VARCHAR(12) CHARACTER SET 'utf8' NULL DEFAULT NULL,

  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_unicode_ci;

-- -----------------------------------------------------
-- Table Model
-- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `fiskaliburdb`.`model` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `naziv_modela` VARCHAR(15) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `opis` VARCHAR(255) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  
  PRIMARY KEY (`id`))  
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_unicode_ci;

-- -----------------------------------------------------
-- Table Servis
-- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `fiskaliburdb`.`servis` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `kasa_id` INT(11) NULL DEFAULT 0,
  `datum_servisa` VARCHAR(20) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `opis` VARCHAR(255) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  
  PRIMARY KEY (`id`))  
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_unicode_ci;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
