package lsk;

public class CurableSymptom extends Symptom implements Curable{

	public CurableSymptom(String name, int covidImpact, int severityIndex) {
		super();
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}

	@Override
	
	public void cure(){
		System.out.println("treatment applied to: "+name);
	}
}
