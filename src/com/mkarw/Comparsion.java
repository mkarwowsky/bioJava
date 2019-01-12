package com.mkarw;
/**
 * This class provides static methods for the calculation of the percentage of
 * identity between two aligned sequences.
 * <p>
 * Since 4.1.1 the methods for distance inference in forester are also used in
 * BioJava, so this implementation of percentage of identity is not needed
 * anymore. However, the code is maintained as the own BioJava implementation.
 *
 * @author Scooter Willis
 *
 */
import org.biojava.nbio.phylo.Comparison;

public class Comparsion {

    static String sequenceNean = "TGGTCCTGCAGTCCTCTCCTGGCGCCCCGGGCGCGAGCGGTTGTCC";
    static String sequenceman = "TGGTCCTGCTGTCCTCTCCTGGCGCCCTGGGCGCGAGCGGATGTCC";

    public static void Comparsion() {
        System.out.println(Comparison.isGap('-'));
        System.out.println(Comparison.PID(sequenceNean, sequenceman));
        System.out.println(Comparison.PID(sequenceNean, sequenceman,0,11));
    }
}
