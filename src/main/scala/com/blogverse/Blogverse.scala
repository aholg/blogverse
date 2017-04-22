package com.blogverse

object Blogverse {
  def main(args: Array[String]): Unit = {
    var akkaServer: AkkaServer = new AkkaServer

    akkaServer.startServer("localhost", 8080)
  }
}
