Typical work flow for editors:


# Simplified workflow for editors


## Building a parser

In the `hmt-lexicon` repository: 

1. Add vocabulary entries (morphological stems) to a new, local `.csv` file in the appropriate subdirectory of `hmt/stems-csv`.
2. Run `sh buildFst.sh`.  This loads data from `hmt-lexicon` into the parser repository, and builds the parser in `/vagrant/greeklang/morphology/build/hmt/greek.a`.


## Testing your parser

There are two options for testing the parser.

1. Still within `hmt-lexicon`, you can test fully accented Greek words.  Enter a list of words, one per line, in regular UTF-8 Greek (e.g., βουλή) in "testfile.txt" and run `gradle parseWordList1`
2. To test unaccented forms directly in the FST, in the `greeklang/morphology` repository, run `fst-mor build/hmt/greek.a`


## Commiting successful results

If you're happy with the results:

1. copy/paste new entries into a `hmt`-prefixed file  in the github repo (using a web browser)
2. delete local copy of the test data
3. `git pull` in the `hmt-lexicon` repository