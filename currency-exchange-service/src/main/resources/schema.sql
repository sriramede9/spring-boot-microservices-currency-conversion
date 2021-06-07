 -- drop table if exists exchange_value CASCADE 
 create table exchange_value (id bigint not null, fromvalue varchar(255), multiplication_factor double not null, to varchar(255), primary key (id))
