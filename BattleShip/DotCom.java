// Samuel Rivera
// DotCom class for battleship game
// This class will represent the "battleship/dotcom" objects to sink


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

