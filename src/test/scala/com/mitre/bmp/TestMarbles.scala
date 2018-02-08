package com.mitre.bmp
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite
import org.apache.daffodil.util.Misc

object TestMarbles {
  val tdmlFile = "com/mitre/bmp/Marbles/Marbles.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestMarbles {
  import TestMarbles._

  @Test def test_Marbles() { runner.runOneTest("Marbles") }
}
