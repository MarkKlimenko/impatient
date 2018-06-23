package systems.vostok.cracking._1.is_unique

class UniqueBitVector {
    public static void main(String[] args) {
        String target = 'qwertyu'
        println isUnique(target)
    }

    static Boolean isUnique(String s) {
        // use only low case letters
        if(s.length() > 26) return false

        int store = 0
        for(String letter: s) {
            Integer letterPosition = letter.toCharacter() - 'a'.toCharacter()
            if((store & (1 << letterPosition)) > 0) {
                return false
            } else {
                store |= (1 << letterPosition)
            }
        }
        true
    }
}
