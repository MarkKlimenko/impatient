package systems.vostok.other.gaus_sum

class UpDownRecursion {
    static void main(String[] args) {
        Long targetNum = 10

        println gaus(targetNum)
        assert gaus(targetNum) == (1+targetNum)*targetNum/2
    }

    static Long gaus(Long n) {
        if(n <= 0) {
            return n
        }
        n + gaus(n-1)
    }
}
