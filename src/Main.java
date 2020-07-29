public class Main {
    public static void main(String[] args) {
        long deceivingSum = 100;
        long replenishmentAmount = 1200;
        long limit = 1000;
        long bonus = 0;
        if (replenishmentAmount >= limit)
            bonus = replenishmentAmount / 100;
        long totalAmount = deceivingSum + replenishmentAmount + bonus;
        System.out.println(" Бонус " + bonus);
        System.out.println(" Итоговая сумма " + totalAmount);
    }
}
