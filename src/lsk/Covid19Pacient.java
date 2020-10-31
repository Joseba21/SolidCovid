package lsk;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	String name;
	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();

	public void addSymptom(Symptom p, Integer w){
		symptoms.put(p,w);
	}
	public void showSymptoms(){
		for (Symptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms.keySet()) {
			if (s instanceof Curable) {
				((CurableSymptom) s).cure();
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Symptom, Integer> getSymptoms() {
		return symptoms;
	}
}
