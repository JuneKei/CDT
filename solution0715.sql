SELECT NAME
-- 이름 선택
FROM ANIMAL_INS ,(SELECT @ROWNUM :=0) r
-- rownum을 선택 별칭 r
ORDER BY DATETIME ASC

LIMIT 1
-- rownum 제한