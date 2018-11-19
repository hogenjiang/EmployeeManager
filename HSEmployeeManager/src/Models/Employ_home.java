package Models;

public class Employ_home {
    private String FirstName;
    private String LastName;
    private String Title;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Employ_home(String FirstName, String LastName, String Title){
        this.FirstName = new String(FirstName);
        this.LastName = new String(LastName);
        this.Title = new String(Title);
    }
}
