CREATE TABLE "HYDRABE"."PAYMENT" 
   (	"P_ID" NUMBER NOT NULL ENABLE, 
	"D_COLUMN" VARCHAR2(20 BYTE), 
	"AMOUNT" NUMBER, 
	"CARD_TYPE" VARCHAR2(20 BYTE), 
	"CHEQUE_TYPE" VARCHAR2(20 BYTE), 
	 CONSTRAINT "PAYMENT_PK" PRIMARY KEY ("P_ID"));