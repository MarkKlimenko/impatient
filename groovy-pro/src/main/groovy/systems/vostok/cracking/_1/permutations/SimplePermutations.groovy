package systems.vostok.cracking._1.permutations

class SimplePermutations {
    // n

    public static void main(String[] args) {
        String s1 = 'qwerty'
        String s2 = 'wqerytr'

        println isPermutation(s1, s2)
    }

    static Boolean isPermutation(String s1, String s2) {
        Map<String, Integer> sFirstLetterMap = [:]

        s1.each { String letter ->
            if (sFirstLetterMap[letter]) {
                sFirstLetterMap[letter] = sFirstLetterMap[letter] + 1
            } else {
                sFirstLetterMap << [(letter): 1]
            }
        }

        for(String letter: s2) {
            if (sFirstLetterMap[letter] && sFirstLetterMap[letter] > 0) {
                sFirstLetterMap[letter] = sFirstLetterMap[letter] - 1
            } else {
                return false
            }
        }

        sFirstLetterMap.forEach({ k, v ->
            if (v != 0) {
                return false
            }
        })
        return true
    }
}
