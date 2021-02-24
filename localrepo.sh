#!/bin/sh
# move jar to local repo for testing purpose
export version=5.0.2
lein jar
lein pom
lein localrepo install target/re-echarts-$version.jar re-echarts $version
mkdir -p ~/.m2/repository/re-echarts/re-echarts/$version/
mv pom.xml ~/.m2/repository/re-echarts/re-echarts/$version/re-echarts-$version.pom
