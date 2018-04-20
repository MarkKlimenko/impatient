package systems.vostok.algo.bigsort.pure

class SortRandomIntegers {
    static void main(String[] args) {
        Integer size = 45_000_000
        ArrayList<Integer> list = []

        /*(0..size).collect { (Math.random() * it) as Integer }
            .sort()
            .with(this.&print)*/

        size.times { list << (Math.random() * it as Integer) }
        list.sort().with(this.&print)
    }
}
