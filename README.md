This benchmark is to compare performance of various use cases of Map and pattern matching in Scala

```
$ java -jar target/benchmarks.jar
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

# Run progress: 0.00% complete, ETA 00:03:00
# Fork: 1 of 3
# Warmup Iteration   1: 0.042 us/op
# Warmup Iteration   2: 0.042 us/op
# Warmup Iteration   3: 0.033 us/op
# Warmup Iteration   4: 0.042 us/op
# Warmup Iteration   5: 0.029 us/op
Iteration   1: 0.024 us/op
Iteration   2: 0.025 us/op
Iteration   3: 0.026 us/op
Iteration   4: 0.026 us/op
Iteration   5: 0.026 us/op

# Run progress: 5.56% complete, ETA 00:03:01
# Fork: 2 of 3
# Warmup Iteration   1: 0.041 us/op
# Warmup Iteration   2: 0.034 us/op
# Warmup Iteration   3: 0.030 us/op
# Warmup Iteration   4: 0.029 us/op
# Warmup Iteration   5: 0.029 us/op
Iteration   1: 0.032 us/op
Iteration   2: 0.031 us/op
Iteration   3: 0.029 us/op
Iteration   4: 0.030 us/op
Iteration   5: 0.033 us/op

# Run progress: 11.11% complete, ETA 00:02:50
# Fork: 3 of 3
# Warmup Iteration   1: 0.042 us/op
# Warmup Iteration   2: 0.040 us/op
# Warmup Iteration   3: 0.029 us/op
# Warmup Iteration   4: 0.033 us/op
# Warmup Iteration   5: 0.029 us/op
Iteration   1: 0.029 us/op
Iteration   2: 0.029 us/op
Iteration   3: 0.029 us/op
Iteration   4: 0.031 us/op
Iteration   5: 0.029 us/op


Result: 0.029 ±(99.9%) 0.003 us/op [Average]
  Statistics: (min, avg, max) = (0.024, 0.029, 0.033), stdev = 0.003
  Confidence interval (99.9%): [0.026, 0.031]


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

# Run progress: 16.67% complete, ETA 00:02:39
# Fork: 1 of 3
# Warmup Iteration   1: 0.192 us/op
# Warmup Iteration   2: 0.158 us/op
# Warmup Iteration   3: 0.185 us/op
# Warmup Iteration   4: 0.151 us/op
# Warmup Iteration   5: 0.137 us/op
Iteration   1: 0.146 us/op
Iteration   2: 0.140 us/op
Iteration   3: 0.140 us/op
Iteration   4: 0.147 us/op
Iteration   5: 0.149 us/op

# Run progress: 22.22% complete, ETA 00:02:28
# Fork: 2 of 3
# Warmup Iteration   1: 0.211 us/op
# Warmup Iteration   2: 0.183 us/op
# Warmup Iteration   3: 0.146 us/op
# Warmup Iteration   4: 0.166 us/op
# Warmup Iteration   5: 0.159 us/op
Iteration   1: 0.138 us/op
Iteration   2: 0.143 us/op
Iteration   3: 0.148 us/op
Iteration   4: 0.158 us/op
Iteration   5: 0.138 us/op

# Run progress: 27.78% complete, ETA 00:02:18
# Fork: 3 of 3
# Warmup Iteration   1: 0.213 us/op
# Warmup Iteration   2: 0.174 us/op
# Warmup Iteration   3: 0.151 us/op
# Warmup Iteration   4: 0.161 us/op
# Warmup Iteration   5: 0.140 us/op
Iteration   1: 0.155 us/op
Iteration   2: 0.145 us/op
Iteration   3: 0.137 us/op
Iteration   4: 0.157 us/op
Iteration   5: 0.151 us/op


Result: 0.146 ±(99.9%) 0.007 us/op [Average]
  Statistics: (min, avg, max) = (0.137, 0.146, 0.158), stdev = 0.007
  Confidence interval (99.9%): [0.139, 0.154]


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

# Run progress: 33.33% complete, ETA 00:02:07
# Fork: 1 of 3
# Warmup Iteration   1: 0.610 us/op
# Warmup Iteration   2: 0.488 us/op
# Warmup Iteration   3: 0.413 us/op
# Warmup Iteration   4: 0.398 us/op
# Warmup Iteration   5: 0.423 us/op
Iteration   1: 0.428 us/op
Iteration   2: 0.438 us/op
Iteration   3: 0.440 us/op
Iteration   4: 0.447 us/op
Iteration   5: 0.415 us/op

# Run progress: 38.89% complete, ETA 00:01:56
# Fork: 2 of 3
# Warmup Iteration   1: 0.570 us/op
# Warmup Iteration   2: 0.534 us/op
# Warmup Iteration   3: 0.416 us/op
# Warmup Iteration   4: 0.416 us/op
# Warmup Iteration   5: 0.428 us/op
Iteration   1: 0.455 us/op
Iteration   2: 0.435 us/op
Iteration   3: 0.430 us/op
Iteration   4: 0.511 us/op
Iteration   5: 0.470 us/op

# Run progress: 44.44% complete, ETA 00:01:46
# Fork: 3 of 3
# Warmup Iteration   1: 0.661 us/op
# Warmup Iteration   2: 0.594 us/op
# Warmup Iteration   3: 0.463 us/op
# Warmup Iteration   4: 0.410 us/op
# Warmup Iteration   5: 0.408 us/op
Iteration   1: 0.440 us/op
Iteration   2: 0.426 us/op
Iteration   3: 0.391 us/op
Iteration   4: 0.475 us/op
Iteration   5: 0.452 us/op


Result: 0.444 ±(99.9%) 0.030 us/op [Average]
  Statistics: (min, avg, max) = (0.391, 0.444, 0.511), stdev = 0.028
  Confidence interval (99.9%): [0.414, 0.473]


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

# Run progress: 50.00% complete, ETA 00:01:35
# Fork: 1 of 3
# Warmup Iteration   1: 0.042 us/op
# Warmup Iteration   2: 0.039 us/op
# Warmup Iteration   3: 0.036 us/op
# Warmup Iteration   4: 0.030 us/op
# Warmup Iteration   5: 0.030 us/op
Iteration   1: 0.029 us/op
Iteration   2: 0.030 us/op
Iteration   3: 0.030 us/op
Iteration   4: 0.030 us/op
Iteration   5: 0.030 us/op

# Run progress: 55.56% complete, ETA 00:01:24
# Fork: 2 of 3
# Warmup Iteration   1: 0.027 us/op
# Warmup Iteration   2: 0.021 us/op
# Warmup Iteration   3: 0.029 us/op
# Warmup Iteration   4: 0.020 us/op
# Warmup Iteration   5: 0.022 us/op
Iteration   1: 0.021 us/op
Iteration   2: 0.019 us/op
Iteration   3: 0.018 us/op
Iteration   4: 0.019 us/op
Iteration   5: 0.019 us/op

# Run progress: 61.11% complete, ETA 00:01:14
# Fork: 3 of 3
# Warmup Iteration   1: 0.037 us/op
# Warmup Iteration   2: 0.033 us/op
# Warmup Iteration   3: 0.027 us/op
# Warmup Iteration   4: 0.023 us/op
# Warmup Iteration   5: 0.023 us/op
Iteration   1: 0.023 us/op
Iteration   2: 0.023 us/op
Iteration   3: 0.023 us/op
Iteration   4: 0.023 us/op
Iteration   5: 0.024 us/op


Result: 0.024 ±(99.9%) 0.005 us/op [Average]
  Statistics: (min, avg, max) = (0.018, 0.024, 0.030), stdev = 0.005
  Confidence interval (99.9%): [0.019, 0.029]


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

# Run progress: 66.67% complete, ETA 00:01:03
# Fork: 1 of 3
# Warmup Iteration   1: 0.232 us/op
# Warmup Iteration   2: 0.298 us/op
# Warmup Iteration   3: 0.204 us/op
# Warmup Iteration   4: 0.159 us/op
# Warmup Iteration   5: 0.148 us/op
Iteration   1: 0.147 us/op
Iteration   2: 0.156 us/op
Iteration   3: 0.171 us/op
Iteration   4: 0.192 us/op
Iteration   5: 0.167 us/op

# Run progress: 72.22% complete, ETA 00:00:53
# Fork: 2 of 3
# Warmup Iteration   1: 0.149 us/op
# Warmup Iteration   2: 0.126 us/op
# Warmup Iteration   3: 0.109 us/op
# Warmup Iteration   4: 0.108 us/op
# Warmup Iteration   5: 0.109 us/op
Iteration   1: 0.118 us/op
Iteration   2: 0.111 us/op
Iteration   3: 0.110 us/op
Iteration   4: 0.113 us/op
Iteration   5: 0.120 us/op

# Run progress: 77.78% complete, ETA 00:00:42
# Fork: 3 of 3
# Warmup Iteration   1: 0.161 us/op
# Warmup Iteration   2: 0.147 us/op
# Warmup Iteration   3: 0.123 us/op
# Warmup Iteration   4: 0.123 us/op
# Warmup Iteration   5: 0.121 us/op
Iteration   1: 0.131 us/op
Iteration   2: 0.127 us/op
Iteration   3: 0.120 us/op
Iteration   4: 0.120 us/op
Iteration   5: 0.135 us/op


Result: 0.136 ±(99.9%) 0.027 us/op [Average]
  Statistics: (min, avg, max) = (0.110, 0.136, 0.192), stdev = 0.025
  Confidence interval (99.9%): [0.109, 0.163]


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

# Run progress: 83.33% complete, ETA 00:00:31
# Fork: 1 of 3
# Warmup Iteration   1: 0.459 us/op
# Warmup Iteration   2: 0.410 us/op
# Warmup Iteration   3: 0.335 us/op
# Warmup Iteration   4: 0.333 us/op
# Warmup Iteration   5: 0.346 us/op
Iteration   1: 0.335 us/op
Iteration   2: 0.337 us/op
Iteration   3: 0.344 us/op
Iteration   4: 0.367 us/op
Iteration   5: 0.338 us/op

# Run progress: 88.89% complete, ETA 00:00:21
# Fork: 2 of 3
# Warmup Iteration   1: 0.452 us/op
# Warmup Iteration   2: 0.358 us/op
# Warmup Iteration   3: 0.302 us/op
# Warmup Iteration   4: 0.315 us/op
# Warmup Iteration   5: 0.326 us/op
Iteration   1: 0.340 us/op
Iteration   2: 0.315 us/op
Iteration   3: 0.345 us/op
Iteration   4: 0.320 us/op
Iteration   5: 0.322 us/op

# Run progress: 94.44% complete, ETA 00:00:10
# Fork: 3 of 3
# Warmup Iteration   1: 0.486 us/op
# Warmup Iteration   2: 0.399 us/op
# Warmup Iteration   3: 0.349 us/op
# Warmup Iteration   4: 0.330 us/op
# Warmup Iteration   5: 0.323 us/op
Iteration   1: 0.323 us/op
Iteration   2: 0.324 us/op
Iteration   3: 0.324 us/op
Iteration   4: 0.357 us/op
Iteration   5: 0.338 us/op


Result: 0.335 ±(99.9%) 0.015 us/op [Average]
  Statistics: (min, avg, max) = (0.315, 0.335, 0.367), stdev = 0.014
  Confidence interval (99.9%): [0.320, 0.351]


# Run complete. Total time: 00:03:11

Benchmark           (arg)  Mode  Cnt  Score   Error  Units
ScalaBench.testMap      1  avgt   15  0.029 ± 0.003  us/op
ScalaBench.testMap      5  avgt   15  0.146 ± 0.007  us/op
ScalaBench.testMap     15  avgt   15  0.444 ± 0.030  us/op
ScalaBench.tstPM        1  avgt   15  0.024 ± 0.005  us/op
ScalaBench.tstPM        5  avgt   15  0.136 ± 0.027  us/op
ScalaBench.tstPM       15  avgt   15  0.335 ± 0.015  us/op

```