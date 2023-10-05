package TP;

public class Movie extends DomainObject {
	 public static final int CHILDRENS = 2;
	 public static final int REGULAR = 0;
	 public static final int NEW_RELEASE = 1;
	 private PriceCode _priceCode;
	
	public Movie(String name, PriceCode priceCode) {
       super(name);
       this._priceCode = priceCode;		
	}
	
	public PriceCode getPriceCode() {
		return  this._priceCode;
	}

	public void setPriceCode(PriceCode _priceCode) {
		this._priceCode = _priceCode;
	}

	}