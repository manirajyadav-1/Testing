import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class WordJumbleGame {

    public static String choose() {
        List<String> words = Arrays.asList("computer", "science", "programming", "engineer", "water", "phone", "laptop");
        Random random = new Random();
        String pick = words.get(random.nextInt(words.size()));
        return pick;
    }

    public static String jumble(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        java.util.Collections.shuffle(letters);
        StringBuilder jumbled = new StringBuilder();
        for (String letter : letters) {
            jumbled.append(letter);
        }
        return jumbled.toString();
    }

    public static void thank(String p1name, String p2name, int pp1, int pp2) {
        System.out.println(p1name + ", Your score is: " + pp1);
        System.out.println(p2name + ", Your score is: " + pp2);
        System.out.println("Thanks for playing.");
        System.out.println("Have a nice day!");
    }

    public static void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1 name: ");
        String p1name = scanner.nextLine();

        System.out.print("Enter player 2 name: ");
        String p2name = scanner.nextLine();

        int pp1 = 0;
        int pp2 = 0;
        int turn = 0;

        while (true) {
            String pickedWord = choose();
            String qn = jumble(pickedWord);
            System.out.println(qn);

            if (turn % 2 == 0) {
                System.out.println(p1name + ", Your turn: ");
            } else {
                System.out.println(p2name + ", Your turn: ");
            }

            System.out.print("What's in your mind? ");
            String ans = scanner.nextLine();

            if (turn % 2 == 0) {
                if (ans.equals(pickedWord)) {
                    pp1++;
                    System.out.println("Your score is: " + pp1);
                } else {
                    System.out.println("Better luck next time, I thought: " + pickedWord);
                }
            } else {
                if (ans.equals(pickedWord)) {
                    pp2++;
                    System.out.println("Your score is: " + pp2);
                } else {
                    System.out.println("Better luck next time, I thought: " + pickedWord);
                }
            }

            System.out.print("Press 1 to continue or 0 to End: ");
            int c = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left over

            if (c == 0) {
                thank(p1name, p2name, pp1, pp2);
                break;
            }
            turn++;
        }
    }

    public static void main(String[] args) {
        play();
    }
}
