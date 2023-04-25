package HomeWork3;

public class Good2 {
    public String name;
    public String country;
    public double weight;
    public double price;
    public int sort;

    public Good2(String name, String country, double weight, double price, int sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Good2{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort=" + sort +
                '}';
    }
}
