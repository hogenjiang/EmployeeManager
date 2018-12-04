package Models;

public class Situation {
    private int id;
    private String situation;

    public Situation(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Situation(int id, String situation){
        this.id = id;
        this.situation = situation;
    }
    public String toString() {
        return this.situation;
    }
}
