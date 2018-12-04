package txt;

public class companyInformation {


    String string = "People connect better with stories than they do with a list of facts. If you want people to actually remember the information from your company profile, take the Zappos approach and tell a story about your brand. \n" +
            "\n" +
            "Quite frankly, not all brands have the most amazing story to tell -- and that's okay. The content of the story is less important than the fact that you are presenting information in the form of a story to begin with.";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public companyInformation(String string){
            this.string = string;
    }
    public String toString(){
        return string;
    }


}

