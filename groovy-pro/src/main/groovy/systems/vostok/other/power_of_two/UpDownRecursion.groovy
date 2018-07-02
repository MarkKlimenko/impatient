package systems.vostok.other.power_of_two

class UpDownRecursion {
    static void main(String[] args) {
        Long targetNum = 8

        println power(targetNum)
        assert power(targetNum) == 2**(targetNum + 1) - 1
    }

    static Long power(Long n) {
        if(n <= 0) {
            return 1
        }

        2**n + power(n-1)
    }
}
