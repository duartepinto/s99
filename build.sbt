name := "s99"
organization := "net.ruippeixotog"
version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scala-lang.modules"      %% "scala-parser-combinators"       % "1.0.5",
  "org.specs2"                  %% "specs2-core"                    % "3.8.7"     % "test")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:implicitConversions")
