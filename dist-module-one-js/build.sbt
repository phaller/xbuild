import dist.{DistBuild, Dependencies}

scalaJSSettings

DistBuild.defaultSettings

unmanagedSourceDirectories in Compile ++= (unmanagedSourceDirectories in Compile in DistBuild.moduleOne).value

excludeFilter in unmanagedSources := HiddenFileFilter || DistBuild.excludeFromModuleOne

ScalaJSKeys.persistLauncher := true

ScalaJSKeys.persistLauncher in Test := false

libraryDependencies ++= Dependencies.moduleOneJS
