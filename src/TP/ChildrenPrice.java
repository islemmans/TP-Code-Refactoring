package TP;

public class ChildrenPrice extends PriceCode {
    @Override
    double calculateAmount(int daysRented) {
        double amount = 1.5;
return amount;
    }

}
