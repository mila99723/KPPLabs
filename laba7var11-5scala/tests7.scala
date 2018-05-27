import org.scalatest._
import task1.Rim_Arab_Count
import task2.{Linux, MacOS, Windows}

class tests7 extends FunSuite{

  test("Convert Rin number to Arab"){
    val rim = new Rim_Arab_Count
    assert(rim.Convert("CXVII") == 117)
  }

  test("Browser matching Explorer error"){
    val os = new Windows
    if (os.browser == "Internet Explorer") assert(os.getLink() == "ERROR")
    else assert(os.getLink() == "www.download.link.1234.ready.html")
  }

  test("MacOS and Linus getting link"){
    val os = new MacOS
    val os1 = new Linux
    assert(os.link == "www.download.link.1234.ready.html" && os1.link == "www.download.link.1234.ready.html")
  }

}
