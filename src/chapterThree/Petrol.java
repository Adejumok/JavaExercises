package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("Yaba", "Total", 23,
                240.45, 20.00);

        System.out.println(purchase.getPurchase());
    }
}
