package systems.vostok.cracking._1.one_away

class SimpleOneAway {
    public static void main(String[] args) {
        println isOneAway('qwert', 'qwers')
        println isOneAway('qwert', 'qweSrt')
        println isOneAway('qwert', 'qwet')
        println()
        println isOneAway('qwert', 'qwert')
        println isOneAway('qwert', 'qwertew')
        println isOneAway('qwert', 'qrt')
        println isOneAway('ret', 'qrt')
    }

    static Boolean isOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isOneEdited(s1, s2)
        } else if (s1.length() < s2.length()) {
            return isOneAdded(s1, s2)
        } else if (s1.length() > s2.length()) {
            return isOneAdded(s2, s1)
        }
        false
    }

    static Boolean isOneEdited(String s1, String s2) {
        Boolean checker = false

        Integer position = 0

        while(position < s1.length()) {
            if(s1[position] != s2[position]) {
                if(checker) {
                    return false
                } else {
                    position ++
                    checker = true
                }
            } else {
                position ++
            }
        }
        checker
    }

    static Boolean isOneAdded(String s1, String s2) {
        Boolean checker = false

        Integer s1Position = 0
        Integer s2Position = 0

        while(s1Position < s1.length() && s2Position < s2.length()) {
            if(s1[s1Position] == s2[s2Position]) {
                s1Position ++
                s2Position ++
            } else {
                if(checker) {
                    return false
                } else {
                    s2Position ++
                    checker = true
                }
            }
        }
        checker
    }
}
