import java.util.Scanner;


public class main{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;

    System.out.println("WELCOME TO THE GRADEBOOK: ");
    System.out.println("--------------------------");
    System.out.println("Please Login");
    System.out.println("Username: ");
    username = input.next();

    System.out.println("Password: ");
    password = input.next();
    input.close();
    System.out.println(username + " " + password);





  }




}
