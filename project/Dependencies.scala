
import sbt._

object Dependencies {

  val awsJDKVersion = "1.12.70"

  lazy val projectDependencies = Seq(
    "com.amazonaws" % "aws-java-sdk-dynamodb" % awsJDKVersion,
    "com.amazonaws" % "aws-java-sdk-s3" % awsJDKVersion,
    "com.amazonaws" % "aws-lambda-java-core" % "1.2.1",
    "com.amazonaws" % "aws-lambda-java-events" % "3.10.0"
  )

  lazy val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
  )

  lazy val logging = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.6",
    "de.siegmar" % "logback-awslogs-json-encoder" % "1.1.0"
  )

  lazy val core: Seq[ModuleID] = projectDependencies ++ testDependencies ++ logging
}
