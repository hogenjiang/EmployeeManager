package Models;


public class Employee {
	private String Name;
    private String Age;
    private String Situation;
 
    public Employee(String Name, String Age, String Situation) {
        this.Name = new String(Name);
        this.Age = new String(Age);
        this.Situation = new String(Situation);
    }

	public String getSituation() {
		return Situation;
	}

	public void setSituation(String situation) {
		Situation = situation;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}
 
    
        
   
}