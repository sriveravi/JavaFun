// Calculate Area of circle
//

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalcArea
{
    static double radius;
    static double area;
    static final double PI = 3.14159;

    static private StringTokenizer stok;
    static private BufferedReader br
                     = new BufferedReader( new InputStreamReader( System.in));

    // main function to calculate area
    public static void main(String[] args)
    {
        radius = readDouble();
        area = radius*radius*PI;
        System.out.println("Area of circle with radius " + radius + " is " + area );
    }

    // helper function to read input
    public static double readDouble()
    {
        double d = 0;
        try
        {   String str = br.readLine();
            stok = new StringTokenizer (str); // try without spaces next time
            d = new Double (stok.nextToken ()).doubleValue ();
        }
        catch (IOException e){System.out.println(e); }
        return d;

    }

}
