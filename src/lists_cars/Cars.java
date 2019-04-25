package lists_cars;

public class Cars {
    String brand;
    int yearOfProduction;

    public Cars(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        Cars cars = (Cars) o;
        return (cars.getBrand().equals(brand) &&
                cars.getYearOfProduction() == yearOfProduction);
    }

    @Override
    public String toString() {
        return "Cars [" + brand + ", " + yearOfProduction + "]";
    }
}
