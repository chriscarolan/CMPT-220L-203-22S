package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        if(true)
        {
            system.out.println("words");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if(!true)
        {
            System.out.println("wrong words");
        }
        else
        {
            System.out.println("right words");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if(!true)
        {
            System.out.print("dont print these");
        }
        else if(true)
        {
            System.out.print("this is the good one");
        }
        else
        {
            System.out.print("no");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        boolean cool = true;
        boolean uncool = false;
        if(cool)
        {
            System.out.println("you are cool");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean cool = true;
        boolean uncool = false;
        if(cool && !uncool)
        {
            System.out.println("you are very cool");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean cool = true;
        boolean uncool = false;
        if(cool || uncool)
        {
            System.out.println("you might be cool");
        }
    }
}
