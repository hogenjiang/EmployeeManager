package Enums;

public enum province {
    c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    public String toString() {
        switch(this){
            case c1: return "Alberta";
            case c2: return "British Columbia";
            case c3: return "Manitoba";
            case c4: return "New Brunswick";
            case c5: return "Newfoundland and Labrador";
            case c6: return "Northwest Territories";
            case c7: return "Nova Scotia";
            case c8: return "Nunavut";
            case c9: return "Ontario";
            case c10: return "Prince Edward Island";
            case c11: return "Quebec";
            case c12: return "Saskatchewan";
            case c13: return "Yukon";
        }

        return null;
    }
}
