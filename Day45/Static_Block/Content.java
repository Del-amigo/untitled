package Day45.Static_Block;

public class Content {
    public  static  String url;

    static {
        url = "Techno.study";
    }
    public Content(){
        System.out.println("Constructor of Content");
    }

    public static void main(String[] args) {
        new Content();
    }

}
