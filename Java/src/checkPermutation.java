import java.util.Arrays;

public class checkPermutation {

    public boolean isPermutation(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        String[] string_1 = string1.split("");
        String[] string_2 = string2.split("");

        Arrays.sort(string_1);
        Arrays.sort(string_2);

        return(Arrays.equals(string_1, string_2));
    }

    public  boolean isPermutationSup(String string1, String string2){
        int[] chars_ = new int[128];
        if(string1.length()!=string2.length()){
            return false;
        }

        for(int i=0; i<string1.length();i++){
            int ch = string1.charAt(i); //converts it directly on ascii
            chars_[ch]++;
        }
        for(int i=0; i<string2.length();i++) {
            int ch = string2.charAt(i); //converts it directly on ascii
            chars_[ch]--;

            if (chars_[ch] < 0) {
                return false;
            }

        }
        return true;
    }
}
