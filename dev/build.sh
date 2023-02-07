#!/bin/bash
#
cd $(git rev-parse --show-toplevel)


mvn clean compile assembly:single antrun:run
$TOMCAT_HOME/bin/catalina.sh stop
$TOMCAT_HOME/bin/catalina.sh start
