use wikidev;
drop table if exists `test`;

create table `test`
(
    `id`   bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine = INNODB
  default charset = utf8mb4
  comment = '测试';

insert into `test`(id, name, password) value (1,'测试','123456');

drop table if exists `demo`;
create table `demo`
(
    `id`   bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    primary key (`id`)
) engine = INNODB
  default charset = utf8mb4
    comment = '测试';

insert into `demo`(id, name) value (1,'123456');