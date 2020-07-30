package Zaio.deliverables;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class palinperfect {

    public static void main(String[] args) {
	Scanner input_user = new Scanner(System.in);

	String start_int;
	System.out.println("Enter start point N:");
	start_int=input_user.next();
	int start = Integer.parseInt(start_int);

	String end_int;
	System.out.println("Enter ending point M:");

	end_int = input_user.next();
	int end = Integer.parseInt(end_int);
	System.out.print("The palindromic perfect squares are as follows:\n");
	for (int i = start; i <=end; i++){
	    int a,n1,n2=0;
	    n1=i;

	    for(a = 0; a<=i; a++){
	        if (a ==Math.sqrt(n1)){
	            n2 =n1;
            }
        }
	    int number = n2;
	    int reversedNumber= 0;
	    int temp= 0;
	    while(number > 0){
	        temp = number %10;
	        number=number/ 10;
	        reversedNumber=reversedNumber*10 + temp;
        }
	    if (n1 == reversedNumber)
            System.out.println(n1);


    }


    }
}
