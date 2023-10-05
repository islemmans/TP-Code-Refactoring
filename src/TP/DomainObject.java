package TP;

public class DomainObject {
	public static final String DEFAULT_NAME = "no name";
	private String _name = DEFAULT_NAME;
	
	public DomainObject (String name) {
		_name = name;
		};
		
		public DomainObject () {};
				
		
		public String getName() {
			return _name;
		}

		public void setName(String _name) {
			this._name = _name;
		}

		public String toString() {
		return getName();
		};
		
}
