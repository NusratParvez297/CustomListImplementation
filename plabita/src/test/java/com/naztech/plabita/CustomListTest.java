package com.naztech.plabita;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;





public class CustomListTest {

	@Test
	public void testAdd() {
		BookCustList<Book> list = new BookCustList<Book>();
		list.add(new Book("Nusrat","Nusrat",1));
		assertEquals(1,list.size());
	}

	@Test
	public void testGet() {
		BookCustList<Book> list = new BookCustList<Book>();
		list.add(new Book("Nusrat","Nusrat",1));
		list.add(new Book("java","java",1));
		Book b1 = new Book("java","java",1);
		list.get(1);
		assertEquals(b1,list.get(1));
	}

	@Test
	public void testClear() {
		BookCustList<Book> list = new BookCustList<Book>();
		list.add(new Book("Nusrat","Nusrat",1));
		list.add(new Book("java","java",1));
		
		list.clear();
		assertEquals("Expected size to be 0", 0, list.size());
	}

	@Test
	public void testRemove() {
		BookCustList<Book> list = new BookCustList<Book>();
		list.add(new Book("Nusrat","Nusrat",1));
		list.add(new Book("java","java",1));
		Book b = new Book("java", "java", 300);
		list.remove(1);
		assertEquals(1, list.size());
		
		
	}

	@Test
	public void testAddAll() {
		BookCustList<Book> list = new BookCustList<Book>();
		list.add(new Book("feluda", "Satyajit Roy", 300));
	    list.add(new Book("Misir Ali", "Humayun Ahmed", 300));
	    BookCustList<Book> list2 = new BookCustList<Book>();
	    list2.add(new Book("Sherlock Holmes", "Sir Conan Doyale ", 300));
	    list2.add(new Book("Byomkesh Bakshi", "Sharadhindho chaterjiee", 300));
	    list.addAll( list2);
	    
	    assertEquals(4, list.size());
	}
   
}
 


 