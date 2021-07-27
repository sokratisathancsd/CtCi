public class URLify {

    public char[] urlify(char[] string, int true_size){
        char[] output = new char[string.length];
        for(int i=true_size-1 , j=string.length-1; i>=0 || j>=0; i--,j--){
            if((string[i]==' ')){
                output[j]='0';
                output[--j]='2';
                output[--j]='%';
            }else{
                output[j]=string[i];
            }
        }
        return output;


    }
}
