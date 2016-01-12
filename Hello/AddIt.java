// Simple program to take an interger and add to 5 and show value
//

public class AddIt
{
    public static void main( String[] args)
    {
        int input = Integer.parseInt(args[0]);
        int result = 5 + input;
        System.out.print("5 + " +  input + " = " + result );
        System.out.println();

    }

}
