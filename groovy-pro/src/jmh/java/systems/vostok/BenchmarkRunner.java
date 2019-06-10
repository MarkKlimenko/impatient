package systems.vostok;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import org.openjdk.jmh.annotations.*;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonParallelStyle;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonRxParallelStyle;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonRxStyle;
import systems.vostok.algo.bhargava._1_sails_person.implementations.SailsPersonSimpleForStyle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    //@Benchmark
    public void sailsPersonRx() {
        SailsPersonRxStyle.main(null);
    }

    @State(Scope.Benchmark)
    public static class MyState {
        public ExecutorService pool = Executors.newSingleThreadExecutor();
        public Scheduler scheduler = Schedulers.from(pool);

        public ExecutorService pool0 = Executors.newSingleThreadExecutor();
        public Scheduler scheduler0 = Schedulers.from(pool0);
    }

    @Benchmark
    public void sailsPersonRxParallel(MyState state) {
        SailsPersonRxParallelStyle.launch(state.scheduler, state.scheduler0);
    }
}
