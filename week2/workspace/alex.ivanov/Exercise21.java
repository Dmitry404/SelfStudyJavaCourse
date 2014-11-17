class StaticCheck {
    static public String s ="Hello, I'm static";

    static public String Get(){
        return s;
    }
}

public class exercise21 {
    public static void main(String[] args) {

        System.out.format("Static usage: %s\n",StaticCheck.Get());
    }

}