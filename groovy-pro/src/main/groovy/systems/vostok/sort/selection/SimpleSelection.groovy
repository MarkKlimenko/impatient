package systems.vostok.sort.selection

class SimpleSelection {
    static void main(String[] args) {
        List<Integer> target = [5,4,7,9,2,4,1,2,3,5,4,8,7,6,1,2,4]
        println sort(target)
    }

    static List<Integer> sort(List<Integer> target) {
        Integer iterator = 0

        while(iterator < target.size()) {
            Integer minValue = target[iterator]
            Integer minValuePosition = iterator

            for (int i = iterator; i < target.size(); i++) {
                if(target[i] < minValue) {
                    minValue = target[i]
                    minValuePosition = i
                }
            }

            if(minValuePosition != iterator) {
                Integer middleTargetIterator = target[iterator]

                target[iterator] = minValue
                target[minValuePosition] = middleTargetIterator
            }
            iterator++
        }
        target
    }
}
