import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(GitVersioning,GitBranchPrompt,BuildInfoPlugin,JavaAppPackaging,BuildInfoPlugin).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      
    )),
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )
