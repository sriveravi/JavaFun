// Samuel Rivera
// DotCom class for battleship game


class DotCom {

    private int[] loc; 
    private int numHits = 0;

    public void setLoc( int[] locIn){
        loc = locIn;
    }

    public String checkLoc( String guess ){
        String result = "miss";
        int g = Integer.parseInt(guess);

        // return hit if guess in loc
        for (int locItem : loc ){
            if ( g == locItem ){
                result = "hit";
                numHits++;
                break;
            }
        }
        // return kill if hit a bunch
        if ( numHits == loc.length){
            result = "kill";
        }
        return result; 
    }
} // end DotCom


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


