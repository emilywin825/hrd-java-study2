package sommelierTest;

public class Wine {
    String name;
    String origin;
    String type;
    double price;
    double alcohol;



    public Wine(String name, String origin, String type, double price, double alcohol) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.price = price;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", alcohol=" + alcohol +
                '}';
    }
}
