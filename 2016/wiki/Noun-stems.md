Noun stems should be kept in `.csv` files in the `stems/nouns` directory of this repository.

There are seven columns in the `.csv` file for a noun stem.  The first six are mandatory:  the seventh may be empty (but note that for the syntax to parse, there must still be seven columns).

The first line of a noun stem file should be:

    StemUrn,LexicalEntity,Stem,Gender,InflClass,Accent,Tags

An example of a valid row in a noun stem table is:

    lsjpool.n47039_0,lexent.n47039,ni_k,fem,h_hs,stemultacc,

which could be read as "The abbreviated URN `lsjpool.n47039_0` says that for the lexical entity `lexent.n47039` there is a stem `ni_k` in the noun class `h_hs` with persistent accent on the last syllable of the stem".  (Note that in the stem string, the iota is explicitly marked as long by nature, since that will affect correct placement of accent.)  This stem will be matched with all rules applying to the noun class `h_hs`, so if you have an inflectional identifying `h` as the ending for feminine, nominative, singular, then δίκη will be correctly analyzed as that form.



Valid values for each column are as follows.

1. [stem URN](Noun-stem-URNs)
1. [lexical entity URN](Lexical-entity-URNs)
1. [stem string](Stem-strings)
1. [values for gender](Gender-values)
1. [inflectional class](Noun-class)
1. [persistent accent](Persistent-accent)
1. [other tags](Optional-tags)

