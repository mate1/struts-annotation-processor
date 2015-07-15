import sbt._
import sbt.Keys._

object StrutsAnnotationProcessorBuild extends Build {

  override lazy val settings = super.settings ++ Seq(
    name := "StrutsAnnotationProcessor",
    organization := "com.mate1",
    version := "1.0.0",
    fork in run := true,
    sourcesInBase := false
  )

  lazy val project = Project(

    id = "struts-annotation-processor",
    base = file("."),

    settings = Project.defaultSettings ++ Seq(
      libraryDependencies ++= Seq(
         "org.freemarker"    %  "freemarker"   % "2.3.16",
         "org.apache.struts" %  "struts2-core" % "2.2.1"  
      )

    )
  )
}
