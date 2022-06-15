import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {

        // Get dog name user input
        System.out.println("What is your dog's name?");
        Scanner dogScanner = new Scanner(System.in);
        String dogName = dogScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        // Calculate dog breed percentages
        Random random = new Random();
        int[] breed = new int[5];
        breed[4] = 100;
        for (int i = 0; i < 4; i++){
            breed[i] = random.nextInt(100/4);
            breed[4] -= breed[i];
        }

        // Print dog breed percentages
        System.out.println(breed[0] + "% St. Bernard");
        System.out.println(breed[1] + "% Chihuahua");
        System.out.println(breed[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(breed[3] + "% Common Cur");
        System.out.println(breed[4] + "% King Doberman");
    }
}
