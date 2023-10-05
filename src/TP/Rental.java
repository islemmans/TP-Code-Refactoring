package TP;

class Rental extends DomainObject
{
	private int _daysRented;
	private Tape _tape;

	public Rental(String name,Tape tape, int daysRented) {
		 super(name);
		_tape = tape;
		_daysRented = daysRented;
		}

	public int getDaysRented() {
		return _daysRented;
	}

	public void setDaysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}

	public Tape getTape() {
		return _tape;
	}

	public void setTape(Tape _tape) {
		this._tape = _tape;
	}
	
	double calculateAmount() {
        return _tape.getMovie().getPriceCode().calculateAmount(_daysRented);
    }

}
