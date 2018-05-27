#!/bin/sh

GRADLE=`which gradle`

cd /vagrant/greeklang/morphology

$GRADLE -Pdatadir=/vagrant/hmt-lexicon/ -Pdataset=hmt clean && $GRADLE -Pdatadir=/vagrant/hmt-lexicon -Pdataset=hmt buildStems  && $GRADLE -Pdatadir=/vagrant/hmt-lexicon -Pdataset=hmt fst

cd /vagrant/hmt-lexicon

