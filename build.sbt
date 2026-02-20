val root = (project in file("."))
  .settings(
    name := "dfdl-bmp",
    organization := "org.mitre",
    version := "0.0.1",
  )
  .daffodilProject()
