package com.hdfc.homeloans;

public class ABC 
{
	
byte b=127;//1byte
short s=-32768;//2bytes
int i=2147483647;//4bytes
long l=2147483647;// 8bytes

float f=100.34f;//4bytes
double d=200.45;//8bytes

boolean bb=true; //or false
char ch='a';//2bytes

String str="sivateja";

public static void main(String[] args) {

	ABC obj=new ABC();
	
	System.out.println("Byte :" + obj.b);
	System.out.println("short :" + obj.s);
	System.out.println("int :" + obj.i);
	System.out.println("long :" + obj.l);
	System.out.println("float :" + obj.f);
	System.out.println("double :" + obj.d);
	System.out.println("boolean :" + obj.bb);
	System.out.println("char :" + obj.ch);

}

}
