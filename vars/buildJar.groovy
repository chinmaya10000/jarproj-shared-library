#!/usr/bin/env groovy

def call() {
    echo "building the application..E"
    sh 'mvn package'
}