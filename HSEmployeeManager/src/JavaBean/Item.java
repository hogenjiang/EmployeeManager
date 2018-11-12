package JavaBean;

public class Item {
	private int id;
	private String name;
	private String year;
	private String condition;
	private int location;
	
	public Item() {
		
	}
	public Item(String name, String year, String condition, int location) {
		this.name = name;
		this.year = year;
		this.condition = condition;
		this.location = location;
	}

	public Item(int id, String name, String year, String condition, int location) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.condition = condition;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	
	
	
	
}
