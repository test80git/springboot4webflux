# Getting Started


Запустить Docker, запустить контейнер shard-order-postgres
Внутри контейнера выбрать вкладку Exec и выполнить команды
```bash
psql -U postgres
# psql (16.6 (Debian 16.6-1.pgdg120+1))
# Type "help" for help.
```
Список всех баз данных
```bash
\l
```
Подключиться к базе данных
```bash
\c postgres
# You are now connected to database "postgres" as user "postgres".
```
Список всех таблиц в текущей БД
```bash
\dt
```
```cassandraql
SELECT * FROM users;
```