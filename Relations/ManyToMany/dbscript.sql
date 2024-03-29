
  CREATE TABLE COURSE
   (	"COURSE_ID" NUMBER NOT NULL ENABLE, 
	"COURSE_NAME" VARCHAR2(20 BYTE), 
	 CONSTRAINT "COURSE_PK" PRIMARY KEY ("COURSE_ID"));

  
  CREATE TABLE STUDENT
   (	"STUDENT_ID" NUMBER NOT NULL ENABLE, 
	"STUDENT_NAME" VARCHAR2(20 BYTE), 
	 CONSTRAINT "STUDENT_PK" PRIMARY KEY ("STUDENT_ID");

  
  CREATE TABLE STUDENT_COURSE
   (	"STUDENT_ID" NUMBER, 
	"COURSE_ID" NUMBER, 
	 CONSTRAINT "STUDENT_COURSE_STUDENT_FK1" FOREIGN KEY ("STUDENT_ID")
	  REFERENCES "STUDENT" ("STUDENT_ID") ENABLE, 
	 CONSTRAINT "STUDENT_COURSE_COURSE_FK1" FOREIGN KEY ("COURSE_ID")
	  REFERENCES "COURSE" ("COURSE_ID") ENABLE
   ) ;