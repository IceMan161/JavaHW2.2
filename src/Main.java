public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int depositAmount = 1100;
        int amount = (currentAccount + depositAmount);


        int bonus;
        if (depositAmount >= 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int amount2 = (depositAmount - currentAccount) * bonus / 100;

        int account = (amount + bonus + amount2);


        System.out.println("Баланс: " + account);


    }
}
