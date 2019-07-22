package junit.suite;

public class Stringmanship {
	
	String datum;
	
	public Stringmanship(String datum) {
		this.datum = datum;
	}
	
	public String toUppercase() {
		return datum.toUpperCase();
	}

}
