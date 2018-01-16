package edu.knoldus.operation.tiffinpayemnt.tiffin

import edu.knoldus.operation.tiffinpayemnt.paymentclasses._

class MakePaymentForTiffin {

  def makePayment(paymentType: Payment): String = {

    paymentType match {
      case PaytmOrFreecharge(netAmount) =>
        s"the amount to be payed via Paytm or Freecharge is ${netAmount + netAmount * 2 / 100}\n"
      case NetBanking(netAmount) =>
      s"the amount to be payed via NetBanking is ${netAmount + 5}\n"
      case CardPayment(netAmount) =>
      s"the amount to be payed via Card is ${netAmount + 1.5}\n"
      case Cash(netAmount) =>
        s"the amount to be payed via Card is $netAmount\n"
      case _ => ""
    }

  }
}
