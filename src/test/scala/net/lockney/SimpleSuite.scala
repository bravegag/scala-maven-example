package net.lockney

import net.lockney.model.SimpleObject
import org.scalatest.{DiagrammedAssertions, FunSuite}

class SimpleSuite extends FunSuite {

  println("** loading '%s' Suite with ThreadId=%d".format(this.getClass.getName, Thread.currentThread.getId))    
  Thread.sleep(math.round(10000.0*math.random))

  test("An empty Set should have size 0") {
    println("==> executing 'An empty Set should have size 0' test with ThreadId=%d".format(Thread.currentThread.getId))    
    Thread.sleep(math.round(10000.0*math.random))

    assert(Set.empty.size == 0)
  }

  test("A SimpleObject should allow construction with a string") {
    println("the thread executing this test has ThreadId=%d".format(Thread.currentThread.getId))
    
    val simple = new SimpleObject("a string")
    assert(simple.getAString === "a string")
  }
}
