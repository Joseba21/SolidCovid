package ocp;

public interface ISymptom {

	public abstract int getCovidImpact();
	public abstract void setCovidImpact(int covidImpact);
	public int getSeverityIndex();
	public void setSeverityIndex(int severityIndex);
	public int getAffectedDays();
	public void setAffectedDays(int days);
}
