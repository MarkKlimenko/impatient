package systems.vostok.dump.interview.array;

import java.util.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique4("sdfgh"));
        System.out.println(isUnique4("sdfghd"));
    }

    // Only ascii symbols (127)
    static boolean isUnique1(String value) {
        boolean [] store = new boolean [127];

        if(value.length() > 127) {
            return false;
        }

        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(store[c]) {
                return false;
            } else {
                store[c] = true;
            }
        }
        return true;
    }

    // Assume we have only characters in lower case
    static boolean isUnique2(String value) {
        int store = 0;

        if(value.length() > 26) {
            return false;
        }

        for(int i = 0; i < value.length(); i++) {
            int position = value.charAt(i) - 'a';

            if((store & (1 << position)) > 0) {
                return false;
            } else {
                store |= 1 << position;
            }
        }
        return true;
    }

    // Compare every character
    static boolean isUnique3(String value){
        for(int i = 0; i < value.length(); i++) {
            char checkedChar = value.charAt(i);
            for(int j = i+1; j < value.length(); j++){
                if(checkedChar == value.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check using sort
    static boolean isUnique4(String value) {
        char[] cValue = value.toCharArray();
        Arrays.sort(cValue);

        for(int i = 0; i < cValue.length - 1; i++){
            if(cValue[i] == cValue[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
