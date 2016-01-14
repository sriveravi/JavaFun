// Samuel Rivera
// This is the main class for the battleship game
//

public class BattleShip {

    public static void main( String[] args){

        int numGuesses = 0; // track guesses

        // decide DotCom location ([0 to 4 start])
        int locStart = (int) (5*Math.random());
        int[] loc = {locStart,locStart+1,locStart+2};

        // make DotCom to sink, initialize it
        DotCom theCom = new DotCom();
        theCom.setLoc( loc );

        // make helper for inputting guesses
        GameHelper helper = new GameHelper();
        String guess; 
        String locResult;

        // keep guessing while is afloat
        boolean isAfloat = true;
        while ( isAfloat ){
            guess = helper.getUserInput("Enter number, 0-6:");
            locResult = theCom.checkLoc(guess);
            System.out.println( guess+ " was a " + locResult );
            numGuesses++; // increment guess count

            if (locResult.equals("kill")){
                isAfloat = false;
                System.out.println("You took " + numGuesses + " guesses.");
            }
        } // end while afloat
    } // end main


} // end BattleShip class
