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