package org.example;
/*
Exercise 4.3: Product inventory
Create a Product class with product ID, name, price, and stock quantity. Add methods to
display details, add stock, reduce stock after a sale, and
calculate stock value (price * quantity). Do not allow sales that exceed available stock.
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private double stockValue;

    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        stockValue = this.price * this.quantity;
    }

    public void makeASale(int units){
        if (units <= quantity && units > 0){
            quantity -= units;
            stockValue = price * quantity;
            System.out.println("\nSold "+units+" of the product "+name+", bringing the new " +
                    "stock quantity to "+quantity);
        } else if (units <= 0){
            System.out.println("\nInvalid input!!!");
        }
        else {
            System.out.println("\nInsufficient stock available to fulfill the sale!!!");
        }
    }

    public void stockInventory(int units){
        if (units > 0){
            quantity += units;
            stockValue = price * quantity;
            System.out.println("\nAdded "+units+" of the product "+name+", bringing the new " +
                    "stock quantity to "+quantity);
        } else {
            System.out.println("\nInvalid input");
        }
    }

    public void displayDetails(){
        System.out.println("\n\nProduct Details:::");
        System.out.println("\nProduct name: "+name+"\n" +
                "Price: "+price+"\n" +
                "Stock quantity: "+quantity+"\n" +
                "Stock value: R"+stockValue);
    }
}
