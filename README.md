This benchmark is to compare performance of various use cases of Map and pattern matching in Scala

```
macbookpro:scala-pf-vs-map-bench sergeykisel$ java -jar target/benchmarks.jar
# JMH 1.5.2 (released 6 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.testMap


Result: 0.172 ±(99.9%) 0.009 us/op [Average]
  Statistics: (min, avg, max) = (0.160, 0.172, 0.187), stdev = 0.009
  Confidence interval (99.9%): [0.163, 0.181]


# JMH 1.5.2 (released 6 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM



Result: 0.115 ±(99.9%) 0.005 us/op [Average]
  Statistics: (min, avg, max) = (0.108, 0.115, 0.125), stdev = 0.005
  Confidence interval (99.9%): [0.110, 0.121]


# Run complete. Total time: 00:01:02

Benchmark           Mode  Cnt  Score   Error  Units
ScalaBench.testMap  avgt   15  0.172 ± 0.009  us/op
ScalaBench.tstPM    avgt   15  0.115 ± 0.005  us/op
```