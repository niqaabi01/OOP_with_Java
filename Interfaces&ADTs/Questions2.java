package Zaio.deliverables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions2 {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int option;
        List animals = new ArrayList();
        do {
            System.out.println("What animal do you see? (1) Cat (2) Dog (3) Cow (4) quit");
            option = s.nextInt();
            switch (option) {
                case 1:
                    animals.add(new Cat());
                    break;
                case 2:
                    animals.add(new Dog());
                    break;
                case 3:
                    animals.add(new Cow());
                    break;
            }
        } while (option != 4);

        System.out.println("The animals want to say goodbye:");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(((MakesSound)animals.get(i)).makeNoise());
        }

    }
}
