import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of dices rolled (1-6): ");
        int dices = sc.nextInt();
        System.out.print("Enter the outcome of roll: ");
        int outcome = sc.nextInt();

        System.out.println(findDiceCombinations(dices, outcome));
    }

    public static int findDiceCombinations(int numDice, int outcome) {
        if (numDice < 1 || outcome < numDice || outcome > numDice * 6) {
            return 0; // Impossible outcome
        }

        return countCombinations(numDice, outcome);
    }

    private static int countCombinations(int diceLeft, int target) {

        // System.out.println("Method call: DiceLeft = " + diceLeft + ", Target = " + target);

        if (diceLeft == 0) {
            return target == 0 ? 1 : 0;
        }

        int count = 0;
        for (int i = 1; i <= 6; i++) {
            count += countCombinations(diceLeft - 1, target - i);
        }
        return count;
    }
}