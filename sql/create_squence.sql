-- sequences


-- book_seq
drop sequence  book_sep;

create sequence book_seq
start with 1
increment by 1
maxvalue 9999999999;

-- category_seq

drop sequence  category_seq;

create sequence category_seq
start with 1
increment by 1
maxvalue 9999999999;

-- member_seq

drop sequence  member_seq;

create sequence member_seq
start with 1
increment by 1
maxvalue 9999999999;

-- cart_seq

drop sequence  cart_seq;

create sequence cart_seq
start with 1
increment by 1
maxvalue 9999999999;

-- order_seq

drop sequence  order_seq;

create sequence order_seq
start with 1
increment by 1
maxvalue 9999999999;

-- order_book_seq

drop sequence  order_book_seq;

create sequence order_book_seq
start with 1
increment by 1
maxvalue 9999999999;


