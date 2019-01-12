package com.mkarw;

import java.io.File;
import java.io.IOException;

import org.forester.io.parsers.PhylogenyParser;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.io.writers.PhylogenyWriter;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyMethods;
import org.forester.util.ForesterUtil;

public class ReadWritePhylo {

    public static void read() {
        // Reading-in of (a) tree(s) from a file.
        final File treefile = new File( "species_tree_rio.xml" );
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
        // Writing trees to a file.
        final File outfile = new File( "species_tree_rio_out.xml" );
        try {
            final PhylogenyWriter writer = new PhylogenyWriter();
            writer.toPhyloXML( phys, 0, outfile, ForesterUtil.LINE_SEPARATOR );
        }
        catch ( final Exception e ) {
            e.printStackTrace();
        }
    }
}