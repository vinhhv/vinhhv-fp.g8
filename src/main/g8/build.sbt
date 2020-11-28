import sbt._
import sbt.Keys._


lazy val `root` = project.
  .in(file("."))
  .settings(ScalaConfig.commonSettings)
  .settings(libraryDependencies ++= Dependencies.common.value)
  .settings(moduleName := "<FILL_ME>")
  .settings(name := "<FILL_ME>")
  .settings(mainClass in (Compile, run) := Some("io.vinhhv.<FILL_ME>"))
  .settings(
      libraryDependencies ++= Dependencies.server.value
    )
  )
