SELECT u.user_id, u.username, td.training_id, td.training_date, COUNT(*) AS count
FROM user AS u
JOIN Training_details AS td ON u.user_id = td.user_id
GROUP BY u.user_id, u.username, td.training_id, td.training_date
HAVING COUNT(*) > 1
ORDER BY td.training_date DESC;
