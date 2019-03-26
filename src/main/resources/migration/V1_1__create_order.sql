create table t_order(
  id varchar(256) not null primary key,
  created_by varchar(128),
  last_updated_by varchar(128),
  creation_date datetime,
  last_updated_Date datetime,
  active_flag bigint
);