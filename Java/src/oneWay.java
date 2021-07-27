public class oneWay {

    public boolean isOneWay(String string1, String string2) {
        boolean flag = false;
        switch (string1.length() - string2.length()) {
            case 0:
                //check for replacement
                for (int s1 = 0, s2 = 0; s1 < string1.length() || s2 < string2.length(); ) {
                    if (string1.charAt(s1) == string2.charAt(s2)) {
                        s1++;
                        s2++;
                    } else {
                        if (flag) {
                            return false;
                        } else {
                            flag = true;
                            s1++;
                            s2++;
                        }
                    }
                }
                break;
            case 1:
                //check for insert or delete
                for (int s1 = 0, s2 = 0; s1 < string1.length() || s2 < string2.length(); ) {
                    if (string1.charAt(s1) == string2.charAt(s2)) {
                        s1++;
                        s2++;
                        if(s1>=string1.length() || s2>=string2.length()){
                            return true;
                        }
                    } else {
                        if (flag) {
                            return false;
                        } else {
                            flag = true;
                            if (string1.length() > string2.length()) {
                                s1++;
                            } else {
                                s2++;
                            }
                        }
                    }
                }
                break;
            default:
                return false;
        }
        return true;


    }
}
