package pattern_strategy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var cage = new Cage();
        var exit = false;
        HashMap<String, ISound> petsToCage = new HashMap<>();
        petsToCage.put("cat", new Cat());
        petsToCage.put("toyCat", new ToyCat());

        while (!exit) {
            System.out.println("to the cage -> cat or toyCat?");
            String petName = scanner.next();
            if (petsToCage.containsKey(petName)) {
                cage.setAnimal(petsToCage.get(petName));
                System.out.println(cage.soundFromCage());
            } else System.out.println("cannot put animal to thr cage");
            System.out.println("wanna exit?");
            exit = scanner.next().equals("yes");

        }
    }
}
