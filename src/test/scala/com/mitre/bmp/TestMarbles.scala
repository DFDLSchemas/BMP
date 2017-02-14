package com.mitre.bmp
import org.junit.Test
import edu.illinois.ncsa.daffodil.tdml.DFDLTestSuite
import edu.illinois.ncsa.daffodil.util.Misc

object TestMarbles {
  val tdmlFile = "Marbles/Marbles.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestMarbles {
  import TestMarbles._

  @Test def test_Marbles() { runner.runOneTest("Marbles") }
}
