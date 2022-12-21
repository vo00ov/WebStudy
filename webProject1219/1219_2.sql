CREATE TABLE member1219
(
	userId varchar2(10 char) NOT NULL,
	userPw varchar2(10 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userId)
);

select * from member1219;

drop table test_tb_1219;
create table test_tb_1219(
    userId varchar2(100) not null primary key,
    userPw varchar2(100) not null,
    userName varchar2(100) not null,
    gender varchar2(100) not null,
    hobbys varchar2(200) not null,
    phone varchar2(100) not null,
    memo varchar2(255) not null
);


select * from member1219;
select * from test_tb_1219;


commit;