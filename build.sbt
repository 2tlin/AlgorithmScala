ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "AlgorithmScala"
  )

version := "0.7.9"
scalaVersion := "2.12.10"

val sparkVersion = "3.1.1"
val hadoopVersion = "3.2.0"
val sttpVersion = "3.1.9"
val scalaTestVersion = "3.2.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion, // % Provided,
  "org.apache.spark" %% "spark-avro" % sparkVersion,

  "org.apache.hadoop" % "hadoop-aws" % hadoopVersion,
  "com.typesafe" % "config" % "1.4.1",

  "com.softwaremill.sttp.client3" %% "core" % sttpVersion,
  "com.softwaremill.sttp.client3" %% "json4s" % sttpVersion,
  "org.json4s" %% "json4s-native" % "3.7.0-M5",

  "com.bettercloud" % "vault-java-driver" % "5.1.0",

  "org.postgresql" % "postgresql" % "42.3.1",

  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
  "org.scalatest" %% "scalatest-propspec" % scalaTestVersion % Test,
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0" % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
)


