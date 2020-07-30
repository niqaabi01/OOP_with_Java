public class TestJumpRecord {
    public static void main(final String[] args){
        String p = "Pass";
        String f = "Fail";
        System.out.println("Test 1");
        // test amount of jumps
        JumpRecord jumpRecord = new JumpRecord();
        jumpRecord.recordJump(12.00);
        jumpRecord.recordJump(25);
        jumpRecord.recordJump(156);
        jumpRecord.recordJump(14);
        if (jumpRecord.jumps()==4){
            System.out.println(p);
        } else  {
            System.out.println(f);

        }
//       Test for number of fouls
        System.out.println("Test 2");
        if (jumpRecord.foulJumps()==1){
            System.out.println(p);
        }else {
            System.out.println(f);
        }
        // check if value is foul
        System.out.println("Test 3");
        if(jumpRecord.isFoul(4)){
            System.out.println(p);
        }else {
            System.out.println(f);
        }

        // Test if jumps are in range and not out of max limit
        System.out.println("Test 4");
        if (jumpRecord.jumps() <= jumpRecord.maxJumps()){
            System.out.println(p);
        }else
            System.out.println(f);

        // Test for for the longest jumps
        System.out.println("Test 5");
        if(jumpRecord.getLongest()==156){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }
        // get jump distance for the give num of jump
        System.out.println("Test 6");
        if (jumpRecord.getJumpDistance(3)==156){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }

        System.out.println("Test 7");
        if (jumpRecord.finished()){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }








        System.out.println("Test 8");
        JumpRecord jumpRecord2 = new JumpRecord();
        jumpRecord2.recordJump(120);
        jumpRecord2.recordJump(127);
        jumpRecord2.recordJump(14);
        if (jumpRecord2.jumps()==3){
            System.out.println(p);
        } else  {
            System.out.println(f);

        }
//       Test for number of fouls
        System.out.println("Test 9");
        if (jumpRecord2.foulJumps()==0){
            System.out.println(p);
        }else {
            System.out.println(f);
        }

        // check if value is foul
        System.out.println("Test 10");
        if(!jumpRecord2.isFoul(3)){
            System.out.println(p);
        }else {
            System.out.println(f);

        }

        // Test if jumps are in range and not out of max limit
        System.out.println("Test 11");
        if (jumpRecord2.jumps() <= jumpRecord2.maxJumps()){
            System.out.println(p);
        }else
            System.out.println(f);

        // Test for for the longest jumps
        System.out.println("Test 12");
        if(jumpRecord2.getLongest()==127){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }
        // get jump distance for the give num of jump
        System.out.println("Test 6");
        if (jumpRecord2.getJumpDistance(3)==14){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }

        System.out.println("Test 7");
        if (jumpRecord2.finished()){
            System.out.println(p);
        }
        else {
            System.out.println(f);
        }


        

        }
    }
