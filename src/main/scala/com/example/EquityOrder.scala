package com.example

import scala.collection.mutable

abstract class EquityOrder {
  val userId: BigInt
  val price: BigDecimal
  val quantity: BigInt
  val timestamp: BigInt
}

case class EquityOrder(userId: BigInt, price: BigDecimal, quantity: BigInt, timestamp: BigInt) extends Ordered[EquityOrder] {
  def compare(that: EquityOrder) = that.price compare this.price
}




trait Equity {
  var lastTradePrice = 0
  var askPrice = new mutable.PriorityQueue[EquityOrder]()
  var bidPrice = new mutable.PriorityQueue[EquityOrder]
  
//var askPrice = new mutable.PriorityQueue[EquityOrder] (new Ordering[EquityOrder] {
//    def compare(t1:EquityOrder, t2:EquityOrder):Int=t2.price compare t1.price
//  })

}

