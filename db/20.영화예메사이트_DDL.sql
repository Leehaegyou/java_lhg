DROP DATABASE IF EXISTS CGV;

CREATE DATABASE CGV;

USE CGV;

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
	`mo_num`	int	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`mo_title`	varchar(50) NOT NULL,
	`mo_title_eng`	varchar(100) NOT NULL,
	`mo_opening_date`	date	NULL,
	`mo_running_time`	int	NOT NULL,
	`mo_plot`	longtext	NOT NULL,
	`mo_fi_num`	int	NOT NULL,
	`mo_ag_name`varchar(10)	NOT NULL,
	`mo_reservation_rate`	int	NOT NULL DEFAULT 0
);

DROP TABLE IF EXISTS `genre`;

CREATE TABLE `genre` (
	`ge_name`	varchar(10)	NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS `movie_genre`;

CREATE TABLE `movie_genre` (
	`ge_num`	int PRIMARY KEY AUTO_INCREMENT	NOT NULL,
	`ge_name2`	varchar(10)	NOT NULL,
	`ge_mo_num2`	int primary key auto_increment	NOT NULL
);

DROP TABLE IF EXISTS `country`;

CREATE TABLE `country` (
	`ct_name`	varchar(20)	NOT NULL
);

DROP TABLE IF EXISTS `country_production`;

CREATE TABLE `country_production` (
	`cp_num`	int	NOT NULL,
	`cp_ct_name`	varchar(20)	NOT NULL,
	`cp_mo_num`	int primary key auto_increment	NOT NULL
);

DROP TABLE IF EXISTS `film_persion`;

CREATE TABLE `film_persion` (
	`fp_num`	int	NOT NULL,
	`fp_name`	varchar(10)	NULL,
	`fp_thumbnail`	varchar(50)	NULL,
	`fp_agency`	varchar(20)	NULL,
	`fp_final_education`	varchar(20)	NULL,
	`fp_brithday`	date	NULL,
	`ct_name`	varchar(20)	NOT NULL
);

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
	`ro_num`	int	NOT NULL,
	`ro_role`	varchar(30)	NULL,
	`ro_fp_num`	int	NOT NULL,
	`ro_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
	`fi_num`	intㅍ	NOT NULL,
	`fi_name`	varchar(100)	NULL,
	`fi_state`	varchar(10)	NULL
);

DROP TABLE IF EXISTS `movie_file`;

CREATE TABLE `movie_file` (
	`mf_fiile`	int	NOT NULL,
	`mf_fi_num`	intㅍ	NOT NULL,
	`mf_mo_num`	int primary key auto_increment	NOT NULL
);

DROP TABLE IF EXISTS `age`;

CREATE TABLE `age` (
	`ag_name`	varchar(10)	NOT NULL
);

DROP TABLE IF EXISTS `theater`;

CREATE TABLE `theater` (
	`th_num`	int	NOT NULL,
	`th_name`	varchar(20)	NULL,
	`th_address`	varchar(50)	NULL,
	`re_name`	varchar(15)	NOT NULL,
	`th_total_screen`	int	NULL,
	`th_total_seat`	int	NULL
);

DROP TABLE IF EXISTS `region`;

CREATE TABLE `region` (
	`re_name`	varchar(15)	NOT NULL
);

DROP TABLE IF EXISTS `screen`;

CREATE TABLE `screen` (
	`sc_num`	int	NOT NULL,
	`sc_name`	varchar(20)	NULL,
	`sc_total_seat`	int	NULL,
	`sc_th_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `seat`;

CREATE TABLE `seat` (
	`se_num`	int	NOT NULL,
	`se_name`	varchar(4)	NULL,
	`se_row`	char(1)	NULL,
	`se_col`	varchar(2)	NULL,
	`se_state`	varchar(10)	NULL,
	`se_sc_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `movie_schedule`;

CREATE TABLE `movie_schedule` (
	`ms_num`	int	NOT NULL,
	`ms_mo_num`	int	NOT NULL,
	`ms_sc_num`	int	NOT NULL,
	`ms_date`	date	NULL,
	`ms_start_time`	time	NULL,
	`ms_end_time`	time	NULL,
	`ms_possible_seat`	int	NULL,
	`ms_discount`	char(1)	NULL
);

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(15)	NOT NULL,
	`me_pw`	varchar(20)	NULL,
	`me_name`	varchar(20)	NULL,
	`me_phone`	varchar(15)	NULL,
	`me_birthday`	date	NULL
);

DROP TABLE IF EXISTS `reservation`;

CREATE TABLE `reservation` (
	`rv_num`	varchar(20)	NOT NULL,
	`rv_adult`	int	NULL,
	`rv_ms_num`	int	NOT NULL,
	`rv_me_id`	varchar(15)	NOT NULL,
	`rv_teenager`	int	NULL,
	`rv_price`	int	NULL
);

DROP TABLE IF EXISTS `reservation_list`;

CREATE TABLE `reservation_list` (
	`rl_num`	int	NOT NULL,
	`rl_rv_num`	varchar(20)	NOT NULL,
	`rl_se_num`	int	NOT NULL,
	`rl_pr_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `price`;

CREATE TABLE `price` (
	`pr_num`	int	NOT NULL,
	`pr_type`	varchar(3)	NULL,
	`pr_price`	int	NULL,
	`pr_discount_price`	int	NULL
);

DROP TABLE IF EXISTS `review`;

CREATE TABLE `review` (
	`re_num`	int	NOT NULL,
	`re_content`	longtext	NULL,
	`re_mo_num`	int	NOT NULL,
	`re_me_id`	varchar(15)	NOT NULL,
	`re_total_like`	int	NULL
);

DROP TABLE IF EXISTS `like`;

CREATE TABLE `like` (
	`li_num`	int	NOT NULL,
	`li_me_id`	varchar(15)	NOT NULL,
	`li_re_num`	int	NOT NULL
);

ALTER TABLE `movie` ADD CONSTRAINT `PK_MOVIE` PRIMARY KEY (
	`mo_num`
);

ALTER TABLE `genre` ADD CONSTRAINT `PK_GENRE` PRIMARY KEY (
	`ge_name`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `PK_MOVIE_GENRE` PRIMARY KEY (
	`ge_num`
);

ALTER TABLE `country` ADD CONSTRAINT `PK_COUNTRY` PRIMARY KEY (
	`ct_name`
);

ALTER TABLE `country_production` ADD CONSTRAINT `PK_COUNTRY_PRODUCTION` PRIMARY KEY (
	`cp_num`
);

ALTER TABLE `film_persion` ADD CONSTRAINT `PK_FILM_PERSION` PRIMARY KEY (
	`fp_num`
);

ALTER TABLE `role` ADD CONSTRAINT `PK_ROLE` PRIMARY KEY (
	`ro_num`
);

ALTER TABLE `file` ADD CONSTRAINT `PK_FILE` PRIMARY KEY (
	`fi_num`
);

ALTER TABLE `movie_file` ADD CONSTRAINT `PK_MOVIE_FILE` PRIMARY KEY (
	`mf_fiile`
);

ALTER TABLE `age` ADD CONSTRAINT `PK_AGE` PRIMARY KEY (
	`ag_name`
);

ALTER TABLE `theater` ADD CONSTRAINT `PK_THEATER` PRIMARY KEY (
	`th_num`
);

ALTER TABLE `region` ADD CONSTRAINT `PK_REGION` PRIMARY KEY (
	`re_name`
);

ALTER TABLE `screen` ADD CONSTRAINT `PK_SCREEN` PRIMARY KEY (
	`sc_num`
);

ALTER TABLE `seat` ADD CONSTRAINT `PK_SEAT` PRIMARY KEY (
	`se_num`
);

ALTER TABLE `movie_schedule` ADD CONSTRAINT `PK_MOVIE_SCHEDULE` PRIMARY KEY (
	`ms_num`
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`me_id`
);

ALTER TABLE `reservation` ADD CONSTRAINT `PK_RESERVATION` PRIMARY KEY (
	`rv_num`
);

ALTER TABLE `reservation_list` ADD CONSTRAINT `PK_RESERVATION_LIST` PRIMARY KEY (
	`rl_num`
);

ALTER TABLE `price` ADD CONSTRAINT `PK_PRICE` PRIMARY KEY (
	`pr_num`
);

ALTER TABLE `review` ADD CONSTRAINT `PK_REVIEW` PRIMARY KEY (
	`re_num`
);

ALTER TABLE `like` ADD CONSTRAINT `PK_LIKE` PRIMARY KEY (
	`li_num`
);

ALTER TABLE `movie` ADD CONSTRAINT `FK_file_TO_movie_1` FOREIGN KEY (
	`mo_fi_num`
)
REFERENCES `file` (
	`fi_num`
);

ALTER TABLE `movie` ADD CONSTRAINT `FK_age_TO_movie_1` FOREIGN KEY (
	`mo_ag_name`
)
REFERENCES `age` (
	`ag_name`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `FK_genre_TO_movie_genre_1` FOREIGN KEY (
	`ge_name2`
)
REFERENCES `genre` (
	`ge_name`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `FK_movie_TO_movie_genre_1` FOREIGN KEY (
	`ge_mo_num2`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `country_production` ADD CONSTRAINT `FK_country_TO_country_production_1` FOREIGN KEY (
	`cp_ct_name`
)
REFERENCES `country` (
	`ct_name`
);

ALTER TABLE `country_production` ADD CONSTRAINT `FK_movie_TO_country_production_1` FOREIGN KEY (
	`cp_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `film_persion` ADD CONSTRAINT `FK_country_TO_film_persion_1` FOREIGN KEY (
	`ct_name`
)
REFERENCES `country` (
	`ct_name`
);

ALTER TABLE `role` ADD CONSTRAINT `FK_film_persion_TO_role_1` FOREIGN KEY (
	`ro_fp_num`
)
REFERENCES `film_persion` (
	`fp_num`
);

ALTER TABLE `role` ADD CONSTRAINT `FK_movie_TO_role_1` FOREIGN KEY (
	`ro_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `movie_file` ADD CONSTRAINT `FK_file_TO_movie_file_1` FOREIGN KEY (
	`mf_fi_num`
)
REFERENCES `file` (
	`fi_num`
);

ALTER TABLE `movie_file` ADD CONSTRAINT `FK_movie_TO_movie_file_1` FOREIGN KEY (
	`mf_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `theater` ADD CONSTRAINT `FK_region_TO_theater_1` FOREIGN KEY (
	`re_name`
)
REFERENCES `region` (
	`re_name`
);

ALTER TABLE `screen` ADD CONSTRAINT `FK_theater_TO_screen_1` FOREIGN KEY (
	`sc_th_num`
)
REFERENCES `theater` (
	`th_num`
);

ALTER TABLE `seat` ADD CONSTRAINT `FK_screen_TO_seat_1` FOREIGN KEY (
	`se_sc_num`
)
REFERENCES `screen` (
	`sc_num`
);

ALTER TABLE `movie_schedule` ADD CONSTRAINT `FK_movie_TO_movie_schedule_1` FOREIGN KEY (
	`ms_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `movie_schedule` ADD CONSTRAINT `FK_screen_TO_movie_schedule_1` FOREIGN KEY (
	`ms_sc_num`
)
REFERENCES `screen` (
	`sc_num`
);

ALTER TABLE `reservation` ADD CONSTRAINT `FK_movie_schedule_TO_reservation_1` FOREIGN KEY (
	`rv_ms_num`
)
REFERENCES `movie_schedule` (
	`ms_num`
);

ALTER TABLE `reservation` ADD CONSTRAINT `FK_member_TO_reservation_1` FOREIGN KEY (
	`rv_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `reservation_list` ADD CONSTRAINT `FK_reservation_TO_reservation_list_1` FOREIGN KEY (
	`rl_rv_num`
)
REFERENCES `reservation` (
	`rv_num`
);

ALTER TABLE `reservation_list` ADD CONSTRAINT `FK_seat_TO_reservation_list_1` FOREIGN KEY (
	`rl_se_num`
)
REFERENCES `seat` (
	`se_num`
);

ALTER TABLE `reservation_list` ADD CONSTRAINT `FK_price_TO_reservation_list_1` FOREIGN KEY (
	`rl_pr_num`
)
REFERENCES `price` (
	`pr_num`
);

ALTER TABLE `review` ADD CONSTRAINT `FK_movie_TO_review_1` FOREIGN KEY (
	`re_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `review` ADD CONSTRAINT `FK_member_TO_review_1` FOREIGN KEY (
	`re_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `like` ADD CONSTRAINT `FK_member_TO_like_1` FOREIGN KEY (
	`li_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `like` ADD CONSTRAINT `FK_review_TO_like_1` FOREIGN KEY (
	`li_re_num`
)
REFERENCES `review` (
	`re_num`
);

