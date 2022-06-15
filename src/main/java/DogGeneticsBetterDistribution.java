import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DogGeneticsBetterDistribution {
    public static void main(String[] args) {

        // Get dog name user input
        System.out.println("What is your dog's name?");
        Scanner dogScanner = new Scanner(System.in);
        String dogName = dogScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        // Calculate dog breed percentages
        Random random = new Random();
        double[] breed = new double[5];

        // Random distribution for breeds
        String[] dogBreedTypes = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        HashMap<String, Double> dogBreeds = new HashMap<>();

        double total = 0;
        for (int i = 0; i < dogBreedTypes.length; i++){
            double rand = random.nextDouble(100);
            dogBreeds.put(dogBreedTypes[i], rand);
            total += rand;
        }

        // Normalize out of 100 & print
        for (HashMap.Entry<String, Double> entry : dogBreeds.entrySet()) {
            System.out.println((int) Math.round(entry.getValue() * (100 / total)) +  "% " + entry.getKey());
        }
    }
}
