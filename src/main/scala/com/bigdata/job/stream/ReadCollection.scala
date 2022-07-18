package com.bigdata.job.stream

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.scala._
import org.slf4j.{Logger, LoggerFactory}

object ReadCollection {
  val appName:String = this.getClass.getSimpleName.replace("$","")
//  private val logger: Logger = LoggerFactory.getLogger(appName)
  val env:StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment


  def main(args: Array[String]): Unit = {
//    readCollection()
    println("-------start--------")
    readElements()

  }

  def readCollection(): Unit ={
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val stream: DataStream[Int] = env.fromCollection(List(1,2,3,5,7))
    stream.print()
//    logger.info("开始执行")
    env.execute(appName)
  }

  def readElements(): Unit ={
    val stream = env.fromElements(1,5,84,"sdsdafaa",true)
    stream.print()
//    logger.info("开始执行")
    env.execute(appName)
  }

}
