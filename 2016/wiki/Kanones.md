## Overview

1. Put data for stems and inflectional rules in the appropriate directory
1. Compile a parser for that data set.
1. Run the parser and test it.

Within your VM, Kanōnes is located at `/vagrant/greeklang/morphology`, so before doing anything else, open a terminal and

    cd /vagrant/greeklang/morphology


    

### 1. Add data 

Within the `data` directory of the Kanōnes repository, you can add data for one or more orthographic systems.  For HMT, we're using the standard modern system identified simply as "greek", so we'll be adding data to `data/greek`.  Within `/vagrant/greeklang/morphology/data/greek`, Kanōnes expects files to be organized in directories as [summarized here](https://github.com/homermultitext/hmt-lexicon/wiki/File-system-organization).

Files with morphological stems go in the appropriate subdirectory of `data/greek/stems-csv`;  files with inflectional rules go in the sudirectory of `data/greek/rules-csv`.

The `hmt-lexicon` repository includes a shell script  `loadData.sh` that you can use within the HMT VM to copy the `hmt-lexicon` into the Kanōnes repository.  From the `hmt-lexicon` directory, just run

    sh loadData.sh

or from anywhere in the VM, run

    sh /vagrant/hmt-lexicon/loadData.sh

### 2. Compile the parser

From the `/vagrant/greeklang/morphology` directory, run

    gradle clean
    gradle buildStems   
    gradle fst

Alternatively, you can run these sequentially in a single line like this:

    gradle clean && gradle buildStems && gradle fst


This compiles a *finite state transducer* (or, FST), in `build/greek/greek.a`.

### 3. Test it

`fst-mor` is a utility that runs a morphological FST, and lets you interactively supply forms to analyze.  Run

    fst-mor build/greek/greek.a

and enter unaccented forms to test out the FST.

We need to define a regular method for testing fully accented forms.

