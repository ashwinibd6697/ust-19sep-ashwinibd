package com.ustglobal.exeption.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {
   void open() throws IOException, ClassNotFoundException,SQLException {
	   File f = new File("b.txt");
	   System.out.println("ffghjhgfdsa");
	   
	   
        f.createNewFile();
       Class.forName("com.a");
   }
}
