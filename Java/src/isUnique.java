import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class isUnique {

    public boolean hasUniqueChars(@NotNull String string) {
        if (string.length() > 128) {
            return false;
        }
        boolean[] ascii_chars = new boolean[128]; //default value of boolean array is False
        for (int i = 0; i < string.length(); i++) {
            int ch = string.charAt(i); //converts it directly on ascii
            if (ascii_chars[ch]) {
                return false;
            } else {
                ascii_chars[ch] = true;
            }

        }
        return true;
    }

    public boolean withoutAdditionalStructures(String string){
        String[] arrString = string.split("");
        if(arrString.length>128){
            return false;
        }
        Arrays.sort(arrString);
        for(int i=0; i<arrString.length-1; i++){
            if(arrString[i].equals(arrString[i + 1])){
                return false;
            }
        }
        return true;
    }
}
