USE adlister_db;

TRUNCATE ads;

INSERT INTO ads (id, user_id, title, description)
VALUES
    (1,1,'Popeye','Driest Chicken in the industry'),
    (2,2, 'Chick fil-a ',' Chicken is not dry like popeye''s because we care!'),
    (3,3,'Churches','We''re not even trying!');


TRUNCATE user;
INSERT INTO user(id,userName,email,password)
VALUES
    (1,'B-rad','bra@gmail.com','bbbbbb'),
    (2,'candy','Ckand@gmail.com','ccccccccc'),
    (3,'chaos','idc@gmail.com','nksjsdlkdsn');


