package systems.vostok.stream

import groovy.util.logging.Slf4j

import java.util.function.BiConsumer
import java.util.function.Supplier

import static systems.vostok.util.TimeChecker.checkExecutionTime

/**
 Average result for 100 transactions:
   Point name: reduceResult ->              Checked time: 22
   Point name: concurrentCollectResult ->   Checked time: 10
   Point name: groovyCollectResult ->       Checked time: 1
   Reduce result                {sum=200855.00, mus=1431645.00, ums=156515.00}
   Concurrent collect result    {sum=200855.00, mus=1431645.00, ums=156515.00}
   Groovy collect result        {sum=200855.00, mus=1431645.00, ums=156515.00}

 Average result for 10000 transactions:
   Point name: reduceResult ->              Checked time: 84
   Point name: concurrentCollectResult ->   Checked time: 14
   Point name: groovyCollectResult ->       Checked time: 39
   Reduce result                {sum=20085500.00, mus=143164500.00, ums=15651500.00}
   Concurrent collect result    {sum=20085500.00, mus=143164500.00, ums=15651500.00}
   Groovy collect result        {sum=20085500.00, mus=143164500.00, ums=15651500.00}

 Average result for 1000000 transactions:
   Point name: reduceResult ->              Checked time: 1593
   Point name: concurrentCollectResult ->   Checked time: 423
   Point name: groovyCollectResult ->       Checked time: 954
   Reduce result                {sum=2008550000.00, mus=14316450000.00, ums=1565150000.00}
   Concurrent collect result    {sum=2008550000.00, mus=14316450000.00, ums=1565150000.00}
   Groovy collect result        {sum=2008550000.00, mus=14316450000.00, ums=1565150000.00}
 */
@Slf4j
class ReduceCollectTest {
    static final Integer NUM_OF_TRANSACTIONS = 1000000

    static final Map<String, BigDecimal> TRANSACTION = [id: 1154.1, sum: 2008.55, mus: 14316.45, ums: 1565.15]

    static final List<Map<String, BigDecimal>> TRANSACTIONS = (1..NUM_OF_TRANSACTIONS).collect { TRANSACTION }


    static void main(String[] args) {
        Map reduceResult = [:]
        Map concurrentCollectResult = [:]
        Map groovyCollectResult = [:]

        loadInMemory(TRANSACTIONS)

        checkExecutionTime('reduceResult') {
            reduceResult = getReduceResult(TRANSACTIONS)
        }

        checkExecutionTime('concurrentCollectResult') {
            concurrentCollectResult = getConcurrentCollectResult(TRANSACTIONS)
        }

        checkExecutionTime('groovyCollectResult') {
            groovyCollectResult = getGroovyCollectResult(TRANSACTIONS)
        }

        assert (reduceResult == concurrentCollectResult) && (reduceResult == groovyCollectResult)

        log.info('Reduce result {}', reduceResult)
        log.info('Concurrent collect result {}', concurrentCollectResult)
        log.info('Groovy collect result {}', concurrentCollectResult)
    }

    static void loadInMemory(List<Map<String, BigDecimal>> transactions) {
        getGroovyCollectResult(transactions)
        getReduceResult(transactions)
        getConcurrentCollectResult(transactions)
    }

    static Map getReduceResult(List<Map<String, BigDecimal>> transactions) {
        transactions.stream().reduce(new LinkedHashMap<String, BigDecimal>(), { result, trn ->
            result.sum = (result.sum ?: 0) + trn.sum
            result.mus = (result.mus ?: 0) + trn.mus
            result.ums = (result.ums ?: 0) + trn.ums
            result
        })
    }

    static Map getConcurrentCollectResult(List<Map<String, BigDecimal>> transactions) {
        Supplier<Map> supplier = {
            [sum: 0, mus: 0, ums: 0]
        }

        BiConsumer<Map, Map> combiner = { Map result, Map trn ->
            result.sum = result.sum + trn.sum
            result.mus = result.mus + trn.mus
            result.ums = result.ums + trn.ums
        }

        transactions.stream().parallel().collect(supplier, combiner, combiner)
    }

    static Map getGroovyCollectResult(List<Map<String, BigDecimal>> transactions) {
        Map initial = [sum: 0, mus: 0, ums: 0]

        transactions.each {
            initial.sum = initial.sum + it.sum
            initial.mus = initial.mus + it.mus
            initial.ums = initial.ums + it.ums
        }

        initial
    }
}
