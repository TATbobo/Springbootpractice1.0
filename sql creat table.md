# 数据库建表语句:smile::
create table table_name
(
  id int primary key,
  name varchar(255),
  foreign_id int,
  foreign key(foreign_id) references othertable(id)
)
