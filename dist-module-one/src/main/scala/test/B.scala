/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */

package test

class B {
  def m(): Unit = {
    error("boom!") // `Predef.error` is deprecated
  }
}
