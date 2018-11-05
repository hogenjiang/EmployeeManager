package Database;

public class item {
	private int id;
	private String name;
	


public item() {
	
}

public item(String name) {
	this.name = name;
}

public item(int id, String name) {
super();
this.id = id;
this.name = name;

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
}