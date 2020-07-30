package Zaio.deliverables;
import java.util.Scanner;

public class Meteorology {
    public static void main(final String[] args){
        
        
        
//        Creating Collators for each object
        Collator collator = new Collator("Temperature");
        Scanner scanner = new Scanner(System.in);

        // Creating Humidity Collators for each object
        Collator collatorHum = new Collator("Humidity");

        // Creating Pressure Collators for each object
        Collator collatorPress = new Collator("Pressure");

        System.out.println("Meteorology Program");
        System.out.println("Make a selection and press return."+ "\n"+
                "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
        int User_input =scanner.nextInt();
        boolean Flag = true;

        while (Flag){

            if (User_input ==1 ){
                System.out.println("Enter a value");
                int i = scanner.nextInt();
                collator.recordReading(i);
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();
            }
            //input value for pressure
            if (User_input== 2){
                System.out.println("Enter a value");
                int x = scanner.nextInt();
                collatorPress.recordReading(x);
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();

            }
            //input Value for humidity
            if (User_input== 3){
                System.out.println("Enter a value");
                int n = scanner.nextInt();
                collatorHum.recordReading(n);
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();
            }
            // printing max Values
            if (User_input == 4){
                if (collator.maximum()== 0){
                    System.out.println("Maximum temperature: -");
                }
                else {
                    System.out.println("Maximum temperature: "+ collator.maximum());
                }
                if(collatorPress.maximum()==0){
                    System.out.println("Maximum pressure: -");
                }
                else{
                    System.out.println("Maximum pressure: "+ collatorPress.maximum());
                }
                if (collatorHum.maximum()==0){
                    System.out.println("Maximum humidity: -");
                }
                else{
                    System.out.println("Maximum humidity: "+ collatorHum.maximum());
                }

                
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();
            }
            //printing minimum values
            if (User_input == 5){
                if (collator.minimum()== 0){
                    System.out.println("Minimum temperature: -");
                }
                else {
                    System.out.println("Minimum temperature: "+ collator.minimum());
                }
                if(collatorPress.minimum()==0){
                    System.out.println("Minimum pressure: -");
                }
                else{
                    System.out.println("Minimum pressure: "+ collatorPress.minimum());
                }
                if (collatorHum.minimum()==0){
                    System.out.println("Minimum humidity: -");
                }
                else{
                    System.out.println("Minimum humidity: "+ collatorHum.minimum());   
                }
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();

            }
            // printing average values
            if (User_input== 6){
                if (collator.average()== 0.0){
                    System.out.println("Average temperature: -");
                }
                else {
                    System.out.println("Average temperature: "+ collator.average());
                }
                if(collatorPress.average()==0.0){
                    System.out.println("Average pressure: -");
                }
                else{
                    System.out.println("Average pressure: "+ collatorPress.average());
                }
                if (collatorHum.average()==0.0){
                    System.out.println(collatorHum.average());
                }
                else{
                    System.out.println("Average humidity: "+ collatorHum.average());

                }
                
                
                
                System.out.println("Make a selection and press return."+ "\n"+
                        "1. Record a temperature reading."+ "\n"+"2. Record a pressure reading."+"\n"+
                        "3. Record a humidity reading."+"\n"+"4. Print maximum values"+"\n"+
                        "5. Print minimum values"+"\n"+"6. Print average values"+"\n"+"7. Quit");
                User_input =scanner.nextInt();
            }

            else if(User_input == 7) {
                Flag = false;
            }


        }

    }
}
