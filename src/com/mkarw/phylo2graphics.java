package com.mkarw;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.forester.archaeopteryx.AptxUtil;
import org.forester.archaeopteryx.AptxUtil.GraphicsExportType;
import org.forester.archaeopteryx.Configuration;
import org.forester.archaeopteryx.Options;
import org.forester.archaeopteryx.TreeColorSet;

public class phylo2graphics {

    public static void phylo2graphics() {
        try {
            final Configuration config = new Configuration();
            // Could also read a configuration file with:
            // Configuration config = new Configuration("my_configuration_file.txt", false, false, false);
            config.putDisplayColors( TreeColorSet.BACKGROUND, new Color( 255, 255, 255 ) );
            config.putDisplayColors( TreeColorSet.BRANCH, new Color( 0, 0, 0 ) );
            config.putDisplayColors( TreeColorSet.TAXONOMY, new Color( 0, 0, 0 ) );
            config.setPhylogenyGraphicsType( Options.PHYLOGENY_GRAPHICS_TYPE.RECTANGULAR );
            AptxUtil.writePhylogenyToGraphicsFile( new File("tol_143.xml"),
                    new File( "tol_143.xml.png" ),
                    1000,
                    1000,
                    GraphicsExportType.PNG,
                    config );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
    }
}