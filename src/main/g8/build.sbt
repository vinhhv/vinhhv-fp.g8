import sbt._
import sbt.Keys._


lazy val `root` = project
  .in(file("."))
  .settings(ScalaConfig.commonSettings)
  .settings(libraryDependencies ++= Dependencies.common.value)
  .settings(moduleName := "$name$")
  .settings(name := "$name$")
  .settings(mainClass in (Compile, run) := Some("io.vinhhv.$module$"))
  .settings(libraryDependencies ++= Dependencies.server.value)
