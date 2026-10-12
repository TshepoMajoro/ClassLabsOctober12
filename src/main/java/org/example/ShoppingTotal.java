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
    private double totalCost;
    private double discountRate;
    private double discountAmount;

    public ShoppingTotal(String _name, double _price, int _quantity){
        productName = _name;
        unitPrice = _price;
        quantity = _quantity;
        discountRate = 0.0;
    }

    public ShoppingTotal(String _name, double _price, int _quantity,
                         double _discountRate){
        this(_name,_price,_quantity);
        if (_discountRate > 0.0){
            discountRate = _discountRate;
            calculateTotalCost();
        }

    }

    private void calculateTotalCost(){
        this.discountAmount = (this.quantity * this.unitPrice) * discountRate;
        this.totalCost = (this.quantity * this.unitPrice) - this.discountAmount;
    }

    @Override
    public String toString(){
        return "\n\nProduct Name: "+this.productName+"\n" +
                "Unit Price: "+this.unitPrice+"\n" +
                "Quantity: "+this.quantity+"\n" +
                "Total Cost: "+this.totalCost+"\n" +
                "Discount: "+this.discountAmount;
    }
}
