package TP;

public class NewReleasePrice extends PriceCode {
    @Override
    double calculateAmount(int daysRented) {
        return daysRented * 3;
    }
}
