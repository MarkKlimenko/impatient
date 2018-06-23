package systems.vostok.cracking._1.is_unique.DUMP

class QuickIsUnique {

    // O(n)
    static void main(String[] args) {
        String s = 'poiuytrewqasdfghjkpl'
        println isUnique(s)
    }

    static Boolean isUnique(String s) {
        if(s.size() > 128) {
            return false
        }

        Boolean[] k = new Boolean[128]

        for(String letter : s) {
            Integer numLetter = letter.toCharacter()

            if(k[numLetter]) {
                return false
            } else {
                k[numLetter] = true
            }
        }
        true
    }
}
