
import java.util.Scanner;
public class Whatsapp{
public static void main(String[] args){

System.out.println("\n\n------Presenting You the Best Messaging App Ever Created------\n\n");

Scanner sc = new Scanner(System.in);
AllFunctions function = new AllFunctions();

while( true){
System.out.println("             Main Menu      \n");
System.out.println("\nEnter Your Choice: \n");

System.out.println("1. Adding Contact...");
System.out.println("2. Display Contact...");
System.out.println("3. Send Message...");
System.out.println("4. Display Message...");
System.out.println("5. Delete Message...");
System.out.println("6. Delete Contact...");
System.out.println("7. Status of Message...");
System.out.println("8. Exit...\n");
int userChoice = sc.nextInt();

switch(userChoice){

case 1:

function.addContact();
break;

case 2:
function.displayContact();
break;

case 3:

function.sendMessage();
break;

case 4:

function.displayMessage();
break;

case 5:

function.deleteMessage();
break;

case 6:
function.deleteContact();
break;

case 7:
function.statusCheck();
break;



case 8:
System.exit(0);

}
}


}
}