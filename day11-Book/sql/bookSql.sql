/*

JDBC 구현 전 생성할 테이블 SCOTT 계정에 생성

table : book
bookid      VARCHAR2(5) 
title       VARCHAR2(200)   NOT NULL
author      VARCHAR2(50)    NOT NULL
price       NUMBER(10)
isbn        VARCHAR2(13)
publish     VARCHAR2(30)
regdate     DATE    DEFAULT sysdate
moddate     DATE

PK : pk_book (bookid)

 */

-- 테이블 생성
CREATE TABLE book
(  bookid      VARCHAR2(5)
 , title       VARCHAR2(200)   NOT NULL
 , author      VARCHAR2(50)    NOT NULL
 , price       NUMBER(10)
 , isbn        VARCHAR2(13)
 , publish     VARCHAR2(30)
 , regdate     DATE    DEFAULT sysdate
 , moddate     DATE
 , CONSTRAINT pk_book PRIMARY KEY (bookid)
);

-- 중복 여부를 검사할 쿼리
SELECT b.bookid
  FROM book b
 WHERE b.bookid = ?

-- 도서 정보 삽입 쿼리
INSERT INTO book (bookid, title, author, price, isbn, publish)
VALUES (?, ?, ?, ?, ?, ?)

-- 도서 정보 수정 쿼리
UPDATE book b
   SET b.title = ?
     , b.author = ?
     , b.price = ?
     , b.isbn = ?
     , b.publish = ? 
     , b.moddate = sysdate
 WHERE b.bookid = ?
 
 -- 도서 정보 삭제 쿼리
 DELETE book b
  WHERE b.bookid = ?
 
  
 -- 도서 정보 조회 (1건) 쿼리
 SELECT b.bookid
      , b.title
      , b.author
      , b.price
      , b.isbn
      , b.publish
   FROM book b
  WHERE b.bookid = ?
 ;
 
 -- 도서 가격으로 검색하는 쿼리
 SELECT b.bookid
      , b.title
      , b.author
      , b.price
      , b.isbn
      , b.publish
   FROM book b
  WHERE b.price BETWEEN ? AND ?
 ;
 
 -- 키워드로 도서 정보 검색하는 쿼리
 SELECT b.bookid
      , b.title
      , b.author
      , b.price
      , b.isbn
      , b.publish
   FROM book b
  WHERE b.title LIKE '%?%'
 ;
 
 -- 모든 도서의 개수를 구하는 쿼리
 SELECT count(b.bookid)
   FROM book b
  
  