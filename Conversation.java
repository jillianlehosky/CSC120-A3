import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {
//initialize arrays of generic closings and responses
    ArrayList<String> closings = new ArrayList<String>();
      closings.add("Have a great day");
      closings.add("Thanks for chatting");
      closings.add("Have a slay day");

    ArrayList<String> responses = new ArrayList<String>();
      responses.add("Slay");
      responses.add("Yas");
      responses.add("Totally");

//create scanner for user input
    Scanner input = new Scanner(System.in);
//create empty arrays to store user inputs and computer responses for printing transcript
    ArrayList <String> user_input_store = new ArrayList<String>();
    ArrayList <String> output_store = new ArrayList<String>();  
//ask for number of rounds  
    System.out.println("enter an integer: ");
    int numRounds = input.nextInt();
    input.nextLine(); //weird thing required to have proper number of rounds
    System.out.println("Hi! What's on your mind? I am kind of stupid so no punctuation please");
      for (int i=0; i<numRounds; i++){
        //get input from user
        String user_input = input.nextLine();
        //add response to a list
        user_input_store.add(user_input);
       //run mirrorphrase command to mirror all aplicable words
        String mirrorphrase = wordMirror(user_input);
        if(mirrorphrase.equals(user_input)){ //if mirrorphrase didn't change any words
          String response = getRandomElement(responses);//pick a random response
          System.out.println(response);//display random response
          output_store.add(response);//store for transcript printing
        }
        else { //if mirrorphrase changed any words
          System.out.println(mirrorphrase + "?"); //print morrored sentence as a question
          output_store.add(mirrorphrase + "?");//store for transcript printing
        }   
         }
      input.close();//close scanner
      String closing = getRandomElement(closings);//choose random closing
      System.out.println(closing); //print closing
      System.out.println(" ");//print empty line (not necessary, just looks nice)
      System.out.println("Transcript:"); //print transcript header
      for (int i=0; i<numRounds; i++){ //loop through number of rounds
        System.out.println(user_input_store.get(i));//print user input for that round
        System.out.println(output_store.get(i));//print output given for that round
      }
      System.out.println(closing);//print closing 
    }

  public static String wordMirror(String phrase){
      String[] user_input_list = phrase.split(" "); // split string by spaces, turn into array
      for (int i = 0; i < user_input_list.length; i++){ //iterate over each item in array
        if (user_input_list[i].equals("i")){//if ith item equals a certain mirror word
           user_input_list[i] = "you";}//replace it with complemantary mirror word
        else if (user_input_list[i].equals("I")){
          user_input_list[i]= "You";}
        else if (user_input_list[i].equals("you")){
          user_input_list[i]= "i";}
        else if (user_input_list[i].equals("You")){
            user_input_list[i]= "I";}
        else if (user_input_list[i].equals("my")){
          user_input_list[i] = "your";}
        else if (user_input_list[i].equals("My")){
            user_input_list[i] = "Your";}
        else if (user_input_list[i].equals("your")){
          user_input_list[i] = "my";}
        else if (user_input_list[i].equals("Your")){
          user_input_list[i] = "My";}
        else if (user_input_list[i].equals("am")){
          user_input_list[i] ="are";}
        else if (user_input_list[i].equals("are")){
          user_input_list[i] = "am";}
          else if (user_input_list[i].equals("Are")){
            user_input_list[i] = "Am";}
        }
        String mirroredphrase = String.join(" ",user_input_list); //make array a string again
        return mirroredphrase;
  }
//code found from online to generate a random element out of an array
  public static String getRandomElement(ArrayList<String> list)
  {
      Random rand = new Random();
      return list.get(rand.nextInt(list.size()));
  }
}
