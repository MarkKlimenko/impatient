package systems.vostok;

import org.codehaus.groovy.runtime.DefaultGroovyMethods;

public class TestChild extends TestParent {
    public static void main(String[] args) {
        TestChild test = new TestChild();
        test.print();
    }

    public void print() {
        DefaultGroovyMethods.print(this, "in child");
    }

}
