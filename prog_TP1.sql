CREATE OR REPLACE FUNCTION ma_premiere_fonction() RETURNS void AS $$ 
DECLARE 
x INTEGER:=100 ; 
BEGIN
FOR i IN  1..10 LOOP
INSERT INTO temp VALUES (i,x) ; 
x:=x+100 ;
END LOOP ;
END ;
$$ LANGUAGE plpgsql ;
