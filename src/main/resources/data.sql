INSERT INTO users(email, user_name, password, created_at) VALUES ("ivan@gmail.com", "ivan", "123", CURDATE());
INSERT INTO users(email, user_name, password, created_at) VALUES ("anton@gmail.com", "anton", "1234", CURDATE());
INSERT INTO users(email, user_name, password, created_at) VALUES ("anna@gmail.com", "anna", "12345", CURDATE());

INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 1, 'learn prgoramming', 'java', 'JAVA8', 'something about java');
INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 2, 'learn design', 'html and css', 'html5 and css3', 'something about html and css');
INSERT INTO article(created_at, updated_at, user_id, description, slug, title, content) VALUES
(CURDATE(), CURDATE(), 3, 'web development', 'spring', 'java spring boot', 'something about spring boot');

INSERT INTO tag(created_at, name) VALUES (CURDATE(),"programming" );
INSERT INTO tag(created_at, name) VALUES (CURDATE(),"design" );
INSERT INTO tag(created_at, name) VALUES (CURDATE(),"data work");

INSERT INTO article_tag(article_id, tag_id) VALUES (1,1);
INSERT INTO article_tag(article_id, tag_id) VALUES (2,2);
INSERT INTO article_tag(article_id, tag_id) VALUES (3,3);

INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),1,2, 'useful article');
INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),3,1, 'u can learn web development with that');
INSERT INTO comment(created_at,article_id,user_id, content) VALUES (CURDATE(),2,3, 'useful for designers');

INSERT INTO article_favorite(article_id, user_id) VALUES (3,1);
INSERT INTO article_favorite(article_id, user_id) VALUES (2,2);
INSERT INTO article_favorite(article_id, user_id) VALUES (1,3);

INSERT INTO user_follow(follower_id, following_id) VALUES (1,3);
INSERT INTO user_follow(follower_id, following_id) VALUES (2,2);
INSERT INTO user_follow(follower_id, following_id) VALUES (3,1);
