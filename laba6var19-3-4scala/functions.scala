package laba6

class functions {

  //divide colletion in two: >0 and <0
  def partAboveZero (list:List[Int]): (List[Int], List[Int]) = {
    list.partition(_ > 0) // part 1 var 19 { (az, bz) az.foreach(println) bz.foreach(println) }
  }

  //turning prelast element of the collection
  def preLastElem (list:List[Int]): Int = {
    // val prelast = list.reduceLeft(_ + _) - (list.reduceLeft(_ + _) - list.takeRight(2).reduceLeft(_ + _)) - list.takeRight(1).reduceLeft(_ + _)
    list.init.fold(0)(_ + _) - list.init.init.fold(0)(_ + _)
  }

  //make list from Map elements with even key
  def mapValWithEvenKey (map:Map[Int, String]): List[String] = {
    map.filterKeys(_ % 2 == 0).values.toList
  }
}
