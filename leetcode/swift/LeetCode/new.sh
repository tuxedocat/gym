#!/bin/bash

probname=$1
echo $probname | grep -E "p\d+_" > /dev/null
[[ ! $? -eq 0 ]] && exit 1

mkdir $probname
(
    cd $probname
    swift package init --name $2
)


