package com.mkarw;
//= Using iterators to visit tree nodes in certain orders =
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyNode;
import org.forester.phylogeny.iterators.PhylogenyNodeIterator;

public class VisitTreeNodes {

    public static void Visit() {
        // Creating a new rooted tree with four external nodes.
        final Phylogeny phy = new Phylogeny();
        final PhylogenyNode root = new PhylogenyNode();
        final PhylogenyNode d1 = new PhylogenyNode();
        final PhylogenyNode d2 = new PhylogenyNode();
        final PhylogenyNode d11 = new PhylogenyNode();
        final PhylogenyNode d12 = new PhylogenyNode();
        root.setName( "root" );
        d1.setName( "1" );
        d2.setName( "2" );
        d11.setName( "1-1" );
        d12.setName( "1-2" );
        root.addAsChild( d1 );
        root.addAsChild( d2 );
        d2.addAsChild( d11 );
        d2.addAsChild( d12 );
        phy.setRoot( root );
        phy.setRooted( true );
        // Using a variety of iterators to visit the nodes of the newly created tree.
        System.out.println( "post-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorPostorder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "pre-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorPreorder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "level-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorLevelOrder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "external nodes only:" );
        for( final PhylogenyNodeIterator it = phy.iteratorExternalForward(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
    }
}
