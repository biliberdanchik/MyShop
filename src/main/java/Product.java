import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String country;
    private double balance;

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setCountry(String newCountry) {
        country = newCountry;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static Product getProductAfterScanner (Scanner scanner, int id){
        Product product = new Product(id + 1);

        System.out.print("Введите наименование продукта: ");
        product.setName(scanner.nextLine());

        System.out.print("Введите страну происхождения продукта: ");
        product.setCountry(scanner.nextLine());

        System.out.print("Введите кол-во продукта: ");
        product.setBalance(Double.parseDouble(scanner.nextLine()));
        return product;
    }


}
