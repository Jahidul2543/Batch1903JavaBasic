package basic;

public class Phone{


 
public static void main(String[] args){
// Single line comment 
// I want to buy 5 phones
// We cant keep any information/data without Container --> variable
// Can I create a container without type?
// Java is a strongly typed Language.
// Every container shall have their own type explicitly mentioned
 
/* 
* This is called block comment
* Hi
* */

int numberOfPhone = 6;
 
int numberOfPhoneForMyFriend = 4;
//             =    6         +      4
int totalPhone = numberOfPhone + numberOfPhoneForMyFriend;

System.out.println("Total phone to buy " + totalPhone);

char phoneModel = 'X';

System.out.println(" Model of phone " + phoneModel);

// Yes = true, No = false
boolean didYouSleepLastNight = true;

// Anything with " " is String 

System.out.println( " Did you sleep last night? " +  didYouSleepLastNight);

// Apart from 8 Primitive type of data there is one called String
// Jahidul Islam
String firstName = "Jahidul ";
String lastName = "Islam";

String fullName = firstName + lastName;

System.out.print(" My Name " + fullName);

 }
 

}