This benchmark is to compare performance of various use cases of Map and pattern matching in Scala

```
Result: 0.183 ±(99.9%) 0.015 us/op [Average]
  Statistics: (min, avg, max) = (0.165, 0.183, 0.210), stdev = 0.014
  Confidence interval (99.9%): [0.168, 0.199]


Result: 0.109 ±(99.9%) 0.011 us/op [Average]
  Statistics: (min, avg, max) = (0.102, 0.109, 0.140), stdev = 0.010
  Confidence interval (99.9%): [0.098, 0.120]

Benchmark           Mode  Cnt  Score   Error  Units
ScalaBench.testMap  avgt   15  0.183 ± 0.015  us/op
ScalaBench.tstPM    avgt   15  0.109 ± 0.011  us/op
```