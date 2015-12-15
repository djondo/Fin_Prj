package com.rudolf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

/**
 * Created by rudi on 12/12/2015.
 */


class AlbumInfoGUI extends JFrame implements WindowListener {
        private JPanel rootPanel;
        private JTable albumTable;
        private JButton deleteButton;
        private JButton quitButton;
        private JTextField AlbumIDTextField;
        private JTextField TitleTextField;
        private JTextField ArtistTextField;
        private JTextField PriceTextField;
        private JTextField ConsignorTextField;
        private JTextField ConsignedDateTextField;
        private JButton addAlbumButton;

        protected AlbumInfoGUI(AlbumModel abm) {
            setContentPane(rootPanel);
            pack();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addWindowListener(this);
            setVisible(true);

            setSize(300, 150);

            //Create a data model and tell our table to use it
            // AlbumDataModel albumModel = new AlbumDataModel();
            albumTable.setModel(abm);
            //Grid color default is white, change it so we can see it
            albumTable.setGridColor(Color.BLACK);
            //Also make the columns wider
            albumTable.getColumnModel().getColumn(0).setWidth(300);
            //Quit application when user closes window, otherwise app keeps running
            //Sometimes this is what you want, sometimes it isn't.
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Close button code.
            quitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //Call Main's shutdown method - one class is the entry and exit point of the program
                   // Main.shutdown();
                }
            });

            addAlbumButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //Call Main's shutdown method - one class is the entry and exit point of the program
                    String albumID = AlbumIDTextField.getText();
                    String title = TitleTextField.getText();
                    String artist = ArtistTextField.getText();
                    String price = PriceTextField.getText();
                    double p = Double.parseDouble(price);
                    String consignedDate = ConsignedDateTextField.getText();
                    Album newAlbum = new Album(artist, title, p, 1, new Date());
                    dbConnection.addNewAlbum(newAlbum);

                }
                });

                    deleteButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                          //  int currentRow = Album.getSelectedRow()

                }

            });

            quitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
                });
            }

    public AlbumInfoGUI(JTextField TitleTextField, JTextField AlbumIDTextField, JTextField ArtistTextField,
                        JTextField PriceTextField, JTextField ConsignorTextField,JTextField consignedDateTextField ) {
        this.TitleTextField = TitleTextField;
        this.AlbumIDTextField = AlbumIDTextField;
        this.ArtistTextField = ArtistTextField;
        this.PriceTextField = PriceTextField;
        this.ConsignorTextField = ConsignorTextField;
        this.ConsignedDateTextField = consignedDateTextField;
    }


    //Method provided by WindowListener interface
        //Called when user clicks button to close application
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closing");
            //Main.shutdown();
        }

        //A WindowListener is required to provide these methods
        //We can choose what they do - in this case, nothing
        public void windowClosed(WindowEvent e) {}
        public void windowOpened(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}

    }




