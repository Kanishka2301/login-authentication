import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String> loginInfo= new HashMap<String,String>();
    IDandPassword(){
        loginInfo.put("kani", "paris");
        loginInfo.put("yadu", "SK");
        loginInfo.put("yaadvy", "Iceland");
    }
 protected HashMap getloginInfo(){
        return loginInfo;
}

}
