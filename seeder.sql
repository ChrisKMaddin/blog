use blog_teddy_db;

INSERT INTO users (id, username, email, password) VALUES (1, 'blog_cat', 'blog_cat@localhost', 'clark');


INSERT INTO categories (id, name) VALUES (1, 'Tech');
INSERT INTO categories (id, name) VALUES (2, 'Food');
INSERT INTO categories (id, name) VALUES (3, 'Films');
INSERT INTO categories (id, name) VALUES (4, 'Music');
INSERT INTO categories (id, name) VALUES (5, 'Events');

INSERT INTO ad_details (id, location, price) VALUES (1, 'SATX', 100);
INSERT INTO ad_details (id, location, price) VALUES (2, 'ATX', 101);
INSERT INTO ad_details (id, location, price) VALUES (3, 'HTX', 200);

INSERT INTO ads (id, description, title, user_id, ad_details_id) VALUES (1, 'lorem', 'Title 1', 1, 1);
INSERT INTO ads (id, description, title, user_id, ad_details_id) VALUES (2, 'ipsum', 'title 2', 2, 2);
INSERT INTO ads (id, description, title, user_id, ad_details_id) VALUES (3, 'Desc 3', 'Title 3', 1, 3);

INSERT INTO ad_images (id, path, ad_id) VALUES (1, 'https://www.nationalgeographic.com/content/dam/animals/pictures/mammals/d/domestic-dog/domestic-dog.adapt.1190.1.jpg', 1);
INSERT INTO ad_images (id, path, ad_id) VALUES (2, 'https://yourshot.nationalgeographic.com/u/fQYSUbVfts-T7odkrFJckdiFeHvab0GWOfzhj7tYdC0uglagsDQoFhcS93hGRMjUy8gNP0xVFkRwWrqqo1a62DHHrKv0SL364KoMj8jnHczaZTOiACM_yP-JDTx-_VWV87u0V7oVXP_kehYl9JaYB-Zs3K8-0OamOMhgXBQqgXKYstH6VqRMUUs_A2jlTYS7pfYZIpSp0wjr7isN5Y-C_K9qTy4/', 1);
INSERT INTO ad_images (id, path, ad_id) VALUES (3, 'https://yourshot.nationalgeographic.com/u/fQYSUbVfts-T7odkrFJckdiFeHvab0GWOfzhj7tYdC0uglagsDUfI7wAe-u5aSj5Y0Lcm6c5FT_L9fxgAMGPhRdvAYmtfUmfjhZAnmrzhRO6fwp2lJXKLXhzOpCSutQAckwNmDR7-VTZlHdAnnBXT09dp9lTxordRuWBLkBcYe6QmZUQQMKkPqP6GwIu9RPUfKzynZyzKpjYMJwBspYVQLzSHzWCfw/', 2);

INSERT INTO ad_images (id, path, ad_id) VALUES (4, 'https://yourshot.nationalgeographic.com/u/fQYSUbVfts-T7odkrFJckdiFeHvab0GWOfzhj7tYdC0uglagsDQme-3Fst-YV5T-SN3IdDPyqSGv17085U5nhqf5aAKlYCWf4fFclb1fnPXq_QOcMzbb2w8t0XedyOrioTKDX1qJk_8ebYxFvs9OXEzKmtGGe-Xyy5oawy05s3kG_i89CCarCmde3k3nbQYOOLvJsKxAWSs6-pTw67rs0K6HHd3MAQ/', 2);