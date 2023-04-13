import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int groceries = 0;
     while(groceries<2){
       System.out.print("\033\143");
       System.out.print("   ");
       System.out.println("Welcome to the grocery store, I hope you find everything you need!" + "   ");
       System.out.println("   Where would you like to go first?  ");
       System.out.println("    *bathroom necessities and self care area*    ");
       System.out.println("   *food area*   ");
       String move = input.nextLine();
       System.out.print("\033\143");
       switch(move){
         case "bathroom necessities and self care area":
           groceries++;
           System.out.println("Don't forget shampoo and toothpaste, its always the smaller things that slip through... :/");
           System.out.println("Press enter to continue:");
           input.nextLine();
           break;
         case "food area":
           groceries++;
           System.out.println("You might want to make it quick over in the other aisles, the frozen food might melt.");
           System.out.println("Press enter to conintue:");
             input.nextLine();
           break;
         default:
           System.out.println("\uD83D\uDE15");
           System.out.println("This is a grocery store, please pick a specific location within it.");
       }
     }
    System.out.println("Thank you for shopping here, have a nice day!");
  }
}
//was gonna do it so you could pick your own groceries up to 10, wasn't sure how to go about it without reconsructing the entire thing so i just stuck to the base code