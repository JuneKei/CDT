SELECT ANIMAL_ID,NAME
FROM ANIMAL_INS 
WHERE INTAKE_CONDITION <> 'Aged'
-- Aged가 아닐때 <> 
ORDER BY ANIMAL_ID;