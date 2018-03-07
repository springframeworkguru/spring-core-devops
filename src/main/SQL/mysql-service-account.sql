CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'guru';

GRANT SELECT ON springguru.* to 'springframework'@'localhost';
GRANT INSERT ON springguru.* to 'springframework'@'localhost';
GRANT DELETE ON springguru.* to 'springframework'@'localhost';
GRANT UPDATE ON springguru.* to 'springframework'@'localhost';


CREATE USER 'qa2user'@'localhost' IDENTIFIED BY 'qa2password';

GRANT SELECT ON qa2.* to 'qa2user'@'localhost';
GRANT INSERT ON qa2.* to 'qa2user'@'localhost';
GRANT DELETE ON qa2.* to 'qa2user'@'localhost';
GRANT UPDATE ON qa2.* to 'qa2user'@'localhost';