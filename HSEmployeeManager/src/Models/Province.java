package Models;

public class Province {
    private int id;
    private String province;

    public Province(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Province(int id, String province){
        this.id = id;
        this.province = province;
    }
    public String toString() {
        return this.province;
    }
}
