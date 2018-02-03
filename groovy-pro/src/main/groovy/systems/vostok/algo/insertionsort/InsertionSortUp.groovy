package systems.vostok.algo.insertionsort

class InsertionSortUp {
    static void main(String[] args) {
        List data = getSequence()

        def timeS = System.currentTimeMillis()
        println(data.clone().sort())
        println(sort(data))
        println(System.currentTimeMillis() - timeS) //87187
    }

    static List getSequence() {
        new File("dump/generated.txt").getText().split(' ').collect { it as Integer }
    }

    static List sort(List data) {
        (1..data.size() - 1).each { j ->
            def i = j - 1
            def key = data[j]

            while (i >= 0 && key < data[i]) {
                def dump = data[i]

                data[i] = key
                data[i + 1] = dump
                i--
            }
        }
        data
    }
}
