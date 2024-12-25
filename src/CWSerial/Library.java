package CWSerial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Library implements Serializable {
        String title;
        String author;
        String id;
        Boolean available;
        public Library(String Bookid, String Booktitle, String Bookauthor, boolean Bookavailable) {
            this.id = Bookid;
            this.author=Bookauthor;
            this.title=Booktitle;
            this.available=Bookavailable;
        }
        public void Takebook(){
            if(!available){
                System.out.println("Book is not available");
            }else{
                System.out.println("Successfully taken book");
                available=false;
            }
        }
}
