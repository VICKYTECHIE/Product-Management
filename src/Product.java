public class Product {
    private String name;
    private String flavour;
    private String quantity;
    private int expDate;
    //CREATING A CONSTRUCTOR FOR PRODUCT,NORMAL CONS & ARGUMENT CONS;
    public Product() {
    }

    public Product(String name, String flavour, String quantity, int expDate) {
        this.name = name;
        this.flavour = flavour;
        this.quantity = quantity;
       this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavoure) {
        this.flavour = flavour;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        expDate = expDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", flavoure='" + flavour + '\'' +
                ", quantity=" + quantity +
                ", expDate=" + expDate +
                '}';
    }
}

