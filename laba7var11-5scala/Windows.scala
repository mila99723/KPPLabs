package task2

class Windows extends OperatingSystem {
  /*
  private val browser:String = "Edge"
  abstract var browser:String

  def setBrowser (str:String):String ={
    browser = str
    browser
  }*/

   val browser : String =
    (Math.random()*5).toInt match {
      case 1 => "Google Chrome"
      case 2 => "Opera"
      case 3 => "Internet Explorer"
      case 4 => "Microsoft Edge"
      case 5 => "Mozilla Firefox"
    }

  def getLink ():String = {
    browser match {
      case (s1:String) if(s1 == "Internet Explorer") => "ERROR"
      case (s1:String) if(s1 != "Internet Explorer") => getDownloadLink()
    }
  }
}
