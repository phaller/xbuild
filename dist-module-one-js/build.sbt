import dist.DistBuild

import dist.Exclude

import scala.scalajs.sbtplugin.ScalaJSPlugin._ // import `%%%` extension method

scalaJSSettings

DistBuild.defaultSettings

unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "dist-module-one" / "src" / "main" / "scala"

excludeFilter in unmanagedSources := HiddenFileFilter || Exclude.excludeFromModuleOne

ScalaJSKeys.persistLauncher := true

ScalaJSKeys.persistLauncher in Test := false

libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6" // MIT
