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

Result: 0.154 ±(99.9%) 0.028 us/op [Average]
  Statistics: (min, avg, max) = (0.114, 0.154, 0.174), stdev = 0.026
  Confidence interval (99.9%): [0.126, 0.182]


# JMH 1.5.2 (released 6 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM

Result: 0.166 ±(99.9%) 0.007 us/op [Average]
  Statistics: (min, avg, max) = (0.158, 0.166, 0.177), stdev = 0.006
  Confidence interval (99.9%): [0.159, 0.172]


# Run complete. Total time: 00:01:02

Benchmark           Mode  Cnt  Score   Error  Units
ScalaBench.testMap  avgt   15  0.154 ± 0.028  us/op
ScalaBench.tstPM    avgt   15  0.166 ± 0.007  us/op

```