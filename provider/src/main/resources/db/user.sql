CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `create_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`user`(`id`, `name`, `age`, `create_at`) VALUES (1, 'uu1', 11, '2020-11-05 14:13:57');
INSERT INTO `test`.`user`(`id`, `name`, `age`, `create_at`) VALUES (2, 'u2', 12, '2020-11-03 14:13:31');
INSERT INTO `test`.`user`(`id`, `name`, `age`, `create_at`) VALUES (3, 'u3', 13, '2020-11-04 14:13:41');