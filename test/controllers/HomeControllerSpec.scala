package controllers

import play.api.test._
import play.api.test.Helpers._
import org.jsoup.Jsoup

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class HomeControllerSpec extends test.ControllerSpec {
  describe("HomeController GET") {
    it("render the index page from a new instance of controller") {
      val controller = new HomeController(stubControllerComponents())
      val home = controller.index().apply(FakeRequest(GET, "/"))

      status(home) shouldBe OK
      contentType(home) shouldBe Some("text/html")
      contentAsString(home) should include ("Welcome to Play")

      val doc = Jsoup.parse(contentAsString(home))

      val h1 = doc.select("h1")
      h1.text shouldBe "Welcome to Play!"

      val pElems = doc.select("p")
      pElems.get(0).text shouldBe "hoge1"
      pElems.get(1).text shouldBe "fuga1"
      pElems.get(2).text shouldBe "hoge2"
      pElems.get(3).text shouldBe "fuga2"

      val pWithClass1Elems = doc.select("p.class1")
      pWithClass1Elems.get(0).text shouldBe "hoge1"
      pWithClass1Elems.get(1).text shouldBe "hoge2"

      // nested example
      val div1Elem = doc.select(".div1").first
      val pElemsInDiv1 = div1Elem.select("p")
      pElemsInDiv1.get(0).text shouldBe "hoge1"
      pElemsInDiv1.get(1).text shouldBe "fuga1"
    }
  }
}
