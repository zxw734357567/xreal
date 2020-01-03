-- 创建表语句
create table t_emloyee(
  id  int    primary key  ,
  name varchar(12)  not null default '' comment  '姓名', -- 不设置为null，因为这样会导致不使用索引
  address varchar(255)   default '' comment '地址',
  birthday date  not null   comment '生日',
  salary  double   default  0 comment '薪水'
)engine= innoDB collate =utf8_bin ;

-- 插入猪八戒
INSERT INTO jojo.t_emloyee (id, name, address, birthday, salary) VALUES (1,'猪八戒','高老庄',STR_TO_DATE('1625-09-08 16:45:23','%Y-%m-%d %H:%i:%s'),10000); commit;

create table if not exists  t_order(
  id int primary key ,
    t_employ_id int ,
  name varchar(32)  ,
  price double
) engine innoDB  collate =utf8_bin;

insert t_order values (1,1,'六尺钉耙',8999.0);
insert t_order values (2,2,'金箍棒',45000.0);
insert t_order values (3,2,'紧箍咒',8848.0);
insert t_order values (4,3,'美人计',8848.0);commit ;