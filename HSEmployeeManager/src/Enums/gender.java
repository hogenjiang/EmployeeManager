package Enums;

public enum gender {
Male,Female;
	public String toString() {
		switch(this){
			case Male: return "Male";
			case Female: return "Female";
		}
		return null;
	}


}
