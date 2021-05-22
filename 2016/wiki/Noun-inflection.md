Inflectional patterns for nouns should be kept in .csv files in the inflection/nouns directory of this repository.

There are four columns in the `.csv` file for noun inflection.

The first line of a noun stem file should be:

    RuleUrn,InflectionClass,Ending,Gender,Case

An example of a valid row in a noun inflection table is:

    nouninfl.h_hs1,<h_hs>,h,fem,nom,sg

which could be read as "The abbreviated URN `nouninfl.h_hs1` says that in the `<h_hs>` noun class, the ending `-h` is analyzed as feminine, nominative, singular".  This rule will be applied to any feminine noun in the `<h_hs>` class when its stem is modified with `h`, so if you had stem entries for feminine nouns φυγή and ζώνη in the `<h_hs>` class, they would be correctly analyzed as feminine, nominative, singular.

Valid values for each column are as follows:

- [rule URN](Noun-inflection-URNs)
- [noun inflection class](Noun-class)
- [ending](Inflection-strings)
- [gender](Gender-values)
- [case](Case-values)
- [number](Number-values)

