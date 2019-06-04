package systems.vostok.dump.other;

public class BitVector {
    private static int store = 0;

    static void setBit(int position) {
        checkPosition(position);

        store |= (1 << position - 1);
    }

    static boolean hasBit(int position) {
        checkPosition(position);

        int result = store & (1 << position - 1);
        return result >= 1;
    }

    static void deleteBit(int position) {
        checkPosition(position);

        store &= ~(1 << position - 1);
    }

    private static void checkPosition(int position) {
        if(position > 32) {
            throw new IllegalArgumentException("Position cant exceed 32");
        }
    }

    public static void main(String[] args) {
        setBit(5);
        setBit(8);
        setBit(20);

        deleteBit(8);

        if(!hasBit(5)) {
            throw new RuntimeException("1");
        }
        if(!hasBit(20)) {
            throw new RuntimeException("2");
        }

        if(hasBit(2)) {
            throw new RuntimeException("3");
        }
        if(hasBit(8)) {
            throw new RuntimeException("3");
        }
        System.out.println("OK");
    }
}
