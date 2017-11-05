
public class Hylde {
	private int kapacitet;
	
	public Hylde(int kapacitet) {
		this.kapacitet = kapacitet;
		
	}
	
	public int getKapacitet() {
		return kapacitet;
	}
	@Override
	public String toString() {
		return "Hylde med " + kapacitet + " er kapaciteten";
	}
}
