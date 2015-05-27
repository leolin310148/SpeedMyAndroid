#!/usr/bin/env bash
./gradlew SpeedView:clean
./gradlew SpeedView:install
./gradlew SpeedView:bintrayUpload
