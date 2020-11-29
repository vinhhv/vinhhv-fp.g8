import sbt._
import sbt.Keys._


lazy val `root` = Project("$name$", file("."))
  .settings(ScalaConfig.commonSettings)
  .settings(libraryDependencies ++= Dependencies.common.value)
  .settings(moduleName := "$name;format="norm"$")
  .settings(name := "$name$")
  .settings(mainClass in (Compile, run) := Some("io.vinhhv.$module$.Main"))
  .settings(libraryDependencies ++= Dependencies.server.value)
