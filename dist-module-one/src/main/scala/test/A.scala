/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */

package test

object A {

  def unused(): Unit = {
    error("boom!") // `Predef.error` is deprecated
  }

  def theString(): String = "From A: It works!"

}
