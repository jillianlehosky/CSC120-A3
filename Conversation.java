import java.util.ArrayList;
import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    ArrayList<String> greetings = new ArrayList<String>();
      greetings.add("Hello there! What is on your mind?");
      greetings.add("Tell me about your day");

    ArrayList<String> closings = new ArrayList<String>();
      closings.add("Have a great day!");
      closings.add("Goodbye!");

    ArrayList<String> responses = new ArrayList<String>();
      responses.add("Slay");
      responses.add("Yasssss");
      responses.add("Yeah, totally");

    Scanner input = new Scanner(System.in);
    ArrayList <String> user_inputs = new ArrayList<String>();

    //(can use same scanner - don't need new one every input from user)"""
    System.out.println("Enter an integer: ");
    int numRounds = input.nextInt();
    System.out.println("Hi! What's on your mind!");
      for (int i=0; i<numRounds; i++){
        String user_input = input.nextLine();
        //that is what's prompting the users to respon
        //adding to a list so we can print later
        //this does it
        user_inputs.add(user_input);
        //this is for later step where we print out the list
        System.out.println("Cool");
      } input.close();
      System.out.println("goodbye");

    




    // You will start the conversation here.
  }
}
