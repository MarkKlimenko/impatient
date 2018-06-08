package systems.vostok.test

class Test {
    static void main(String[] args) {
        Long point1 = System.currentTimeMillis()

        [[1, 'a'] as Entity,
         [1, 'a'] as Entity,
         [3, 'c'] as Entity,
         [1, 'a'] as Entity,
         [4, 'a'] as Entity,
         [1, 'z'] as Entity]
                .unique{ it.id }
                .each(this.&println)

        println()
        println System.currentTimeMillis() - point1
    }
}
