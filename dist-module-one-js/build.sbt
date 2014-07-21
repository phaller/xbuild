import dist.DistBuild

scalaJSSettings

DistBuild.defaultSettings

unmanagedSourceDirectories in Compile ++= (unmanagedSourceDirectories in Compile in DistBuild.moduleOne).value

excludeFilter in unmanagedSources := HiddenFileFilter || DistBuild.excludeFromModuleOne

ScalaJSKeys.persistLauncher := true

ScalaJSKeys.persistLauncher in Test := false

libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
