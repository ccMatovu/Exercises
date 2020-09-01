public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 20;
        int dogs = 15;

        if ( people < cats )
        {
            System.out.println( "Too many cats!  The world is doomed!" );
        }

        if ( people > cats )
        {
            System.out.println( "Not many cats!  The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
        }

        //The if statement checks if an expression evaluates to true and executes the code in its braces if it does. If it doesn't, then the code is not evaluated.
        //The curly braces indicate the scope of the if statement. Only the code in the braces is executed if the statement is true.
        //
    }
}
