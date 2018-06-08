package systems.vostok.interview

class Comparator {
    /*static Boolean isEqual(Integer i, Integer j) {
        (0..i - j).collect()
                .with { it.remove(0); !it }
    }*/

    static Boolean isEqual(Integer i, Integer j) {
        i.equals(j)
    }

    static void main(String[] args) {
        assert !isEqual(3, 5)
        assert !isEqual(5, 3)
        assert isEqual(3, 3)
        println 'Ok'
    }
}
