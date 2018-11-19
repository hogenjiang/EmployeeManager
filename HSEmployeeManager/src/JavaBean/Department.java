package JavaBean;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private String manager;
	
	
	public Department(int departmentId, String depatrmentName,String manager) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.manager = manager;
		
	}
	
	public Department( String depatrmentName, String manager) {
		
		this.departmentName = departmentName;
		this.manager = manager;
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
	
	public String toString() {
		return this.departmentName;
	}
	
	
	
	
	
	
	
	
	

}
