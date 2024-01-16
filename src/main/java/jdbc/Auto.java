package jdbc;

class Auto {
    private int id;
    private String brand;
    private String model;
    private Double engine_volume;
    private int price;
    private int max_speed;

    public Auto(int id, String brand, String model, Double engine_volume, int price, int max_speed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine_volume = engine_volume;
        this.price = price;
        this.max_speed = max_speed;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngine_volume() {
        return engine_volume;
    }

    public int getPrice() {
        return price;
    }

    public int getMax_speed() {
        return max_speed;
    }
}
