create table t_order(
  id varchar(256) not null primary key,
  created_by varchar(128),
  last_updated_by varchar(128),
  creation_date datetime,
  last_updated_Date datetime,
  active_flag bigint,
  buy_id varchar(128),
  order_no varchar(128),
  buyer_name varchar(128)
);
create table t_order_line(
  id bigint not null primary key ,
  creation_date datetime,
  last_updated_Date datetime,
  price numeric,
  order_id varchar(256) not null
);