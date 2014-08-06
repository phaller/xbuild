/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */

package dist

import sbt._
import Keys._

object DistBuild extends Build {

  lazy val buildSettings = Seq(
    organization := "org.xbuild.dist", // dummy value
    version      := "0.1-SNAPSHOT",
    scalaVersion := "2.11.1" // TODO: move to Dependencies.Versions.scalaVersion
  )

  lazy val moduleOne = Project(
    id = "dist-module-one",
    base = file("dist-module-one")
  )

  lazy val moduleOneJS = Project(
    id = "dist-module-one-js",
    base = file("dist-module-one-js")
  )

  override lazy val settings =
    super.settings ++
    buildSettings

  lazy val defaultSettings = Seq(
    scalacOptions in Compile ++= Seq("-encoding", "UTF-8", "-target:jvm-1.6", "-deprecation", "-feature", "-unchecked", "-Xlog-reflective-calls", "-Xlint")
  )

}
