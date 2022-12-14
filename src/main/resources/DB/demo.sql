-- 创建库
create database if not exists `pharmacy`;

-- 创建表
-- 商家账户表
drop table if exists `merchant`;
create table `merchant`(
    `mername` varchar(60) primary key comment '商家账户名',
    `merpwd`  varchar(20) comment '商家密码'
)comment '商家信息表';

-- 填充初始商家账号
insert into `merchant`()
values ('老百姓大药房','123456')
      ,('怡心大药房','123456');

-- 药品表
drop table if exists `drug`;
create table `drug`(
    `did` varchar(20) comment '药品代码id',
    `dname` varchar(20) comment '药品名',
    `price` double comment '价钱',
    `mername` varchar(60) comment '商家账户名',
    `type` varchar(15) comment '药品类别'
)comment '药品信息表';

-- 填充初始药品信息
insert into `drug`(did,dname,price,mername,type)
values ('SY100101','连花清瘟',37.55,'老百姓大药房','感冒药')
      ,('SY100102','丽珠得乐',22.44,'怡心大药房','儿童药')
      ,('SY100103','三九胃泰',33.45,'怡心大药房','胃药')
      ,('SY100104','金花液体钙',346.77,'怡心大药房','西药')
      ,('SY100105','生脉饮',22.95,'老百姓大药房','中成药')
      ,('SY100106','六味地黄丸',43.56,'老百姓大药房','中成药');


-- 用户(消费者)表
drop table if exists `user`;
create table `user`(
    `account` varchar(20) primary key ,
    `pwd`     varchar(20)
)comment '消费者账号信息表';

-- 填充初始账户（管理员）
insert into `user`(account, pwd)
values ('admin','admin');
