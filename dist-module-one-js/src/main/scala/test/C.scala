/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */

package test

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = s"<strong>${A.theString()}</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)
  }

  def m(): Unit = {
    error("boom!") // `Predef.error` is deprecated
  }
}
