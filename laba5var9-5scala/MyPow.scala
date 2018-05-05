package mypow

import scala.annotation.tailrec

class MyPow {

  def mypow1 (a:Double, b:Int): Double =
    Math.pow(a, b)

  def mypow2 (a:Int, b:Int): Double ={
    if (b == 1) a
    else a*mypow2(a, b-1)
  }

  def mypowtail (a:Int, b:Int): Double ={
    @tailrec
    def iter (acc: Int, a:Int, b:Int): Double ={
      if (b == 0) acc
      else iter(acc*a, a, b-1)
    }
    iter(1, a, b)
  }

}
