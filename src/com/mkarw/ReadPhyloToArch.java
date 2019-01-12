package com.mkarw;

import java.io.File;
import java.io.IOException;

import org.forester.archaeopteryx.Archaeopteryx;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.io.parsers.PhylogenyParser;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyMethods;
//= Reading of phylogenetic trees and displaying them with Archaeopteryx =
public class ReadPhyloToArch {

    public static void ToArch() {
        // Reading-in of (a) tree(s) from a file.
        final File treefile = new File( "tol_143.xml" );
        PhylogenyParser parser = null;
        try {
            parser = ParserUtils.createParserDependingOnFileType( treefile, true );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        Phylogeny[] phys = null;
        try {
            phys = PhylogenyMethods.readPhylogenies( parser, treefile );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        // Display of the tree(s) with Archaeopteryx.
        Archaeopteryx.createApplication( phys );
    }
}