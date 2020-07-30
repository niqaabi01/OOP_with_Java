public class CowsAndBulls {
    public final static int NUM_DIGITS =4;
    public final static int MAX_VALUE= 9876;
    public final static int MIN_VALUE =1234;
    public final static int MAX_GUESSES=10;
    public int MysteryNumb;
    public int Guesses=10;
    public int bulls;

    public CowsAndBulls(int seed) {
        NumberPicker numberPicker = new NumberPicker(seed,1,9);
        int num=numberPicker.nextInt();
        int i = (num*10) +numberPicker.nextInt();
        int v = (i*10)+numberPicker.nextInt();
        int j= (v*10)+numberPicker.nextInt();
        MysteryNumb= j;
        guessesRemaining();
    }

    public int guessesRemaining() {
        return Guesses;
    }

    public Result guess(int guessNumber){
        int bulls= NumberUtils.countMatches(MysteryNumb,guessNumber);
        int cows = NumberUtils.countIntersect(MysteryNumb,guessNumber)-bulls;

        Result i =new Result(cows,bulls);
        Guesses= Guesses-1;
        return i;
    }
    public int giveUp(){
        Guesses =0;
        return MysteryNumb;
    }
    public boolean gameOver(){
        boolean flag= true;
         if (Guesses==0||bulls==4){
             return true;
         }else if (Guesses!=0 || bulls!=4){
             flag = false;
         }
        return flag;
    }
}