
public class Reol {
	private Hylde[] hylde = new Hylde[2];
	
	public Reol(Hylde one, Hylde two) {
		hylde[0] = one;
		hylde[1] = two;
	}
	
	public int totalBogkapacitet() {
		int twoTimesChampion;
		if (hylde[0].getKapacitet() > hylde[1].getKapacitet()) {
			twoTimesChampion = hylde[0].getKapacitet() * 2;
		}

		else {
			twoTimesChampion = hylde[1].getKapacitet() * 2;
		}
		return twoTimesChampion + hylde[0].getKapacitet() + hylde[1].getKapacitet();
		
	}
	@Override
	public String toString() {
		String sb = "Reol med total kapacitet: " + totalBogkapacitet();
		for(int i = 0; i < hylde.length; i++) {
			sb += "\n    ([" + i + "] " + hylde[i].toString() + ")";
		}
		return sb;
	}
}
