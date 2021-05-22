# Overview

In the `hmt-lexicon` repository, we're maintaining morphological data sets that can be used by the Kanōnes parsing system to analyze the morphology of all tokens in HMT project editions.  Any HMT editors can post issues in this repository's issue tracker when the system fails to parse a form they believe to be valid.  The team managing the HMT lexicon repository is responsible for addressing those issues.

Kanōnes works with two distinct kinds of data: **morphological stems**, and **inflectional patterns** ("endings").  Both sets of data can be kept in simple `.csv` files.

The Kanōnes parsing system supports multiple orthographic systems for encoding Greek.  Please note that in this repository, the HMT project is using the  conventional orthography of printed literary Greek, encoded in an ASCII-only representation, [as documented here](http://neelsmith.github.io/greeklang/basics/specs/orthography/AsciiXlit.html).  This is a rigorously defined, unambiguous encoding: code libraries can easily enforce the policy that Greek strings must use only the characters of this system.



## Citable data

When Kanōnes analyzes a Greek string, it expresses the result with two URNs:

- the grammatical form. Each possible form is identified by a URN in the predefined collection `urn:cite:morph:form`  (e.g., "masculine, nominative, singular" is `urn:cite:morph:form.no000`)
- the lexical entity (the "dictionary word")

In addition, Kanōnes includes two further URNs that explain the logic of the analysis:

- the morphological stem  
- the inflectional pattern or rule ("ending")

The URNs for lexical entities, morphological stems, and inflectional patterns are not predefined:  they are drawn from the morphological stem and inflectional pattern `.csv` files managed in this repository.  (Note that the morphological stem records will include a unique URN for each stem, plus a URN for the lexical entity the stem belongs to.)

Kanōnes supports an abbreviated form of URN reference using only the `collection.object` (right most components) of the URN.  To make this possible, you must add an entry for each collection you cite in a registry giving the full CITE URN for the collection.

## Morphological Stems

Morphological stems are organized in categories roughly corresponding to traditional designation of part of speech.  More precisely, each category is defined by a unique set of properties (the columns in a `.csv` file).  "Adjectives", for example, must include an indication of what syllable the accent persists on, while verb stems do not, while "Nouns", in addition to persistent accent,  must include a gender.

How to edit `.csv` files for:

-  [noun stems](Noun-stems)
- adjective stems
- verb stems
- indeclinable forms

## Inflectional patterns

The format of`.csv` files for infectional patterns is determined by the form of analysis that applies to that ending.  Inflectional patterns for "noun" are analyzed by the pattern `gender-case-number`, for example, while "adjectives" are analyzed by the pattern `gender-case-number-degree`.


How to edit `.csv` files for:

- [noun inflection](Noun-inflection) (`gender-case-number` analysis)
- adjective inflection  (`gender-case-number-degree` analysis)
- adverb inflection (`degree` analysis)
- indeclinable forms (`indeclinable` analysis)
- verbal inflection:
    - conjugated verb forms (`person-number-tense-mood-voice` analysis)
    - infinitive verb forms  (`tense-voice` analysis)
    - participial verb forms  (`gender-case-number-tense-voice` analysis)
    - verbal adjective forms (`gender-case-number` analysis)
