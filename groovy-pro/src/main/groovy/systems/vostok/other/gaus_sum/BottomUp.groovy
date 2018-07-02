package systems.vostok.other.gaus_sum

class BottomUp {
    static void main(String[] args) {
        Long targetNum = 10

        println gaus(targetNum)
        assert gaus(targetNum) == (1 + targetNum) * targetNum / 2
    }

    static Long gaus(Long n) {
        Long sum = 0

        (n+1).times { Long i ->
            sum += i
        }
        sum
    }
}
