// Samuel Rivera
// DotComTester class for battleship game
// This class will test the DotCom class, which represents objects to sink



public class DotComTester {

    // Main tester vunction
    public static void main(String[] args){

        // init DotCom and set positions
        DotCom d = new DotCom();
        int [] locVec = {2,3,4};
        d.setLoc( locVec );

        String result = d.checkLoc( "1");

        // make sure a miss
        if (result.equals("miss")) {
            System.out.print("pass");
        }
        else {
            System.out.print("fail");
        }
        // make sure a hit
        result = d.checkLoc( "3");
        if ( result.equals("miss")){
            System.out.println(", fail");
        }
        else {
            System.out.println(", pass");
        }

    } // end main
}// end DotComTester


