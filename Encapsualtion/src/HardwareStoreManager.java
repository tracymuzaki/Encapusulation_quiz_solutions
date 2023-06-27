import java.time.LocalDateTime;
//The class with the main function to manage the manipulations of the store
public class HardwareStoreManager {
    public static void main(String[] args) {
        // Create hardware store
        HardwareStore store = new HardwareStore("Dream Furniture", "+256-700-000-000", "Masaka Road");
        Product product1 = new Product(1, "Cement",100,3000000, LocalDateTime.now(),LocalDateTime.of(2023, 8, 23, 12, 30),"https://www.google.com/aclk?sa=l&ai=DChcSEwj9v-2f-tj_AhUmEwYAHRvwAIkYABADGgJ3cw&ase=2&sig=AOD64_26m1RqsEItTxZ2s-jfSGZtO3j5Dw&ctype=5&nis=5&adurl&ved=2ahUKEwjD0uCf-tj_AhVwnCcCHX6LClQQwg96BAgBEHM");
        Product product2 = new Product(2, "Hammers",200,400000,LocalDateTime.now(),LocalDateTime.now(),"Image of Hammers");
        Product product3 = new Product(3, "Iron sheets",400,200000,LocalDateTime.now(),LocalDateTime.now(),"Image of iron sheets");

        //Accessing the product details
        System.out.println("StoreName: " + store.getName());
        System.out.println("Contact: " + store.getContact());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Product list " + store.getProducts());
        System.out.println();
        // Add initial products
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        // Update stock for new products
        store.updateProductStock("Cement", 200);
        store.updateProductStock("Hammers", 300);
        store.updateProductStock("Iron sheets",500);

        //display Product 1 details
        System.out.println("Product list " + store.getProducts());
        System.out.println();
        System.out.println("Product Name: " + product1.getName());
        System.out.println("Product_id " + product1.getProduct_id());
        System.out.println("Price of product1: " + product1.getPrice());
        System.out.println("Available stock: " + product1.getStock());
        System.out.println("Created at: " + product1.getCreated_at());
        System.out.println("Updated at: " + product1.getUpdated_at() );
        System.out.println("Image of Product1: " + product1.getImage());
        System.out.println();

        //setting the product details
        System.out.println("Modifying Product2");
        product2.setName("Screwdrivers");
        product2.setPrice(200000);
        product2.setImage("Image of Screwdrivers");
        product2.setStock(450);
        product2.setCreated_at(LocalDateTime.of(2023,4,10,9,40));
        product2.setUpdated_at(LocalDateTime.of(2023, 4, 15, 7, 40));

        //display product1 details
        System.out.println("\n Product 1 details");
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product_id " + product2.getProduct_id());
        System.out.println("Price of product1: " + product2.getPrice());
        System.out.println("Available stock: " + product2.getStock());
        System.out.println("Created at: " + product2.getCreated_at());
        System.out.println("Updated at: " + product2.getUpdated_at() );
        System.out.println("Image of Product1: " + product2.getImage());
        System.out.println();

        // Display product list and total products
        store.displayProductList();
        System.out.println("Total Products: " + store.getTotalProducts());


    }
    }



