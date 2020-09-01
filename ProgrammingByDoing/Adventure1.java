import java.util.Scanner;

public class Adventure1 {
    public static void main(String[] args) {
        System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE! \n\n You are in a creepy house! Would like to " +
                "go \"upsatirs\" or in to the \"kitchen\"? \n>");
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        if(choice.equals("kitchen")){
            System.out.print("There is a long countertop with dirty dishes everywhere. Off to one side there is, as " +
                    "expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\" \n> ");
            choice = input.next();
            if(choice.equals("refrigerator")){
                System.out.print("Inside the refrigerator you see foof and stuff. It looks pretty nasty. Would you " +
                        "like to eat some of the food? (\"yes\" or \"no\") \n>");
                choice = input.next();
                if(choice.equals("no")){
                    System.out.print("You die of starvation... eventually.");
                }
                else if(choice.equals("yes")){
                    System.out.print("There you go, enjoy the food");
                }
            }else if(choice.equals("cabinet")){
                System.out.print("look a book in the cabinet, you wanna read? (\"yes\" or \"no\") \n>");
                choice = input.next();
                if(choice.equals("no")){
                    System.out.print("well, you mised on a good story");
                }else if(choice.equals("yes")){
                    System.out.print("there you go, enjoy the story in the book");
                }
            }
        }else if(choice.equals("upstairs")){
            System.out.print("Upstairs you see hallway. At the end of the hallway is the master \"bedroom\". " +
                    "There is also a \"bathroom\" off the hallway. Where would you like to go? \n>");
            choice = input.next();
            if(choice.equals("bedroom")){
                System.out.print("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed " +
                        "is unmade. In the back of the room, the closet door is ajar. Would you like to open the " +
                        "door? (\"yes\" or \"no\") \n>");
                choice = input.next();
                if(choice.equals("no")){
                    System.out.print("Well, then I guess you'll never know what was in there. Thanks for playing," +
                            "I'm tired of making nested if statements");
                }else if(choice.equals("yes")){
                    System.out.println("look the closet has gummies, enjoy");
                }
            }else if(choice.equals("bathroom")){
                System.out.print("Your breathe stinks and you smell. Brush and shower(\"yes\" or \"no\") \n>");
                choice = input.next();
                if(choice.equals("yes")){
                    System.out.println("Greaaaat, lets make you fresh and sexy");
                }else if(choice.equals("no")){
                    System.out.println("Sad, get out filthy animal");
                }
            }
        }
    }
}
