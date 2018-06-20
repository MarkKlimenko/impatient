package systems.vostok.cracking._1.permutations

class Simple2Permutations {

    // log n * n

    public static void main(String[] args) {
        String s1 = 'qwerty'
        String s2 = 'wqeryt'

        println isPermutation(s1, s2)
    }

    static Boolean isPermutation(String s1, String s2) {
        s1.toList().sort() == s2.toList().sort()
    }
}
