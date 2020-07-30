import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collection.*;

public class JumpRecord {
    private int jumps;
    private double maximum;
    private int getJumps;
    private final int maxjumps;
    private int fouls;
    ArrayList<Integer> JumpValues = new ArrayList<>();


    public JumpRecord() {
        jumps = 0;
        maximum = 0;
        maxjumps = 3;

    }

    void recordJump(double distance) {
        int jump1 = (int) distance;
        JumpValues.add(jump1);
        if (jumps < 1) {
            jumps = 1;
        } else {
            jumps++;

        }
        if (jumps>3){
            foulJumps();
            recordFoulJump();
        }
    }


    void recordFoulJump() {
        if (jumps()>3){
        JumpValues.get(JumpValues.size()-1);
        }

    }


    int jumps () {
        return jumps;
        }

        boolean finished() {
            if (jumps() >= maxJumps()){
                return true;
            }else {
                return false;
            }
        }

        int maxJumps() {
            return maxjumps;
        }
        int foulJumps() {
        fouls=0;
        if(jumps>3) {
            fouls++;
        }
        return fouls;
        }

        boolean isFoul(int n){
            if (0<n&&n<jumps()) {
                return false;
            }
            else {
                return true;

            }
        }

        double getJumpDistance ( int n){
        n--;
        int result =JumpValues.get(n);
        return result;

        }
        int getLongest(){
        int output = 0;
        if (jumps()>0&&foulJumps()<jumps()){
            output= Collections.max(JumpValues);
            return output;
        }
            return output;
        }
    }