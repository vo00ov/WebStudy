create table member1227(
    userId varchar2(20) not null PRIMARY key,
    userPw varchar2(20) not null,
    userName varchar2(20) not null
);

insert into member1227(userId, userPw, userName) values('m1', '1111', 'mmm');
insert into member1227(userId, userPw, userName) values('m2', '2341', 'kkk');
insert into member1227(userId, userPw, userName) values('m3', '9837', 'ddd');

commit;

select * from member1227;
