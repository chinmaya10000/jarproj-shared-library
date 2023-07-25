#!/usr/bin/env groovy

def call(String imageName) {
    echo 'building the docker image..'
    sh "docker build -t $imageName ."
}