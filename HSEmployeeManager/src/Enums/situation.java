package Enums;


public enum situation {
	Temporary,Hourly,Salary;
	public String toString() {
		switch(this){
			case Temporary: return "Temporary";
			case Hourly: return "Hourly";
			case Salary: return "Salary";
		}
		
		return null;
	}


}
