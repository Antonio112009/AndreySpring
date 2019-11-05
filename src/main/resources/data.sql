
REPLACE INTO `country_name` VALUE (1);
REPLACE INTO `country_name` VALUE (2);
REPLACE INTO `country_name` VALUE (3);
REPLACE INTO `country_name` VALUE (4);


REPLACE INTO `country` VALUES (1, 804, 'UK', 'UKR','Україна', 1);
REPLACE INTO `country` VALUES (2, 705, 'SI','SVN','Slovenija', 2);
REPLACE INTO `country` VALUES (3, 643, 'RU', 'RUS','Россия', 3);
REPLACE INTO `country` VALUES (4, 826, 'EN', 'ENG','United Kingdom', 4);


REPLACE INTO `language` VALUES (1, 'ru');
REPLACE INTO `language` VALUES (2, 'en');
REPLACE INTO `language` VALUES (3, 'uk');


REPLACE INTO `translation` VALUES (1, 'Украина', 1);
REPLACE INTO `translation` VALUES (2, 'Ukrain', 2);
REPLACE INTO `translation` VALUES (3, 'Україна', 3);
REPLACE INTO `translation` VALUES (4, 'Словения', 1);
REPLACE INTO `translation` VALUES (5, 'Slovenia', 2);
REPLACE INTO `translation` VALUES (6, 'United Kingdom', 2);
REPLACE INTO `translation` VALUES (7, 'Соединеное Королество', 1);

# Соединение страны (название) с переводом
REPLACE INTO `country_name_translations` VALUES (1, 1);
REPLACE INTO `country_name_translations` VALUES (1, 2);
REPLACE INTO `country_name_translations` VALUES (1, 3);
REPLACE INTO `country_name_translations` VALUES (2, 4);
REPLACE INTO `country_name_translations` VALUES (2, 5);
REPLACE INTO `country_name_translations` VALUES (4, 6);
REPLACE INTO `country_name_translations` VALUES (4, 7);