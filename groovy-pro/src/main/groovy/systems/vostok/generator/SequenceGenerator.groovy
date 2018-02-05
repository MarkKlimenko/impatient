package systems.vostok.generator

class SequenceGenerator {
    static Range generateSimpleSequence(Integer length) {
        (1..length)
    }

    static void main(String[] args) {
        List test = generateSimpleSequence(1_000_000_000)
        test.each {
            if(it == 1_000_000_000) {
                print(it)
            }
        }
        ''
    }
}
