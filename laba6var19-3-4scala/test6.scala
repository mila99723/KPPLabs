import org.scalatest._
import laba6.functions

class test6 extends FunSuite{

  test("my partitioning into 2 list above and below zero is running correctly"){
    val part = new functions
    assert(part.partAboveZero( List(1, 23, -4, 7, -34, -6) ) == (List(1, 23, 7), List(-4, -34, -6)))
  }

  test("my turning prelast collection element is running correctly"){
    val part = new functions
    assert(part.preLastElem( List(1, 2, 3, 67, -4, 9) ) == -4)
  }

  test("my filtering map by even keys is running correctly"){
    val part = new functions
    assert(part.mapValWithEvenKey( Map(2 -> "A", 1 -> "B", 3 -> "C", 4 -> "D") ) == List("A", "D"))
  }
}