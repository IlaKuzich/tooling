#!/usr/bin/env bash

# compile scala specification
scalac -cp scalatest-app_2.13-3.2.7.jar ExampleSpec.scala

# define classpath to run spec
# here in repo I provided scalatest-app_2.13-3.2.7.jar and(:) scala-xml_2.13-1.2.0.jar this should be changed
# and defined in env variables
export CLASSPATH=scalatest-app_2.13-3.2.7.jar:scala-xml_2.13-1.2.0.jar

# run spec
scala -cp $CLASSPATH org.scalatest.run ExampleSpec
