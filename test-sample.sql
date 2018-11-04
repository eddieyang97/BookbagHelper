SELECT *
FROM Professor
WHERE quality >= ALL (
  SELECT quality FROM Professor
);
