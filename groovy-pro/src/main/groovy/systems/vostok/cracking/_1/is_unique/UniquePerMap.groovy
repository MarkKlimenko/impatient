package systems.vostok.cracking._1.is_unique

// O(n)
class UniquePerMap {
    public static void main(String[] args) {
        String target = 'qwertyuq'
        println isUnique(target)
    }

    static Boolean isUnique(String s) {
        Map<String, Boolean> checker = [:]

        for (String letter : s) {
            if(checker[letter]) {
                return false
            } else {
                checker[letter] = true
            }
        }
        true
    }
}
