package org.example;
/*
Exercise 5.2: Mini point-of-sale system
Create a Product class with name, price, and quantity. In the main class,
create an array of at least four products, calculate line totals and the subtotal,
apply a 10% discount if the subtotal exceeds 1,000, and display a receipt with line totals,
subtotal, discount, and final total.

Challenge: Reject negative prices and quantities.
 */
public class Lab5Product {
    private String name;
    private double price;
    private int quantity;
    private double totalCost;

    public Lab5Product(String _name, double _price, int _quantity){
        name = _name;
        price = _price;
        quantity = _quantity;
    }

    private void calculateTotalCost(){
        totalCost = price * quantity;
    }

    public void display(){
        calculateTotalCost();
        System.out.println("\n"+name+" x "+quantity+"  R"+totalCost);
    }

    public static class CartOfProducts{
        Lab5Product[] products;
        private double subTotal;
        private final double discountRate = 0.10;
        private double discountAmount;
        private double finalTotal;
        private boolean doesSuffice;
        private boolean discountApplied;

        public CartOfProducts(Lab5Product[] _products){
            if (_products.length >= 4){
                products = _products;
                doesSuffice = true;
            } else {
                doesSuffice = false;
            }
        }

        private void calculateSubTotal(){
            for (Lab5Product product : products){
                product.calculateTotalCost();
                subTotal += product.totalCost;
            }
        }

        private void calculateFinalTotal(){
            if (subTotal > 1000){
                discountAmount = subTotal * discountRate;
                finalTotal = subTotal - discountAmount;
                discountApplied = true;
            } else {
                finalTotal = subTotal;
                discountAmount = 0.0;
                discountApplied = false;
            }
        }

        public void displayReceipt(){
            if (doesSuffice){
                calculateSubTotal();
                calculateFinalTotal();

                System.out.println("\n\nProducts Receipt:::");
                for (Lab5Product product : products){
                    product.display();
                }
                System.out.println("________________________");
                System.out.println("Subtotal: R"+subTotal);
                if (discountApplied){
                    System.out.println("Discount: -R"+discountAmount);
                }
                System.out.println("Grand total: R"+finalTotal);
            } else {
                System.out.println("\n\nInadequate number of products in cart.Cannot display receipt.");
            }
        }
    }// End of CartOfProducts class
}// End of Lab5Product class
