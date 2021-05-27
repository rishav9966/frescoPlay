package Solution.FrescoHashMap;

import java.util.*;

class Library
{
    
    String bookName;
    String author;
    Library()
    {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bookName);
        hash = 83 * hash + Objects.hashCode(this.author);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
    
    
    Library(String bookName,String author)
    {
        this.bookName=bookName;
        this.author=author;
    }
    public HashMap<Integer,Library> createLibraryMap(String booksInLibrary)
    {
        HashMap<Integer,Library> res = new HashMap<Integer,Library>();
        String[] data = booksInLibrary.split("\\|");
        for (String s:data){
          String[] bookData = s.split(",");
          int bookId = Integer.parseInt(bookData[0]);
          Library book = new Library(bookData[1], bookData[2]);
          res.put(bookId, book);
        }
        
        return res;
    }
    public HashMap<Integer,Integer> createUserMap(String borrowedUsers)
    {
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        String[] data = borrowedUsers.split("\\|");
        for (String s:data){
          String[] bookData = s.split(",");
          int bookId = Integer.parseInt(bookData[0]);
          int userId = Integer.parseInt(bookData[1]);
          res.put(bookId, userId);
        }
        
        return res;
    }

    
    public String getQuery(String booksInLibrary,String borrowedUsers,String query)
    {
        HashMap<Integer,Library> libraryData = new HashMap<Integer,Library>();
        HashMap<Integer,Integer> bookBorrowed = new HashMap<Integer,Integer>();
        libraryData = createLibraryMap(booksInLibrary);
        bookBorrowed = createUserMap(borrowedUsers);
        String res="";
        String[] queryData = query.split(",");
        int userId = 0;
        if(queryData[0].equals("1")){
          boolean isBorrowed = false;
          for(Map.Entry m:bookBorrowed.entrySet()){
            if((Integer) m.getKey() == Integer.parseInt(queryData[1])){
              isBorrowed = true;
              userId = (Integer) m.getValue();
              break;
            }
          }
          if(isBorrowed){
            res="No Stock\nIt is owned by "+userId+"\n";
          }else{
            Library temp = libraryData.get(Integer.parseInt(queryData[1]));
            String author = temp.author;
            res="It is available\nAuthor is "+author+"\n";
          }
        }else if(queryData[0].equals("2")){
          String bookName ="";
          for(Map.Entry m:bookBorrowed.entrySet()){
            if((Integer) m.getValue() == Integer.parseInt(queryData[1])){
              Library tempBook = libraryData.get(m.getKey());
              bookName = tempBook.bookName;
              res += m.getKey()+" "+bookName+"\n";
            }
          }
        }else if(queryData[0].equals("3")){
        	String bName = queryData[1];
        	int totalCount=0;
        	int borrowedCount = 0;
        	ArrayList<Integer> allBooks = new ArrayList<Integer>();
        	for(Map.Entry m:libraryData.entrySet()) {
        		Library temp = (Library) m.getValue();
        		if((temp.bookName).equals(bName)) {
        			allBooks.add((Integer) m.getKey());
        			totalCount++;
        		}
        	}
        	for(Map.Entry m:bookBorrowed.entrySet()) {
        		if(allBooks.contains((Integer) m.getKey())) {
        			borrowedCount++;
        		}
        	}
        	res=borrowedCount+" out\n"+(totalCount-borrowedCount)+" in\n";
        }else if(queryData[0].equals("4")){
        	for(Map.Entry m:libraryData.entrySet()) {
        		Library temp = (Library) m.getValue();
        		if((temp.author).equals(queryData[1])) {
        			res+=temp.bookName+"\n";
        		}
        	}
        }
        else if(queryData[0].equals("5")){
        	for(Map.Entry m:libraryData.entrySet()) {
        		Library temp = (Library) m.getValue();
        		if((temp.bookName).toLowerCase().contains(queryData[1].toLowerCase())) {
        			res+=m.getKey()+" "+temp.bookName+"\n";
        		}
        	}
        }
        return res;
    }
    
}

