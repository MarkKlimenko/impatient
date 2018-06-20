package systems.vostok.cracking._1.is_unique

class SimpleIsUnique {

    // O(n^2)
    static void main(String[] args) {
        String s = 'hyfxixolhjvluy'

        for (int i = 0; i < s.size(); i++) {
            String c = s[i]
            Boolean unique = true

            for (int j = 0; j < s.size(); j++) {
                if (c == s[j] && j != i) {
                  unique = false
                  break
                }
            }

            if(unique) {
               println(c)
            }
        }
    }
}
