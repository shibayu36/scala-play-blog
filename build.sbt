name := """scala-play-blog"""
organization := "org.shibayu36"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test
libraryDependencies += "org.jsoup" % "jsoup" % "1.10.3" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.shibayu36.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.shibayu36.binders._"
