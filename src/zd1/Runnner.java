package zd1;

import zd1.Purchase;

public class Runnner {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase("Pur", 15500, 12);

        Purchase purchase2 = new Purchase(purchase1);
        purchase2.setCost(12300);

        System.out.println("Начальный обект -> " + purchase1);
        System.out.println("Клонированный обект -> " + purchase2);
    }
}
