CREATE TABLE login1221
(
	userId varchar2(100 char) NOT NULL,
	userPw varchar2(100 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	city varchar2(100 char) NOT NULL,
	memo varchar2(255 char) NOT NULL,
	PRIMARY KEY (userId)
);

desc login1221;

insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m1','11','남','낚시','서울','자기소개 1');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m2','21','여','등산','부산','자기소개 2');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m3','31','여','기타','제주','자기소개 3');

commit;

select * from login1221;

--로그인 count(*) 1이면 회원, 아니면 비회원
select count(*) from login1221 where userId='m1' and userPw='11';
--회원정보 -> 상세정보
select * from login1221 where userId='m1';

--===========================================================================================================================

