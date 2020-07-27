public class Main {
    public static void main (String[] args) {
        long replenishmentAmount = 1500;
        int present = 100;
        long bonus = replenishmentAmount * present / 100 / 100;
        long limit = 1000;
        if (replenishmentAmount >= limit) {
        } else {
            bonus = 0;
        }
            System.out.println(bonus);
    }
    }
