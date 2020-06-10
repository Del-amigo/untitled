package Day37.ThrowingException;

import com.sun.security.jgss.GSSUtil;

public class CheckedThrow {

    public static void main(String[] args){
        try {
            goOutside(65);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void  goOutside(int temp) throws Exception {
        if(temp< 20){//very cold weather
            throw new Exception("It's really cold outside");
        }
        //     THROW U R throWing an exception that might be showed
        //     ThrowSS - U are puting to method and sayin'g that your method might have an excemption...
        System.out.println("Playing football");
    }
}
