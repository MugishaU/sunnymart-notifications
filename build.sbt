import Dependencies.core

ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val assemblySettings = Seq(
  assembly / packageOptions ~= { pos =>
    pos.filterNot { po =>
      po.isInstanceOf[Package.MainClass]
    }
  },
  assembly / assemblyMergeStrategy := {
    case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
    case x if x.startsWith("META-INF")       => MergeStrategy.first
    case PathList("codegen-resources", _)    => MergeStrategy.first
    case "module-info.class"                 => MergeStrategy.first
    case _ => MergeStrategy.first
  }
)

lazy val root = (project in file("."))
  .settings(
    name := "sunnymart-notifications",
    libraryDependencies ++= core
  )
  .settings(assemblySettings)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
