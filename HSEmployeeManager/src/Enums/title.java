package Enums;

public enum title {
    MG1,MG2,MG3,AC1,AC2,AC3,AC4,AC5,AC6,AC7,HR1,HR2,HR3,HR4,HR5,HR6,HR7,HR8
    ,MK1,MK2,MK3,MK4,MK5,MK6,MK7,DP1,DP2,DP3,DP4,DP5,DP6,DP7;
    public String toString() {
        switch(this){
            //Manage department
            case MG1: return "President";
            case MG2: return "Vice-President";
            case MG3: return "CEO";
            //Account department
            case AC1: return "CFO";
            case AC2: return "Accountant";
            case AC3: return "Accounting Manager";
            case AC4: return "Accounting Clerk";
            case AC5: return "Auditor";
            case AC6: return "Controller";
            case AC7: return "Financial Analyst";
            //Market department
            case MK1: return "Content Marketing Manager";
            case MK2: return "Content Writer";
            case MK3: return "Content Marketing Producer";
            case MK4: return "Digital Marketing Manager";
            case MK5: return "Digital Content Specialist";
            case MK6: return "Social Media Marketing Manager";
            case MK7: return "Marketing Content Writer";
            //HR department
            case HR1: return "Administrative Manager";
            case HR2: return "Contract Recruiter";
            case HR3: return "HR Manager";
            case HR4: return "HR Officer";
            case HR5: return "HR Team Leader";
            case HR6: return "Safety Coordinator";
            case HR7: return "Senior HR Specialist";
            case HR8: return "Trainer";
            //Development department
            case DP1: return "Front End Developer";
            case DP2: return "Product Manager";
            case DP3: return "Hardware Developer";
            case DP4: return "Software Manager";
            case DP5: return "Software Developer";
            case DP6: return "Software Analyst";
            case DP7: return "Web Developer";


        }

        return null;
    }
}
