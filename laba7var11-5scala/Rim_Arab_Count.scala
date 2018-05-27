package task1

import scala.annotation.tailrec

class Rim_Arab_Count {

  def Convert (rim:String): Int = {
    @tailrec
    def tailrec (xs:Array[Char], index:Int, count:Int): Int = {
      if (index >= xs.size) count
      else {
        xs(index) match {
          case 'I' => tailrec(xs, index+1, count+1)
          case 'V' => tailrec(xs, index+1, count+5)
          case 'X' => tailrec(xs, index+1, count+10)
          case 'L' => tailrec(xs, index+1, count+50)
          case 'C' => tailrec(xs, index+1, count+100)
          case 'D' => tailrec(xs, index+1, count+500)
          case 'M' => tailrec(xs, index+1, count+1000)
        }
      }
    }
    tailrec(rim.toArray, 0, 0)
  }

}
