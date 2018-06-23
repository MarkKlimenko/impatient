package systems.vostok.cracking._1.urlify

import org.omg.CORBA.Object

class InplaceUrlify {
    public static void main(String[] args) {
        List<String> s = ['a', 'd', ' ', 'e']
        List<String> copyS = []

        s.each { String letter ->
            if(letter != ' ') {
                copyS << letter
            } else {
                copyS.addAll(['%', '2', '0'])
            }
        }

        print copyS
    }
}

class InplaceUrlify1 {
    public static void main(String[] args) {
        String[] s = ['a', 'd', ' ', 'e', 'j', ' ', ' ', ' '].toArray()

        s.each { String letter ->
            if(letter != ' ') {
                copyS << letter
            } else {
                copyS.addAll(['%', '2', '0'])
            }
        }

        print s
    }
}