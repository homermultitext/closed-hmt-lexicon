#!/bin/sh

GRADLE=`which gradle`

cd /vagrant/greeklang/morphology
$GRADLE -Pdatasrc=/vagrant/hmt-lexicon loadData
