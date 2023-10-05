package TP;

import java.util.Enumeration;
import java.util.Vector;

class Customer extends DomainObject {
	private Vector<Rental> _rentals = new Vector<Rental>();
	
    public Customer(String name) {
        super(name);
    }
    
    
    
    public Vector<Rental> getRentals() {
		return _rentals;
	}


	public void setRentals(Vector<Rental> _rentals) {
		this._rentals = _rentals;
	}



	public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public void statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.calculateAmount();
            totalAmount += thisAmount;

            // add frequent renter points
            frequentRenterPoints += each.getTape().getMovie().getPriceCode() instanceof NewReleasePrice && each.getDaysRented() > 1 ? 2 : 1;

            // show figures for this rental
            result += "\t" + each.getTape().getMovie().getName() + "\t" + String.valueOf(thisAmount) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        System.out.println(result);
    }

   
}