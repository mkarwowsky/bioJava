package com.mkarw;

import org.biojava.nbio.phylo.Comparison;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.*;
import java.lang.Exception;

public class GUI extends JFrame{
    private JComboBox comboBox;
    private JButton chooseFileButton;
    private JButton okButton;
    private JTextArea textArea;
    private JLabel label;
    public String newick;

    public GUI() {
        super( "Not Hello World" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        chooseFileButton.setBounds(25,100,100,30);
        add(chooseFileButton);

        comboBox.setBounds(150, 100, 100, 30);
        add(comboBox);
        comboBox.addItem("2DPhyloTree");
        comboBox.addItem("2DPhyloColorTree");
        comboBox.addItem("Comparsion");
        comboBox.addItem("DistanceTree");
        comboBox.addItem("ReadWritePhylo");
        comboBox.addItem("ReadPhyloToArch");
        comboBox.addItem("CreatePhyloToArch");
        comboBox.addItem("VisitTreeNodes");
        comboBox.addItem("CreateBasicGeneTree");


        //okButton.setBounds(275, 100, 100, 30);
        //add(okButton);

        label = new JLabel("");
        label.setBounds(25, 25,400,400);
        label.setSize(400, 400);
        add(label);
        add(textArea);
        setVisible(true);

        chooseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String line = null;
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(chooseFileButton);
                String path = textArea.getText() + "\n" + fc.getSelectedFile().toString();
                try {
                    // FileReader reads text files in the default encoding.
                    FileReader fileReader =
                            new FileReader(fc.getSelectedFile().toString());

                    // Always wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader =
                            new BufferedReader(fileReader);

                    while((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                        newick = line;
                    }

                    // Always close files.
                    bufferedReader.close();
                }
                catch(FileNotFoundException ex) {
                    System.out.println(
                            "Unable to open file '" +
                                    path + "'");
                }
                catch(IOException ex) {
                    System.out.println(
                            "Error reading file '"
                                    + fc.getSelectedFile().toString() + "'");
                    // Or we could just do this:
                    // ex.printStackTrace();
                }

                //textArea.setText(fc.getSelectedFile().toString());

            }

        });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedItem() == "2DPhyloTree")
                {
                    try {
                        System.out.println("2DPhyloTree");
                        phylo2graphics.phylo2graphics();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "2DPhyloColorTree")
                {
                    try {
                        System.out.println("2DPhyloColorTree");
                        phylo2coloredgraphics.phylo2coloredgraphics();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "Comparsion")
                {
                    try {
                        System.out.println("Comparsion");
                        Comparsion.Comparsion();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "DistanceTree")
                {
                    try {
                        System.out.println("DistanceTree");
                        DistanceTree.DistanceTree();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "ReadWritePhylo")
                {
                    try {
                        System.out.println("ReadWritePhylo");
                        ReadWritePhylo.read();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "ReadPhyloToArch")
                {
                    try {
                        System.out.println("ReadPhyloToArch");
                        ReadPhyloToArch.ToArch();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "CreatePhyloToArch")
                {
                    try {
                        System.out.println("CreatePhyloToArch");
                        CreatePhyloToArch.CreatePhylo();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "VisitTreeNodes")
                {
                    try {
                        System.out.println("VisitTreeNodes");
                        VisitTreeNodes.Visit();
                    }
                    catch(Exception l){

                    }
                }
                if(comboBox.getSelectedItem() == "CreateBasicGeneTree")
                {
                    try {
                        System.out.println("CreateBasicGeneTree");
                        CreateBasicGeneTree.Create();
                    }
                    catch(Exception l){

                    }
                }
                //JOptionPane.showMessageDialog((Component) comboBox.getSelectedItem(),this);

            }
        });

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                //label.setText(text);
                //label.setText("dsadasdas");
            }
        });


    }
}
