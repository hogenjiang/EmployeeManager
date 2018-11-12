package Enums;


public enum Situation {
Hour,Salary;
	public String toString() {
		switch(this){
			case Hour: return "Hourly";
			case Salary: return "Salary";
		}
		
		return null;
	}


}
