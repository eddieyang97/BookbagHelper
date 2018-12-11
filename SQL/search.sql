-- Search for basic info for professor 'Prof'
SELECT *
FROM Professor
WHERE prof_name LIKE '%Prof%';

-- Search for all courses taught by the professor 'Prof'
SELECT DISTINCT course_name, semester, comment
FROM Teaches t, comment c
WHERE t.pairingID = c.pairingID AND (prof_name = 'Prof' OR sec_prof_name = 'Prof');

-- Search for all teaching records of the course 'Cour'
SELECT DISTINCT prof_name, sec_prof_name, semester, comment
FROM Teaches t, comment c
WHERE t.pairingID = c.pairingID AND course_name LIKE '%Cour%';

-- Shows which professors are there for selection to filter
SELECT DISTINCT prof
FROM
((SELECT prof_name prof FROM Teaches t WHERE course_name = 'Cour')
 UNION
 (SELECT sec_prof_name prof FROM Teaches t WHERE course_name = 'Cour'))

 -- Shows which semesters are there for selection to filter
 SELECT DISTINCT semester
 FROM Teaches t
 WHERE course_name = 'Cour';

-- Filter comments of the course 'Cour' by professor 'Prof'
SELECT DISTINCT prof_name, sec_prof_name, semester, comment
FROM Teaches t, comment c
WHERE t.pairingID = c.pairingID AND course_name = 'Cour' AND prof_name = 'Prof';

-- Filter comments of the course 'Cour' by semester 'Sem'
SELECT DISTINCT prof_name, sec_prof_name, semester, comment
FROM Teaches t, comment c
WHERE t.pairingID = c.pairingID AND course_name = 'Cour' AND semester = 'Sem';
