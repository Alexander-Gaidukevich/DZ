package zd1;

public class Purchase {

    private String name;
    private double cost;
    private int weight;

    public Purchase(String name, double cost, int weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public Purchase(Purchase purchase) {
        this(purchase.getName(),purchase.getCost(),purchase.getWeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (Double.compare(purchase.cost, cost) != 0) return false;
        if (weight != purchase.weight) return false;
        return name.equals(purchase.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "zd1.Purchase{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
