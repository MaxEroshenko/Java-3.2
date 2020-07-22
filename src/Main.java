public class Main {
    public static void main (String[] args) {
        long replenishmentAmount = 1500;
        int present = 100;
        long bonus = replenishmentAmount * present / 100 / 100;
        if (replenishmentAmount >= 1000)
        System.out.println(bonus);
    }
}
