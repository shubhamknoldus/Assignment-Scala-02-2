package edu.knoldus.application

import edu.knoldus.operation.tiffinpayemnt.paymentclasses.{CardPayment, Cash, NetBanking, PaytmOrFreecharge}
import edu.knoldus.operation.tiffinpayemnt.tiffin.MakePaymentForTiffin
import org.apache.log4j.Logger

object ApplicationObject extends App {


  val amount1 = 23
  val amount2 = 56
  val amount3 = 78
  val amount4 = 39

  val paytmObj = PaytmOrFreecharge(amount1)
  val cardObj = CardPayment(amount2)
  val netBankingObj = NetBanking(amount3)
  val cashObj = Cash(amount4)
  val tiffin = new MakePaymentForTiffin
  val logger = Logger.getLogger(this.getClass)

  val paymemtList = List(paytmObj, cardObj, netBankingObj, cashObj)

  paymemtList.map(paymentObject => {
    logger.info(s"${tiffin.makePayment(paymentObject)}")
  })

}
