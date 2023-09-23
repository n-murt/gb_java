public class Notebook {

    private String model;
    private String brand;
    private String color;
    private String os;
    private String cpu;
    private int cpu_cores;
    private int ram_gb;
    private int hdd_gb;
    private int screen_diagonal_inches;
    private int price;

    public Notebook(String model, String brand, String color, String os, String cpu, int cpu_cores, int ram_gb,
            int hdd_gb, int screen_diagonal_inches, int price) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.cpu = cpu;
        this.cpu_cores = cpu_cores;
        this.ram_gb = ram_gb;
        this.hdd_gb = hdd_gb;
        this.screen_diagonal_inches = screen_diagonal_inches;
        this.price = price;
    }

    public void list() {
        String result = String.format(
                " - Модель: %s, Бренд: %s, Цвет: %s, ОС: %s, CPU: %s, Ядер: %d, RAM: %d GB, HDD: %d GB, Диагональ: %d, Цена: %d,00 руб.\n",
                model, brand, color, os, cpu, cpu_cores, ram_gb, hdd_gb, screen_diagonal_inches, price);
        System.out.println(result);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public String getCpu() {
        return cpu;
    }

    public int getCpu_cores() {
        return cpu_cores;
    }

    public int getRam_gb() {
        return ram_gb;
    }

    public int getHdd_gb() {
        return hdd_gb;
    }

    public int getScreen_diagonal_inches() {
        return screen_diagonal_inches;
    }

    public int getPrice() {
        return price;
    }

}
