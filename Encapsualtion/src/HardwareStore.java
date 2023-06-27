//write a java program that manages a hardware store. The store must have a name,contact and where it is located.The store
//consists of different products. new products can be added to the store each new day and the store manager keeps track of all these
//new products.The store manager always updates these products based on the number in stock once  a new product has been brought.
//The manager presents a list of these products to his boss with the total products in the store
import java.time.LocalDateTime;
import java.util.*;
class HardwareStore {
    private String name;
    private String contact;
    private String location;
    private List<Product> products;

    public HardwareStore(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    //function to add new products to the product collection
    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductStock(String productName, double quantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.updateStock(quantity);
                break;
            }
        }
    }

    public void displayProductList() {
        for (Product product : products) {
            System.out.println(product.getName() + " - Stock: " + product.getStock());
        }
    }

    public double getTotalProducts() {
        return products.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

class Product {
    private int product_id;

    private String name;
    private double stock;

    private double price;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String image;


    public Product(int product_id,String name, double stock,double price, LocalDateTime created_at,LocalDateTime updated_at,String image) {
        this.product_id = product_id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //getters and setters
    public int getProduct_id() {
        return product_id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    //function to update the stock and add to the store
    public void updateStock(double quantity) {
        stock += quantity;
    }

}
