

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AllFunctions{

String[] contactNumbers = new String[100];
Scanner sc = new Scanner(System.in);
  LocalTime currentTime = LocalTime.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
int count=0; 
int i=0; 

boolean isNotPresent ;
public void addContact(){        // Add Contact Function 


String addContinue;

do{
System.out.println("\n\n Enter Number YOU want to ADD: ");
contactNumbers[i] = sc.nextLine().trim();
System.out.println("\nNumber: " + contactNumbers[i] + " Added Successfully..." );
i++;
count++;


System.out.println("\n\nTo Add more Numbers press ( y ) or press ( q ) for main Menu: ");
addContinue = sc.nextLine().trim();
}while ( addContinue.equalsIgnoreCase("y"));

}



void displayContact(){            // Display Contact Function

System.out.println("\n Displaying All Entered Contact Numbers: \n");
for( int i=0; i < count; i++){
System.out.println(contactNumbers[i]);
}

}


String[] messageNumber = new String[100];
String[] messageContent = new String[100];
String messageChoice;
int j =0 , h=0 ;

void sendMessage(){                   // Sending Messaging Function

do{
System.out.println("\nEnter Number to which You want to send Message: \n");
 messageNumber[j] = sc.nextLine().trim();
j++;
 

System.out.println("\n Enter Message You want to send: \n");
 messageContent[h] = sc.nextLine().trim();
h++;

System.out.println("\n\n Message sent Successfully to: " + messageNumber[j-1] + "  Time: " + currentTime.format(formatter) + "   " +  java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MM-dd-yyyy")) );

System.out.println("\nSend another Message press ( a ) or  For main Menu press ( q ) ");
 messageChoice = sc.nextLine(); 
}while( messageChoice.equalsIgnoreCase("a"));

}




void displayMessage(){          // Displaying the sent message

System.out.println("\nDisplaying all the Sent Messages:....\n\n");

for ( int k=0 ; k < h; k++){
System.out.println("Message:  -  "+ messageContent[k] + "  -   is sent to:  "+ messageNumber[k] + "    At  Time: " + currentTime.format(formatter) + "   " +      java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MM-dd-yyyy"))       + "\n");
}
}



String deleteMessageNumber;
void deleteMessage(){            // Deleteing Message Function

do{


 isNotPresent = true;
System.out.println("\nEnter Number Whose Messages You want to Delete: \n");
deleteMessageNumber = sc.nextLine().trim();



for(String element : messageNumber){
if ( element != null && element.equals(deleteMessageNumber)){
  isNotPresent = false;
   break;
}
}

if(isNotPresent){
System.out.println("\n\nEntered Number is not Correct\n");
}



for( int b=0; b< j; b++){
if ( deleteMessageNumber.equals( messageNumber[b])){
messageNumber[b]= null;
messageContent[b] = null;
System.out.println("\n\nDeleted Successfully....");
}
}

System.out.println("\n To Delete another Message press ( a ) or  For main Menu press ( q ) ");
 messageChoice = sc.nextLine(); 
}while( messageChoice.equalsIgnoreCase("a"));

} 




String deleteNumber;

void deleteContact(){    // Delete Contact Function

do{
isNotPresent = true;
System.out.println("\nEnter Number You want to Delete: \n");
deleteNumber = sc.nextLine().trim();

for(String element : contactNumbers){
if ( element != null && element.equals(deleteNumber)){
  isNotPresent = false;
   break;
}
}

if(isNotPresent){
System.out.println("\n\nEntered Number is not Correct\n");
}

for( int b=0; b< contactNumbers.length; b++){
if ( deleteNumber.equals( contactNumbers[b])){
messageNumber[b]= null;
contactNumbers[b]= null;
messageContent[b] = null;
System.out.println("\n\nDeleted Successfully....");
}
}

System.out.println("\n To Delete another Number press ( a ) or  For main Menu press ( q ) ");
 messageChoice = sc.nextLine(); 
}while( messageChoice.equalsIgnoreCase("a"));

}


String statusNumber;

void statusCheck(){   //Status Check Function

do{
isNotPresent= true;
System.out.println("\n Which Number Message Status You want to check:... ");
System.out.println("\nEnter Number Here:  ");
statusNumber = sc.nextLine();


for(String element : messageNumber){
if ( element != null && element.equals(statusNumber)){
  isNotPresent = false;
   break;
}
}

if(isNotPresent){
System.out.println("\n\nEntered Number is not Correct\n");
}


for ( String s : messageNumber  ) {
  if (  s != null && s.equals(statusNumber) )

{
System.out.println("\n\n "+ statusNumber + " Message Status is:    Seen " );
break;
}
}

System.out.println("\n  press ( a ) to check another Message Status or  For main Menu press ( q ) ");
 messageChoice = sc.nextLine(); 
}while( messageChoice.equalsIgnoreCase("a"));


}



}