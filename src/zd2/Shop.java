package zd2;

public class Shop implements Cloneable {

    private String name;
    private String adress;
    private int phone;

    public Shop(String name, String adress, int phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public Shop clone() throws CloneNotSupportedException {
        return (Shop) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (phone != shop.phone) return false;
        if (!name.equals(shop.name)) return false;
        return adress.equals(shop.adress);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + adress.hashCode();
        result = 31 * result + phone;
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                '}';
    }
}
