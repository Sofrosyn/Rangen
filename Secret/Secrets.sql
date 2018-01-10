--
-- File generated with SQLiteStudio v3.1.1 on Tue Nov 7 09:29:12 2017
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: saveData
CREATE TABLE saveData (id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL, title VARCHAR (20), date DATE, data BLOB);
INSERT INTO saveData (id, title, date, data) VALUES (1, 'dddddd', NULL, 'ddddddd');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
