package dz4;

public class Rabbit1 {

    private String name;
    private int weight;
    private String eyeColor;
    private String woolColor;

    public Rabbit1(String name, int weight, String eyeColor, String woolColor) {
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    public Rabbit1(Rabbit1 rabbit1){
        this(rabbit1.getWeight());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rabbit1 rabbit1 = (Rabbit1) o;

        if (weight != rabbit1.weight) return false;
        if (!name.equals(rabbit1.name)) return false;
        if (!eyeColor.equals(rabbit1.eyeColor)) return false;
        return woolColor.equals(rabbit1.woolColor);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + eyeColor.hashCode();
        result = 31 * result + woolColor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rabbit1{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", woolColor='" + woolColor + '\'' +
                '}';
    }
}
