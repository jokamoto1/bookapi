package com.jeremy.mvc.services;

// ...
import org.springframework.stereotype.Service;
import java.util.*;
import com.jeremy.mvc.models.Book;
import com.jeremy.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
	private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    public void deleteBook(Long id) {
    	 bookRepository.deleteById(id);
    }
    public Book updateBook(Long id, String title, String desc,String lang,Integer numOfPages) {
    	Book oldBook =  findBook(id);
    	oldBook.setTitle(title);
    	oldBook.setDescription(desc);
    	oldBook.setLanguage(lang);
    	oldBook.setNumberOfPages(numOfPages);
    	return bookRepository.save(oldBook);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
