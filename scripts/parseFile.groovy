// Both transcoder and greekutils available from beta.hpcc.uh.edu:
@GrabResolver(name='beta', root='http://beta.hpcc.uh.edu/nexus/content/repositories/releases')
@Grab(group='edu.harvard.chs', module='cite', version="1.3.0")
@Grab(group='edu.holycross.shot', module='morphology', version="0.2.0")
@Grab(group='edu.holycross.shot', module='common', version="2.3.1")

import edu.harvard.chs.cite.CiteUrn
import edu.holycross.shot.greekmorph.UrnManager


if (args.size() != 1) {
  System.err.println "Usage: groovy parseFile.groovy <FILENAME>"
  System.exit(-1)
}

// File with UTF-8 strings to parse, one per line.
File f = new File(args[0])
println "Parse file " + f


File urnRegistry = new File("/vagrant/greeklang/morphology/data/greek/urnregistry/collectionregistry.csv")
UrnManager umgr = new UrnManager(urnRegistry)
println "Made urn manager"



CiteUrn urn = new CiteUrn("urn:cite:hmt:msA.12r")

println "resolved!"
