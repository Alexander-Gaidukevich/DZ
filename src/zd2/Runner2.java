package zd2;

public class Runner2 {
    public static void main(String[] args) {

        Shop shop1 = new Shop("Butik", "Sovetckaya", 5557799);

        Shop copyShop = null;
        try {
            copyShop = shop1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
        }
        copyShop.setPhone(333444111);
        System.out.println(shop1);
        System.out.println(copyShop);
    }
}
