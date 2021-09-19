package com.mugishau.lambda

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent
import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import org.slf4j.{Logger, LoggerFactory}


object DeliveryNotifierLambda extends RequestHandler[ScheduledEvent,Unit] {
  def handleRequest(request: ScheduledEvent, context: Context): Unit = {
    val logger: Logger = LoggerFactory.getLogger(this.getClass)
    logger.info(s"Delivery Notifier Lambda Invoked. account: ${request.getAccount}. time: ${request.getTime.toString}")
    println(s"Delivery Notifier Lambda Invoked. account: ${request.getAccount}. time: ${request.getTime.toString}")
  }
}