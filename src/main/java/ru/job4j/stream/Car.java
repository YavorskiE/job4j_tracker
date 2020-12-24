package ru.job4j.stream;

public class Car {
    private String brand;
    private String name;
    private String model;
    private int price;
    private boolean plate;
    private String owner;
    private long license;

    static class CarBuilder {
        private String brand;
        private String name;
        private String model;
        private int price;
        private boolean plate;
        private String owner;
        private long license;

        CarBuilder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        CarBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        CarBuilder buildModel(String model) {
            this.model = model;
            return this;
        }

        CarBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }

        CarBuilder buildPlate(boolean plate) {
            this.plate = plate;
            return this;
        }

        CarBuilder buildOwner(String owner) {
            this.owner =  owner;
            return this;
        }

        CarBuilder buildLicense(long license) {
            this.license = license;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.name = name;
            car.model = model;
            car.price =  price;
            car.plate = plate;
            car.owner =  owner;
            car.license = license;
            return car;
        }
        }

    @Override
    public String toString() {
        return "CarBuilder{"
                + "brand='" + brand + '\''
                + ", name='" + name + '\''
                + ", model='" + model + '\''
                + ", price=" + price
                + ", plate=" + plate
                + ", owner='" + owner + '\''
                + ", license=" + license
                + '}';
    }

    public static void main(String[] args) {
        Car car = new CarBuilder().buildBrand("Ford")
                .buildName("Focus")
                .buildModel("GT")
                .buildPrice(12000)
                .buildPlate(true)
                .buildOwner("Ivanov")
                .buildLicense(25321)
                .build();
        System.out.println(car);
    }
}
