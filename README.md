This benchmark is to compare performance of various use cases of Map and pattern matching in Scala

```
skisel-mbp-work:scala-pf-vs-map-bench skisel$ java -jar target/benchmarks.jar
# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.testMap
# Parameters: (arg = 1)


Result: 0.102 ±(99.9%) 0.014 us/op [Average]
  Statistics: (min, avg, max) = (0.091, 0.102, 0.132), stdev = 0.013
  Confidence interval (99.9%): [0.088, 0.116]


# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.testMap
# Parameters: (arg = 5)


Result: 0.226 ±(99.9%) 0.018 us/op [Average]
  Statistics: (min, avg, max) = (0.204, 0.226, 0.260), stdev = 0.017
  Confidence interval (99.9%): [0.208, 0.244]


# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.testMap
# Parameters: (arg = 15)



Result: 0.504 ±(99.9%) 0.035 us/op [Average]
  Statistics: (min, avg, max) = (0.470, 0.504, 0.582), stdev = 0.033
  Confidence interval (99.9%): [0.469, 0.538]


# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM
# Parameters: (arg = 1)



Result: 0.113 ±(99.9%) 0.006 us/op [Average]
  Statistics: (min, avg, max) = (0.105, 0.113, 0.125), stdev = 0.006
  Confidence interval (99.9%): [0.106, 0.119]


# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM
# Parameters: (arg = 5)



Result: 0.222 ±(99.9%) 0.028 us/op [Average]
  Statistics: (min, avg, max) = (0.191, 0.222, 0.255), stdev = 0.026
  Confidence interval (99.9%): [0.194, 0.250]


# JMH 1.5.2 (released 7 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM
# Parameters: (arg = 15)



Result: 0.424 ±(99.9%) 0.031 us/op [Average]
  Statistics: (min, avg, max) = (0.381, 0.424, 0.496), stdev = 0.029
  Confidence interval (99.9%): [0.393, 0.454]


# Run complete. Total time: 00:03:11

Benchmark           (arg)  Mode  Cnt  Score   Error  Units
ScalaBench.testMap      1  avgt   15  0.102 ± 0.014  us/op
ScalaBench.testMap      5  avgt   15  0.226 ± 0.018  us/op
ScalaBench.testMap     15  avgt   15  0.504 ± 0.035  us/op
ScalaBench.tstPM        1  avgt   15  0.113 ± 0.006  us/op
ScalaBench.tstPM        5  avgt   15  0.222 ± 0.028  us/op
ScalaBench.tstPM       15  avgt   15  0.424 ± 0.031  us/op

```