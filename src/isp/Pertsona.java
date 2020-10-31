package isp;

public class Pertsona implements Yearable{
	String name; int adina;
	@Override
	public int getYears() {
		return this.adina;
	}
	@Override
	public void setYears(int years) {
		this.adina = years;
	}
	public String getName() {
		return name;
	}
	public Pertsona(String name, int adina) {
		super();
		this.name = name;
		this.adina = adina;
	}
	public void setName(String name) {
		this.name = name;
	}
} 
