package com.scalaApp

import org.scalatest.FunSuite

/**
 * Created by DeepakGiggs on 06/12/13.
 */
class EmailTest extends FunSuite {

  test("checking valid email address") {

    val email = Email("abcdef@gmail.com")
    assert(email.email != null)
  }

}
