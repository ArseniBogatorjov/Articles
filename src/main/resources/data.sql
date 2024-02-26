INSERT INTO users(email, user_name, password, created_at) VALUES ("goga@goa.com", "GOOOOGA", "fufel", CURDATE());
INSERT INTO users(email, user_name, password, created_at) VALUES ("buba@boa.com", "BUBKA", "bubuk", CURDATE());
INSERT INTO users(email, user_name, password, created_at) VALUES ("goa@goa.com", "GALINA", "AJ", CURDATE());

INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 1, 'Статья́ — это жанр журналистики', 'journal', 'JOURNAL', 'Что-то на китайском');
INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 2, 'О КИТАЙСКОМ', 'китайский-язычок', 'Китайский Язычок', 'Что-то про китайский');
INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 3, 'Коротко и ясно', 'незнайка', 'Незнайка', 'Даже не знаю про что это');

INSERT INTO tag(created_at, name) VALUES (CURDATE(),"language" );
INSERT INTO tag(created_at, name) VALUES (CURDATE(),"magazin" );

INSERT INTO article_tag(article_id, tag_id) VALUES (1,2 );
INSERT INTO article_tag(article_id, tag_id) VALUES (2,1 );
INSERT INTO article_tag(article_id, tag_id) VALUES (3,1 );

INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),1,2, 'HELOOOOOO NICE ARTICLE');
INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),3,1, 'Поясните за третью статью, я чё-то не понял ');
INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),2,3, 'Я выучил китайский с этой книгой за 4 месяца, Я В ШОКЕ!!! ');

INSERT INTO article_favorite(article_id, user_id) VALUES (3,1);
INSERT INTO article_favorite(article_id, user_id) VALUES (3,2);
INSERT INTO article_favorite(article_id, user_id) VALUES (3,3);

INSERT INTO user_follow(follower_id, following_id) VALUES (1,3);
INSERT INTO user_follow(follower_id, following_id) VALUES (2,2);
