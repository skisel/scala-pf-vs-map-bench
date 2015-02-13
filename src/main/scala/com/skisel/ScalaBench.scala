package com.skisel

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

import scala.util.Random

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Fork(3)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
class ScalaBench {

  @Param(Array("1", "5", "15"))
  var arg: Int = _

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
    C1.getClass ->  C1 (1) ,
    C2.getClass ->  C2 (2) ,
    C3.getClass ->  C3 (3) ,
    C4.getClass ->  C4 (4) ,
    C5.getClass ->  C5 (5) ,
    C6.getClass ->  C6 (6) ,
    C7.getClass ->  C7 (7) ,
    C8.getClass ->  C8 (8) ,
    C9.getClass ->  C9 (9) ,
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
    case _:C1 =>   1
    case _:C2 =>   2
    case _:C3 =>   3
    case _:C4 =>   4
    case _:C5 =>   5
    case _:C6 =>   6
    case _:C7 =>   7
    case _:C8 =>   8
    case _:C9 =>   9
    case _:C10 =>  10
    case _:C11 =>  11
    case _:C12 =>  12
    case _:C13 =>  13
    case _:C14 =>  14
    case _:C15 =>  15
    case _:C16 =>  16
    case _:C17 =>  17
    case _:C18 =>  18
    case _:C19 =>  19
    case _:C20 =>  20
  }

  val pfInput = Random.shuffle(List(
    C1 (1) ,
    C2 (2) ,
    C3 (3) ,
    C4 (4) ,
    C5 (5) ,
    C6 (6) ,
    C7 (7) ,
    C8 (8) ,
    C9 (9) ,
    C10(10),
    C11(11),
    C12(12),
    C13(13),
    C14(14),
    C15(15),
    C16(16),
    C17(17),
    C18(18),
    C19(19),
    C20(20)
  ))

  val mapInput = Random.shuffle(List(
  C1.getClass ,
  C2.getClass ,
  C3.getClass ,
  C4.getClass ,
  C5.getClass ,
  C6.getClass ,
  C7.getClass ,
  C8.getClass ,
  C9.getClass ,
  C10.getClass,
  C11.getClass,
  C12.getClass,
  C13.getClass,
  C14.getClass,
  C15.getClass,
  C16.getClass,
  C17.getClass,
  C18.getClass,
  C19.getClass,
  C20.getClass
  ))

  @Benchmark
  def testMap(): List[T] = {
    mapInput.take(arg).map(map)
  }

  @Benchmark
  def tstPM(): List[Int] = {
    pfInput.take(arg).map(pf)
   }

}
