package net.lockney

import org.scalatest.{Matchers, FunSuite}

class MatcherExampleSuite extends FunSuite with Matchers {

  println("** loading '%s' Suite with ThreadId=%d".format(this.getClass.getName, Thread.currentThread.getId))    
  Thread.sleep(math.round(10000.0*math.random))
  
  test("equality") {    
    println("==> executing 'equality' test with ThreadId=%d".format(Thread.currentThread.getId))    
    Thread.sleep(math.round(10000.0*math.random))
    
    val i = 3

    i should equal (3)
//    i should === 3
    i should be (3)
    i shouldEqual(3)
    i shouldBe 3

    Array(1, 3) should equal(Array(1, 3))
  }

  test("string matchers") {
    val aString = "something"

    aString should startWith("some")
    aString should endWith("some")
    aString should include("eth")
  }



}
