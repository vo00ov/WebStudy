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

insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m1','11','��','����','����','�ڱ�Ұ� 1');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m2','21','��','���','�λ�','�ڱ�Ұ� 2');
insert into login1221(userId, userPw, gender, hobbys, city, memo) values('m3','31','��','��Ÿ','����','�ڱ�Ұ� 3');

commit;

select * from login1221;

--�α��� count(*) 1�̸� ȸ��, �ƴϸ� ��ȸ��
select count(*) from login1221 where userId='m1' and userPw='11';
--ȸ������ -> ������
select * from login1221 where userId='m1';

--===========================================================================================================================

