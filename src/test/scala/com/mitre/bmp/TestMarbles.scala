package com.mitre.bmp
import org.junit.Test
import org.apache.daffodil.tdml.Runner

object TestMarbles {
  val testDir = "com/mitre/bmp/Marbles"
  val tdmlFile = "Marbles.tdml"
  lazy val runner = Runner(testDir, tdmlFile, compileAllTopLevel = true)
}

class TestMarbles {
  import TestMarbles._

  @Test def test_Marbles() = { runner.runOneTest("Marbles") }
}
