package com.testyantra.basics;

public class DataTypes {

	public static void main(String[] args) {
		// range -128 to +127
		Byte b1=-128;
byte b2=127;
byte b3=87;
//byte b4=222; //compile time error
System.out.println(b1+" "+b2+" "+b3);
//Short data type
//-32,768 to 32,767 (inclusive)
short s1=12;
short s2=123;
short s3=1234;
short s4=-32768;
short s5=32767; //it will allow up to here only
//short s6=32768; //compile time error
short s7=3245;
System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+"  "+s7);
System.out.println(" ");
System.out.println(Byte.SIZE);
System.out.println(" ");
System.out.println(Short.SIZE);

char ch1='a';
//char ch2='cb';//compile time error invalid character constant
char c='a';
//byte b=c; //type missmatch cannot convert from character to byte
byte bb1='a';
byte bb2='z';
System.out.println(bb1);
System.out.println(bb2);

short ss1='a';
short ss2='z';
System.out.println(ss1);
System.out.println(ss2);
//short ss3=ch1;//type missmatch we cannot convert from 



	}

}
