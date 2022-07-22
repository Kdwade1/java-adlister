CREATE
DATABASE IF NOT EXISTS Cookies;
    USE
Cookies;

    DROP TABLE IF EXISTS flavors;

    CREATE TABLE flavor(
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        name VARCHAR(30) NOT NULL,
        flavor VARCHAR(50) UNIQUE NOT NULL,
        crunch VarCHAR(50) NOT NULL,
        primary key (id)


    )
