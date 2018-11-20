package Enums;

public enum department {
    DE1,DE2,DE3,DE4,DE5;
    public String toString() {
        switch(this){
            case DE1: return "Accounting";
            case DE2: return "Marketing";
            case DE3: return "Management";
            case DE4: return "Human Resource";
            case DE5: return "Development";
        }
        return null;
    }

}
