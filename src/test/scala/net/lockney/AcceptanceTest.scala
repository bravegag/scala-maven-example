package net.lockney

import net.lockney.dao.SimpleDAO
import org.scalatest.{FeatureSpec, GivenWhenThen}

class AcceptanceTest extends FeatureSpec with GivenWhenThen {

  println("the thread loading this Suite has ThreadId=%d".format(Thread.currentThread.getId))    
  Thread.sleep(math.round(10000.0*math.random))
  
  info("As a user")
  info("I want to be able to create a simple thing and implicitly start it")
  info("So that I can then turn it off")
  info("And see that it is stopped")

  feature("Simple thing state") {    
    println("the thread executing this Test has ThreadId=%d".format(Thread.currentThread.getId))    
    Thread.sleep(math.round(10000.0*math.random))
    
    scenario("User stops thing when it's already on") {

      Given("An initialized thing, that has not been started")
      val simpleThing = new SimpleDAO(false)

      When("User stops it again")
      intercept[UnsupportedOperationException] {
        simpleThing.stop()
      }

      Then("We should see that it is stopped")
      assert(simpleThing.started() == false)
    }
  }
}
