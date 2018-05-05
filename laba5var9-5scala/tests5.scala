import org.scalatest._
import mypow.MyPow
import mymaxconsec.MyMaxConsec

class tests5 extends FunSuite {

  test("Pow tail is running correctly"){
    val tail = new MyPow
    assert(tail.mypowtail( 2, 5) == 32.0)
  }

  test("my Pow is running correctly"){
    val pow = new MyPow
    assert(pow.mypow2( 2, 5) == 32.0)
  }

  test("my max length consec tail is running correctly"){
    val tail = new MyMaxConsec
    assert(tail.maxLengthTail( List(1,2,2,2,2,2,2,2,2,3,3,3,4,6,2,2,2,2,9,9,9,9,9,9,9,9,9) ) == 9)
  }

  test("my max length consec is running correctly"){
    val max = new MyMaxConsec
    assert(max.maxLength( List(1,2,2,2,2,2,2,2,2,3,3,3,4,6,2,2,2,2,9,9,9,9,9,9,9,9,9), 0, 1, 1 ) == 9)
  }
}
