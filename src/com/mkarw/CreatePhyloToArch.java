package com.mkarw;

import org.forester.archaeopteryx.Archaeopteryx;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyNode;

public class CreatePhyloToArch {

    public static void CreatePhylo() {
        // Creating a new rooted tree with two external nodes.
        final Phylogeny phy = new Phylogeny();
        final PhylogenyNode root = new PhylogenyNode();
        final PhylogenyNode d1 = new PhylogenyNode();
        final PhylogenyNode d2 = new PhylogenyNode();
        root.setName( "root" );
        d1.setName( "descendant 1" );
        d2.setName( "descendant 2" );
        root.addAsChild( d1 );
        root.addAsChild( d2 );
        phy.setRoot( root );
        phy.setRooted( true );
        // Displaying the newly created tree with Archaeopteryx.
        Archaeopteryx.createApplication( phy );
    }
}
