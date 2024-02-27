package model;

public class ProductDto {
    private int id;
    private int pno;
    private String name;
    private String company;
    private int price;

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "pno=" + pno +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
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



    public ProductDto(int i, String s, String 회사_, int randomInt) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
    }
