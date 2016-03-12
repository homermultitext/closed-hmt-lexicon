#!/bin/sh

GRADLE=`which gradle`

cd /vagrant/greeklang/morphology

$GRADLE -Ploaddir=/vagrant/hmt-lexicon/ -Pdataset=hmt clean && $GRADLE -Ploaddir=/vagrant/hmt-lexicon -Pdataset=hmt buildStems  && $GRADLE -Ploaddir=/vagrant/hmt-lexicon -Pdataset=hmt fst

cd /vagrant/hmt-lexicon

