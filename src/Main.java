// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 100;
        int amount = 1300;
        int bonus = 0;
        if (amount >= 1000) {
            bonus = amount / 100;
        } else if (amount < 1000) {
            bonus = 0;
        }

        int total = check + amount + bonus;
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый счет: " + total);
    }
}