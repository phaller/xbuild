package dist

import sbt._

object Exclude {

  lazy val excludedFromModuleOne: Set[String] = Set(
    "B.scala"
  )

  lazy val excludeFromModuleOne: FileFilter = new FileFilter {
    def accept(pathname: File): Boolean = { // true if excluded
      excludedFromModuleOne.exists(_ == pathname.getName)
    }
  }

}
