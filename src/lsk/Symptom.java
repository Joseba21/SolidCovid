package lsk;

public abstract class Symptom implements Showable {
	public String name;
	int covidImpact; int severityIndex;

	
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+ 
				severityIndex+" covidImpact:"+covidImpact);
	}
}