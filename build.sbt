ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "cipher_lib",
    libraryDependencies ++= Seq(
      "io.flow" %% "lib-feature-play28" % "0.2.55",
      "io.flow" %% "lib-reference-scala" % "0.3.13",
      "io.flow" %% "lib-test-utils-play28" % "0.1.91" % Test,
      "com.github.sps.junidecode" % "junidecode" % "0.3",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test,
    ),
    dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
    resolvers += "Artifactory" at "https://flow.jfrog.io/flow/libs-release/",
    credentials += Credentials(
      "Artifactory Realm",
      "flow.jfrog.io",
      System.getenv("ARTIFACTORY_USERNAME"),
      System.getenv("ARTIFACTORY_PASSWORD")
    )
  )

