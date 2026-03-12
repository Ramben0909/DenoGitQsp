package SWE;

import java.util.HashMap;

public class Library {
    private Librarian mylib = new Librarian();
    private HashMap<Book,Integer> col = new HashMap<>();
    public Book borrow(String name) {
    	for(Book b:col.keySet()) {
    		if(b.getTitle().equals(name)) {
    			int count = col.get(b);
    			count--;
    			if(count==0) {
    				col.remove(b);
    			}else {
    				col.put(b, count);
    			}
    			return b;
    		}
    	}
    	System.out.println("Book not found");
    	return null;
    }
    public Librarian getMylib() {
		return mylib;
	}
	public void setMylib(Librarian mylib) {
		this.mylib = mylib;
	}
	public void returnbook(Book name) {
    	int count = col.getOrDefault(name, 0);
    	count++;
    	col.put(name,count);
    }
    public void read(String name) {
    	for(Book b:col.keySet()) {
    		if(b.getTitle().equals(name)) {
    			System.out.println("Reading book "+name);
    			return;
    		}
    	}
    	System.out.println("Book not found");
    }
    
}
