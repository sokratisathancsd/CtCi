import java.util.Locale;

public class palindromePermutation {
    boolean isPalindromePermutation(String string){
        int[] switch_ = new int[26];
        string=string.toLowerCase(Locale.ROOT);
        string=string.replaceAll("\\s","");
        for(int i=0; i<string.length();i++){
            int offset = 97;
            int ascii_=(int) string.charAt(i)- offset;

            if(switch_[ascii_]==0){
                switch_[ascii_]=1;
            }else{
                switch_[ascii_]=0;
            }

        }
        int count=0;
        for(int s:switch_){
            if(s==1){
                count++;
            }
        }

        return !(count>1);
    }
}
