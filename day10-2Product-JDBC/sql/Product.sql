-- product.sql


/*
 * Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
 */

-- 1. PRODUCT 테이블 생성 구문
/*
 * prodcode 	VARCHAR2(4)
 * prodname		VARCHAR2(50)
 * price		NUMBER(12)
 * quantity		NUMBER(3)
 * regdate		DATE	DEFAULT sysdate
 * moddate		DATE	
 * pk_product : prodcode
 */

CREATE TABLE product 
(  prodcode		VARCHAR2(4)
 , prodname		VARCHAR2(50)
 , price		NUMBER(12)
 , quantity		NUMBER(3)
 , regdate		DATE		DEFAULT sysdate
 , moddate		DATE
 , CONSTRAINT pk_product PRIMARY KEY (prodcode)
);


-- 2. isExists() : 동일 데이터가 존재하는지 선 조회
SELECT p.PRODCODE
  FROM product p
 WHERE p.PRODCODE = ?
;

-- 3. add() : 신규 제품정보 등록
INSERT INTO product(prodcode, prodname, price, quantity) 
VALUES (?, ?, ?, ?)


-- 4. get() : 제품 정보 조회

SELECT p.prodcode
     , p.prodname
     , p.price
     , p.quantity
  FROM product p
 WHERE p.prodcode = ?

 
 -- 5. set()
UPDATE product p
   SET p.prodname = ?
     , p.PRICE = ?
     , p.quantity = ?
     , p.MODDATE = sysdate
 WHERE p.prodcode = ?

 
 -- 6. remove() 
DELETE product p
 WHERE p.prodcode = ?
