package mymaxconsec

import scala.annotation.tailrec

class MyMaxConsec {

  def maxLengthTail (consec:List[Int]): Int = {
    @tailrec
    def tailrec (xs:List[Int], index:Int, max:Int, count:Int): Int = {
      if (index+1 >= xs.size) {
        if (count > max) count
        else max
      }
      else {
        if (xs(index+1) == xs(index)) {tailrec(xs, index+1, max, count+1)}
        else {
          if(count > max) tailrec(xs, index+1, count, 1)
          else tailrec(xs, index+1, max, 1)
        }
      }
    }
    tailrec(consec, 0, 0, 1)
  }

  def maxLength (consec:List[Int], index:Int, max:Int, count:Int): Int = {

    if (index+1 >= consec.size) {
      if (count > max) count
      else max
    }
    else {
      if (consec(index+1) == consec(index)) {maxLength(consec, index+1, max, count+1)}
      else {
        if(count > max) maxLength(consec, index+1, count, 1)
        else maxLength(consec, index+1, max, 1)
      }
    }
  }
}
