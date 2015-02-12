package com.skisel

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Fork(3)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
class ScalaBench {

  case class Key(i: Int)

  val keys: List[Key] = (1 to 10) map Key toList
  val map: Map[Int, Key] = keys map {
    key: Key => key.i -> key
  } toMap

  val v1 = map(1)
  val v2 = map(2)
  val v3 = map(3)
  val v4 = map(4)
  val v5 = map(5)
  val v6 = map(6)
  val v7 = map(7)
  val v8 = map(8)
  val v9 = map(9)
  val v10 = map(10)
  val pf: PartialFunction[Int, Key] = {
    case 0 => v1
    case 1 => v2
    case 2 => v3
    case 3 => v4
    case 4 => v5
    case 5 => v6
    case 6 => v7
    case 7 => v8
    case 8 => v9
    case 9 => v10
  }

  @Benchmark
  def testMap() = {
    (map(1), map(2), map(3), map(4), map(5), map(6), map(7), map(8), map(9), map(10))
  }

  @Benchmark
  def tstPM() = {
    (pf(0), pf(1), pf(2), pf(3),pf(4), pf(5),pf(6),pf(7),pf(8),pf(9))
  }


}
