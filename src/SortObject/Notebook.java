package SortObject;

public class Notebook {
    private String company;
    private int price;
    private int ram;

    public Notebook(String company, int price, int ram) {
        this.company = company;
        this.price = price;
        this.ram = ram;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
