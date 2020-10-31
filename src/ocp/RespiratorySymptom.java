package ocp;

public class RespiratorySymptom implements ISymptom{
	int covidImpact; int severityIndex; int affectedDays;

	public RespiratorySymptom(int impact, int severity, int days) {
		this.covidImpact = impact;
		this.severityIndex = severity;
		this.affectedDays=days;

	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int days) {
		this.affectedDays = days;
	}
}
