package org.example;

/*
Exercise 1.2: Shopping total
Create ShoppingTotal. Store a product name, unit price, and quantity. Calculate and
display the total cost.

Challenge: Apply a discount percentage and display the final amount.
 */

public class ShoppingTotal {
    private String productName;
    private double unitPrice;
    private int quantity;

    public ShoppingTotal(String _name, double _price, int _quantity){
        productName = _name;
        unitPrice = _price;
        quantity = _quantity;
    }

    @Override
    public String toString(){
        return "\n\nProduct Name: "+this.productName+"\n" +
                "Unit Price: "+this.unitPrice+"\n" +
                "Quantity: "+this.quantity;
    }
}
