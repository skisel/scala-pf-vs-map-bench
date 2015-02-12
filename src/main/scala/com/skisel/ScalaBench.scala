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

  sealed trait T

  case class C1(i: Int)  extends T
  case class C2(i: Int)  extends T
  case class C3(i: Int)  extends T
  case class C4(i: Int)  extends T
  case class C5(i: Int)  extends T
  case class C6(i: Int)  extends T
  case class C7(i: Int)  extends T
  case class C8(i: Int)  extends T
  case class C9(i: Int)  extends T
  case class C10(i: Int) extends T
  case class C11(i: Int) extends T
  case class C12(i: Int) extends T
  case class C13(i: Int) extends T
  case class C14(i: Int) extends T
  case class C15(i: Int) extends T
  case class C16(i: Int) extends T
  case class C17(i: Int) extends T
  case class C18(i: Int) extends T
  case class C19(i: Int) extends T
  case class C20(i: Int) extends T

  val map = Map[Class[_],T](
    C1.getClass ->  C1 (1),
    C2.getClass ->  C2 (2),
    C3.getClass ->  C3 (3),
    C4.getClass ->  C4 (4),
    C5.getClass ->  C5 (5),
    C6.getClass ->  C6 (6),
    C7.getClass ->  C7 (7),
    C8.getClass ->  C8 (8),
    C9.getClass ->  C9 (9),
    C10.getClass -> C10(10),
    C11.getClass -> C11(11),
    C12.getClass -> C12(12),
    C13.getClass -> C13(13),
    C14.getClass -> C14(14),
    C15.getClass -> C15(15),
    C16.getClass -> C16(16),
    C17.getClass -> C17(17),
    C18.getClass -> C18(18),
    C19.getClass -> C19(19),
    C20.getClass -> C20(20)
  )


  val pf: PartialFunction[T,Int] = {
    case C1 (1) =>   1
    case C2 (2) =>   2
    case C3 (3) =>   3
    case C4 (4) =>   4
    case C5 (5) =>   5
    case C6 (6) =>   6
    case C7 (7) =>   7
    case C8 (8) =>   8
    case C9 (9) =>   9
    case C10(10) =>  10
    case C11(11) =>  11
    case C12(12) =>  12
    case C13(13) =>  13
    case C14(14) =>  14
    case C15(15) =>  15
    case C16(16) =>  16
    case C17(17) =>  17
    case C18(18) =>  18
    case C19(19) =>  19
    case C20(20) =>  20
  }

  @Benchmark
  def testMap(): List[T] = {
    List(map(C1.getClass),
      map(C5.getClass),
      map(C4.getClass),
      map(C2.getClass),
      map(C5.getClass),
      map(C6.getClass))
  }

  @Benchmark
  def tstPM(): List[Int] = {
    List( pf(C1(1)),
          pf(C5(5)),
          pf(C4(4)),
          pf(C2(2)),
          pf(C5(5)),
          pf(C6(6)))
  }


}
