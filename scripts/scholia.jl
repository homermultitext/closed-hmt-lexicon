using HmtArchive.Analysis
using Orthography, PolytonicGreek
using CitableText, CitableCorpus

using StatsBase, OrderedCollections

c = hmt_normalized()
lg = literaryGreek()
scholia = filter(psg -> startswith(workcomponent(psg.urn), "tlg5026"), c.passages)

tcorpus = tokenizedcorpus(CitableTextCorpus(scholia), lg)

d = map(psg -> psg.text, tcorpus.passages) |> countmap |> OrderedDict

sort!(d; byvalue = true, rev = true)
#	sort!(OrderedDict(countmap(flatlabels)); byvalue=true, rev=true)