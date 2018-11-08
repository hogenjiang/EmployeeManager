package Enums;

public enum gender {
MALE,FEMALE;
	public String toString() {
		switch(this){
			case MALE: return "male";
			case FEMALE: return "female";
		}
		
		return null;
	}


}
