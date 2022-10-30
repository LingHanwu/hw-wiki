# 电子书表
drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `name` varchar(50) not null comment '名称',
    `category1_id` bigint not null default 0 comment '分类1',
    `category2_id` bigint not null default 0 comment '分类2',
    `description` varchar(200) not null comment '描述',
    `cover` varchar(200) not null default 'cover' comment '封面',
    `doc_count` int not null default 0 comment '文档数',
    `view_count` int not null default 0 comment '阅读数',
    `vote_count` int not null default 0 comment '点赞数',
    primary key (`id`)
)engine = INNODB
 default charset = utf8mb4
    comment = '电子书';

insert into `ebook` (id,name,description)values (1,'Spring Boot 入门教程','零基础入门Java开发，企业级用用开发的最佳首选框架');
insert into `ebook` (id,name,description)values (2,'vue 入门教程','零基础入门vue开发，企业级用用开发的最佳首选框架');
insert into `ebook` (id,name,description)values (3,'Python 入门教程','零基础入门Python开发，企业级用用开发的最佳首选框架');

