
public class MainProgram {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);
    }
}
