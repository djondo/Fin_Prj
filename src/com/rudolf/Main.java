package com.rudolf;

public class Main {
    public static void main(String args[]) {
      //  AlbumInfoGUI albmG = new AlbumInfoGUI();
       // AlbumModel abm = new AlbumModel();
       // dbConnection db = new dbConnection();
    }
}

////(If eeded) create database and add sample data
//                setup();
//                try {
////Query the database to fetch all of the data
//                    String getAllData = "SELECT * FROM Album";
//                    rs = statement.executeQuery(getAllData);
//                    AlbumModel albumModel = new AlbumModel(rs);
////Create and show the GUI
//                    AlbumInfoGUI tableGUI = new AlbumInfoGUI(albumModel);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    shutdown();
//                }
//            }
//            public static void setup() {
//                try {
//                    try {
//                        String Driver = "com.mysql.jdbc.Driver";
//                        Class.forName(Driver);
//                    } catch (ClassNotFoundException cnfe) {
//                        System.out.println("No database drivers found. Quitting");
//                        System.exit(-1);
//                    }
////    static final String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/test";
//                    conn = DriverManager.getConnection(DB_CONNECTION_URL + DB_NAME, USER, PASS);
////The first argument allows us to move both forward and backwards through the RowSet.
////The TableModel will need to do this.
////by default, you can only move forward - it's what most apps do and it's less
////resource-intensive than being able to go in both directions.
////If you set one argument, you need the other. The second one means you will
////not be modifying the data in the RowSet (we'll change this later though)
//                    // Create the Album table
//                    String createAlbum = "CREATE TABLE IF NOT EXISTS Album (AlbumID PRIMARY KEY AUTO_INCREMENT int, title varchar(60),
//                    Artist varchar(50), price double, ConsignorID FOREIGN KEY int, consignedDate Date);
//                    statement.execute(createAlbum);
//
//                    System.out.println("Please enter the Album ID:");
//                    AlbumID = s.nextInt();
//                    System.out.println("Enter the Album title:");
//                    title = s.next();
//                    System.out.println("Enter the artist:");
//                    Artist = s.next();
//                    System.out.println("Enter the price:");
//                    price = s.nextDouble();
//                    System.out.println("Enter the consignor ID:");
//                    ConsignorID = s.nextInt();
//                    System.out.println("Enter the consigned date");
//                    LinkedList <Album> alb = new LinkedList<>();
//                    ArrayList Album = new Album(AlbumID, title, Artist, price,ConsignorID, consignedDate);
//                    alb.add(Album);
//                    for(Album a: alb){
//                        System.out.println(a);
//                        String albumData = "INSERT INTO Album VALUES (AlbumID PRIMARY KEY AUTO_INCREMENT int, title varchar(60),
//                        Artist varchar(50), price double, ConsignorID FOREIGN KEY int, consignedDate Date);
//                        statement.execute(albumData);
//                        String album = SELECT* FROM Album;
//
//                    } catch (SQLException sqle) {
//                        System.out.println("The Snakes table (probably) already exists, verify with following error message.");
//                        System.out.println(sqle);
//                    }
//                }
//            public static void shutdown() {
//                //A finally block runs whether an exception is thrown or not. Close resources and tidy up whether this code worked or not.
//                try {
//                    if (statement != null) {
//                        statement.close();
//                        System.out.println("Statement closed");
//                    }
//                } catch (SQLException se) {
//                    //Closing the connection could throw an exception too
//                    se.printStackTrace();
//                }
//                try {
//                    if (conn != null) {
//                        conn.close();  //Close connection to database
//                        System.out.println("Database connection closed");
//                    }
//                } catch (SQLException se) {
//                    se.printStackTrace();
//                }
//                System.exit(0);
//            }
//        }



