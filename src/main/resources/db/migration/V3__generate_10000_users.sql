-- V3__generate_10000_users.sql
-- Генерируем 10000 записей с реалистичными русскими именами
INSERT INTO USERS (user_name)
SELECT
    CASE (random() * 9)::int
        WHEN 0 THEN 'Иван'
        WHEN 1 THEN 'Петр'
        WHEN 2 THEN 'Сергей'
        WHEN 3 THEN 'Алексей'
        WHEN 4 THEN 'Дмитрий'
        WHEN 5 THEN 'Андрей'
        WHEN 6 THEN 'Михаил'
        WHEN 7 THEN 'Николай'
        WHEN 8 THEN 'Владимир'
        ELSE 'Александр'
END || ' ' ||
    CASE (random() * 9)::int
        WHEN 0 THEN 'Иванов'
        WHEN 1 THEN 'Петров'
        WHEN 2 THEN 'Сидоров'
        WHEN 3 THEN 'Смирнов'
        WHEN 4 THEN 'Кузнецов'
        WHEN 5 THEN 'Попов'
        WHEN 6 THEN 'Васильев'
        WHEN 7 THEN 'Михайлов'
        WHEN 8 THEN 'Новиков'
        ELSE 'Федоров'
END || ' ' ||
    (floor(random() * 100)::int)
FROM generate_series(1, 10000);