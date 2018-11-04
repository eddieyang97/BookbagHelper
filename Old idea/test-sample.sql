SELECT *
FROM Phone
WHERE price >= ALL (
  SELECT price FROM Phone
);
