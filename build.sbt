name := "slick-testkit-example"

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "com.typesafe.slick" %% "slick-testkit" % "2.1.0" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "ch.qos.logback" % "logback-classic" % "0.9.28" % "test",
  "postgresql" % "postgresql" % "9.1-901.jdbc4" % "test"
)

// Disable all other test frameworks to silence the warnings in Activator
testFrameworks := Seq(new TestFramework("com.novocode.junit.JUnitFramework"))

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v", "-s", "-a")

parallelExecution in Test := false

logBuffered := false
