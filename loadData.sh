#!/bin/sh


if [ -d /vagrant/greeklang/morphology/data/greek ]; then
    rm -rf /vagrant/greeklang/morphology/data/greek
fi
cp -R /vagrant/hmt-lexicon/greek /vagrant/greeklang/morphology/data/greek
