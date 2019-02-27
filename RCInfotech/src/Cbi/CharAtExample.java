package Cbi;

public class CharAtExample {

	public static void main(String[] args) {
		  
String name="javatpoint";  
char ch=name.charAt(6);//returns the char value at the 4th index  
System.out.println(ch);  

//java string CompareTo() example
	
String s1="hello";  
String s2="hello";  
String s3="meklo";  
String s4="hemlo";  
String s5="flag";  
String s6="ravi";
System.out.println(s1.compareTo(s2));//0 because both are equal  
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
System.out.println(s1.compareTo(s6));//2 because "h" is 2 times greater than "f"
	
//java string Concat() method example

String str1 = "Hello";  
String str2 = "Javatpoint";  
String str3 = "Reader";  
// Concatenating one string   
String str4 = str1.concat(str2);          
System.out.println(str4);  
// Concatenating multiple strings  
String str5 = str1.concat(str2).concat(str3);  
System.out.println(str5);  
	

//java String Contains();

String str = "Hello Javatpoint readers";  
boolean isContains = str.contains("Javatpoint");  
System.out.println(isContains);  
// Case Sensitive  
System.out.println(str.contains("javatpoint"));
System.out.println(str.contains("Readers"));

//java String endsWith();

String str6 = "Welcome to Javatpoint.com";  
System.out.println(str6.endsWith("point"));  
if(str6.endsWith(".com")) {  
    System.out.println("String ends with .com");  
}else System.out.println("It does not end with .com");  

//

String str7="javatpoint";  
String str8="javatpoint";  
String str9="JAVATPOINT";  
String str10="python";  
System.out.println(str7.equals(str8));//true because content and case is same  
System.out.println(str7.equals(str9));//false because case is not same  
System.out.println(str7.equals(str10));//false because content is not same
	}

	}


