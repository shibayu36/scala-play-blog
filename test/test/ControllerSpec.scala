package test

import org.scalatest.FunSpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest

abstract class ControllerSpec extends FunSpec with GuiceOneAppPerTest with org.scalatest.Matchers
