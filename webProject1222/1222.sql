CREATE TABLE login1222
(
	userId varchar2(100 char) NOT NULL,
	userPw varchar2(100 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	city varchar2(100 char) NOT NULL,
	memo varchar2(255 char) NOT NULL,
	PRIMARY KEY (userId)
);

desc login1222;

insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m1','11','남','낚시','서울','자기소개 1');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m2','21','여','등산','부산','자기소개 2');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m3','31','여','기타','제주','자기소개 3');

commit;

select * from login1222;