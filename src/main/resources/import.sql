DROP TABLE PERSON IF EXISTS;
DROP TABLE ADDRESS IF EXISTS;
CREATE TABLE PERSON(ID INT PRIMARY KEY, NAME VARCHAR(255));
CREATE TABLE ADDRESS(ID INT PRIMARY KEY,ADDRESS VARCHAR(255),PERSON_ID INT,FOREIGN KEY (PERSON_ID) REFERENCES public.PERSON(ID));
INSERT INTO PERSON VALUES(1, 'bugra');
INSERT INTO PERSON VALUES(2, 'gulsabah');
INSERT INTO PERSON VALUES(3, 'bilge');
INSERT INTO PERSON VALUES(4, 'cabir');
INSERT INTO PERSON VALUES(5, 'ozlem');
INSERT INTO PERSON VALUES(6, 'selahattin');
INSERT INTO PERSON VALUES(7, 'nazim');
INSERT INTO PERSON VALUES(8, 'elif');
INSERT INTO ADDRESS VALUES(1, 'address1', 1);
INSERT INTO ADDRESS VALUES(2, 'address2', 1);
INSERT INTO ADDRESS VALUES(3, 'address3', 1);
INSERT INTO ADDRESS VALUES(4, 'address2', 2);
INSERT INTO ADDRESS VALUES(5, 'address4', 3);
INSERT INTO ADDRESS VALUES(6, 'address4', 4);
INSERT INTO ADDRESS VALUES(7, 'address5', 5);
INSERT INTO ADDRESS VALUES(8, 'address5', 6);
INSERT INTO ADDRESS VALUES(9, 'address6', 7);
INSERT INTO ADDRESS VALUES(10, 'address7', 7);
INSERT INTO ADDRESS VALUES(11, 'address7', 8);
