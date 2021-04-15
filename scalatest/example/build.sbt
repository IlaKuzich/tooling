name := "example"

version := "0.1"

scalaVersion := "2.13.5"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.7" % "test",
                            "org.scalactic" %% "scalactic" % "3.2.7")
