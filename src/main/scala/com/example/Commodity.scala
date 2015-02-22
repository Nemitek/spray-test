package com.example

import akka.actor.{Props, Actor}

import scala.collection.mutable

object Commodities {
  case object Startup

}

class Commodities extends Actor {
  import Commodities._

  def receive = {
    case Startup => {
      context.actorOf(Props[Commodity], name = "gold")
    }
  }
  
}

object Commodity {
  case class
  
  
  def props(magicNumber: Int): Props = Props(new Commodity(magicNumber))
}

class Commodity extends Actor {
  var lastTradePrice = 0
  var askPrice = 0
  var bidPrice = 0
  
  // UserID, Price, Size
  val asks = new mutable.PriorityQueue[(BigInt, BigDecimal, BigInt)]
  
  def receive = {
    case Greeting(greeter) => log.info(s"I was greeted by $greeter.")
    case Goodbye => log.info("Someone said goodbye to me.")
  }
}
