import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] companyGuess = new int[7];
        for (int i = 0; i < companyGuess.length; i++) {
            companyGuess[i] = random.nextInt(10);
        }

        int[] playerGuess = new int[7];
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = random.nextInt(10);
        }

        Arrays.sort(companyGuess);
        Arrays.sort(playerGuess);

        int matches = 0;
        for (int i = 0; i < companyGuess.length; i++) {
            if (companyGuess[i] == playerGuess[i]) {
                matches++;
            }
        }

        System.out.println("Company's numbers: " + Arrays.toString(companyGuess));
        System.out.println("Player's numbers: " + Arrays.toString(playerGuess));
        System.out.println("Number of matches: " + matches);
    }
}