package Zaio.deliverables;

public class TestCollator {


    public static void main(final String[] args){

//      Test the parameters for the label
        System.out.println("Test 1");
        Collator collator = new Collator("Ruby Rose");
        if (collator.label().equals("Ruby Rose")){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");

        }
        //Test the parameters for the new label
        System.out.println("Test 2");
        collator = new Collator("");
        collator.label("Uptown girl");
        if (collator.label().equals("Uptown girl")){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
        //Test 3 recorded readings
        System.out.println("Test 3");
        collator = new Collator("");
        collator.recordReading(5);collator.recordReading(45);
        collator.recordReading(48);collator.recordReading(85);
        collator.recordReading(5);collator.recordReading(4);
        if (collator.numberOfReadings()==6){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        //Test 4 min value
        System.out.println("Test 4");
        collator = new Collator("");
        collator.recordReading(5);
        collator.recordReading(45);
        collator.recordReading(48);
        if (collator.minimum()>=5){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        //Test 5 max
        System.out.println("Test 5");
        collator = new Collator("");
        collator.recordReading(45);
        collator.recordReading(48);
        if (collator.maximum()== 48){
            System.out.println("Passed");
        }
        else {
            System.out.println("failed");
        }

        //Test 6 average
        System.out.println("Test 6");
        collator = new Collator("");
        collator.recordReading(45);collator.recordReading(707);
        collator.recordReading(41);collator.recordReading(5);
        collator.recordReading(1); collator.recordReading(48);
        collator.recordReading(5);collator.recordReading(46);
        collator.recordReading(7);collator.recordReading(45);
        if (collator.average()<= 95){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");

        }

        //Test 7 recording new readings
        System.out.println("Test 7");
        collator = new Collator("");
        collator.recordReading(15);collator.recordReading(45);
        collator.recordReading(8);collator.recordReading(85);
        if (collator.numberOfReadings()<=6){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        //Test 8 finding the minimum value
        System.out.println("Test 5");
        collator = new Collator("");
        collator.recordReading(555);
        collator.recordReading(45);
        collator.recordReading(484);
        if (collator.minimum()<=50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        //Test 9 finding Maximum value
        System.out.println("Test 9");
        collator = new Collator("");
        collator.recordReading(14045);
        collator.recordReading(48895);
        if (collator.maximum()>20000){
            System.out.println("Passed");
        }
        else {
            System.out.println("failed");
        }

        //Test 10 average
        System.out.println("Test 10");
        collator = new Collator("");
        collator.recordReading(4574);collator.recordReading(707);
        collator.recordReading(4501);collator.recordReading(555);
        if (collator.average()>1500){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        //Test 11 finding the total num readings
        System.out.println("Test 11");
        collator = new Collator("");
        collator.recordReading(4574);collator.recordReading(707);
        collator.recordReading(4501);collator.recordReading(555);
        if (collator.numberOfReadings()<15){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }












    }
}

