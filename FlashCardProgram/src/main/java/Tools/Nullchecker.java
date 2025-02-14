package Tools;

public class Nullchecker {

    public static boolean gibtEsNullIn(Object... objects){

        for(Object o:objects){
            if(o==null){
                return true;
            }
        }
        return false;
    }
}
