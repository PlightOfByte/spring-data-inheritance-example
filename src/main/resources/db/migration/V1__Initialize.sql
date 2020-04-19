CREATE TABLE ANIMAL (
    ID INTEGER PRIMARY KEY,
    NAME VARCHAR,
    TYPE VARCHAR NOT NULL,
    ATTRIBUTE_1 INTEGER,
    ATTRIBUTE_1_DESC VARCHAR
);

INSERT INTO ANIMAL VALUES (1, 'Bengal Tiger', 'Cat', 4, 'Limbs');
INSERT INTO ANIMAL VALUES (2, 'Goldfish', 'Fish', 7, 'Fins');
INSERT INTO ANIMAL VALUES (3, 'American Bobtail', 'Cat', 4, 'Limbs');
INSERT INTO ANIMAL VALUES (4, 'German Shepherd', 'Dog', 4, 'Limbs');
INSERT INTO ANIMAL VALUES (5, 'Domestic canary', 'Bird', 2, 'Wings');