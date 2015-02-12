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


Result: 0.183 ±(99.9%) 0.015 us/op [Average]
  Statistics: (min, avg, max) = (0.165, 0.183, 0.210), stdev = 0.014
  Confidence interval (99.9%): [0.168, 0.199]


# JMH 1.5.2 (released 6 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.skisel.ScalaBench.tstPM


Result: 0.109 ±(99.9%) 0.011 us/op [Average]
  Statistics: (min, avg, max) = (0.102, 0.109, 0.140), stdev = 0.010
  Confidence interval (99.9%): [0.098, 0.120]


# Run complete. Total time: 00:01:02

Benchmark           Mode  Cnt  Score   Error  Units
ScalaBench.testMap  avgt   15  0.183 ± 0.015  us/op
ScalaBench.tstPM    avgt   15  0.109 ± 0.011  us/op