package testproj

import scalaj.http._

object Hello {

  def main(args : Array[String]) = {
    println("Hello World")
    testResponse
  }
 
  def testResponse {
      val response: HttpResponse[String] = Http("https://ddg.gg/").param("q","monkeys").asString
      println(response.body)
      println(response.code)
      println(response.headers)
      println(response.cookies)
  }
}
