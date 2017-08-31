package test

import org.scalatest.FunSpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite

abstract class ControllerSpec extends FunSpec with GuiceOneAppPerSuite with org.scalatest.Matchers
