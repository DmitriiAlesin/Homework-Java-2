public class Main {
    public static void main(String[] args) {

        int price = 1000; //цена билета

        int oneMile = 20; // цена за 1 милю

        int bonusMiles = (int) Math.ceil(price / oneMile);

        System.out.println("Количество бонусных миль : " + bonusMiles);
    }
}
