package TP;

class Tape extends DomainObject
{
	private Movie _movie;
	private String _serialNumber;
	
	public Tape(String name, String serialNumber, Movie movie) {
	    super(name);
	   _serialNumber = serialNumber;
	   _movie = movie;
	}

	
public Movie getMovie() {
		return _movie;
	}


	public void setMovie(Movie _movie) {
		this._movie = _movie;
	}


	public String getSerialNumber() {
		return _serialNumber;
	}


	public void setSerialNumber(String _serialNumber) {
		this._serialNumber = _serialNumber;
	}


}

