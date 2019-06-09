package systems.vostok;

import org.openjdk.jmh.annotations.*;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonParallelStyle;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonRxStyle;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonSimpleForStyle;

@BenchmarkMode(Mode.SingleShotTime)
@Warmup(iterations = 2)
@Measurement(iterations = 2, batchSize = 1)
public class BenchmarkRunner {
    //@Benchmark
    public void sailsPersonParallel() {
        SailsPersonParallelStyle.main(null);
    }

    //@Benchmark
    public void sailsPersonSimple() {
        SailsPersonSimpleForStyle.main(null);
    }

    @Benchmark
    public void sailsPersonRx() {
        SailsPersonRxStyle.main(null);
    }
}
