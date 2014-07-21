package dist

import sbt._

import scala.scalajs.sbtplugin.ScalaJSPlugin._ // import `%%%` extension method

object Dependencies {
  object Compile {
    val scalajsDom = "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6" // MIT
  }

  import Compile._

  val moduleOneJS = Seq(scalajsDom)
}
