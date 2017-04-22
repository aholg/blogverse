import sbt._

object Dependencies {
  private val AkkaHttpVersion = "10.0.5"
  lazy val `akka-http` = "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
}
