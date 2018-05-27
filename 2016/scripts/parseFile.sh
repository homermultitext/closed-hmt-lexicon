#!/bin/sh

GROOVY=`which groovy`

echo "Running $GROOVY -cp /vagrant/greeklang/morphology/build/lib/morphology-0.2.0.jar "

exec $GROOVY -cp /vagrant/greeklang/morphology/build/lib/morphology-0.2.0.jar /vagrant/hmt-lexicon/scripts/parseFile.groovy $1
