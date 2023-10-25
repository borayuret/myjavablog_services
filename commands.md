

psql -U postgres -h localhost -p 5432

psql -U myjavablog -h localhost -p 5432

# Postgresql de yapılması gerekenler

CREATE DATABASE customer;
CREATE DATABASE fraud-detection;
CREATE USER myjavablog WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE customer TO myjavablog;
GRANT ALL PRIVILEGES ON DATABASE fraud TO myjavablog;

\c customer
GRANT ALL ON SCHEMA public TO myjavablog;

\c fraud
GRANT ALL ON SCHEMA public TO myjavablog;



