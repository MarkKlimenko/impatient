package systems.vostok.cracking._1.is_unique

// O(n^2)
class UniqueWithoutSpace {
    public static void main(String[] args) {
        String target = 'qwertyu'
        println isUnique(target)
    }

    static Boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s[i] == s[j] && i != j) {
                    return false
                }
            }
        }
        true
    }
}
