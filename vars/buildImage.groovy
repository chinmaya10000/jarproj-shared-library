#!/usr/bin/env groovy

def call() {
    echo 'building the docker image..'
    sh 'docker build -t chinmayapradhan/java-maven-app:2.0 .'
}