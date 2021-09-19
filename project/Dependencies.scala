import sbt._

object Dependencies {
  val awsVersion = "1.12.70"
  lazy val projectDependencies = Seq(
    "com.amazonaws" % "aws-java-sdk-dynamodb" % awsVersion
  )
  lazy val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
  )

  val allDependencies: Seq[ModuleID] = projectDependencies ++ testDependencies
}
