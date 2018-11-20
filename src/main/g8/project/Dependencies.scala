import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test
  lazy val logging = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )
}
