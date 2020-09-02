import java.util.Scanner;

public class Adventure2 {
    public static void main(String[] args) {
        System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE! ");
        Scanner input = new Scanner(System.in);
        boolean play = true;

        while(play){
            System.out.print("\n You are in a creepy house! Would like to go \"upsatirs\" or in to the\"kitchen\"?\n>");
            String choice = input.next();
            if(choice.equals("kitchen")){
                System.out.print("There is a long countertop with dirty dishes everywhere. Off to one side there is, as " +
                        "expect, a refrigerator. You may open the \"refrigerator\" or go back \"back\" \n> ");
                choice = input.next();
                if(choice.equals("refrigerator")){
                    System.out.print("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you " +
                            "like to eat some of the food? (\"yes\" or \"no\") \n>");
                    choice = input.next();
                    if(choice.equals("no")){
                        System.out.print("You die of starvation... eventually.");
                        choice = "endgame";
                        play = false;
                    }
                    else if(choice.equals("yes")){
                        System.out.print("There you go, enjoy the food");
                        choice = "endgame";
                        play = false;
                    }
                }else if(choice.equals("back")){
                    choice = "goback";
                }
            }
            if(choice.equals("upstairs")){
                System.out.print("Upstairs you see hallway. At the end of the hallway is the master \"bedroom\". " +
                        "There is also a \"bathroom\" off the hallway. Or, you can\n" +
                        "go back \"downstairs\". Where would you like to go? \n>");
                choice = input.next();
                if(choice.equals("bedroom")){
                    System.out.print("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed " +
                            "is unmade. In the back of the room, the closet door is ajar. Would you like to open the " +
                            "door? (\"yes\" or \"no\") \n>");
                    choice = input.next();
                    if(choice.equals("no")){
                        System.out.print("Well, then I guess you'll never know what was in there. Thanks for playing," +
                                "I'm tired of making nested if statements");
                        choice = "endgame";
                        play = false;
                    }else if(choice.equals("yes")){
                        System.out.println("look a lion in the closet. It escaped from the nearby zoo." +
                                " It has been resting and hasn't eaten all day. You are dinner, rest in peace ");
                        choice = "endgame";
                        play = false;
                    }
                }else if(choice.equals("bathroom")){
                    System.out.print("Your breathe stinks and you smell. Brush and shower(\"yes\" or \"no\") \n>");
                    choice = input.next();
                    if(choice.equals("yes")){
                        System.out.println("Greaaaat, lets make you fresh and sexy");
                        choice = "endgame";
                        play = false;
                    }else if(choice.equals("no")){
                        System.out.println("Sad, I'm tired of talking to a filthy animal like you anyway, bye");
                        choice = "endgame";
                        play = false;
                    }
                }else if(choice.equals("downstairs")){
                    choice = "goback";
                }
            }
        }

    }
}
