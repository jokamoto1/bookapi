package com.jeremy.mvc.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jeremy.mvc.controllers.BookController;
import com.jeremy.mvc.models.Book;
import com.jeremy.mvc.services.BookService;
@SpringBootApplication
@Controller
public class BookController {
	@Autowired
	BookService  bookService;
    @RequestMapping("/books/{id}")
    public String showBook(Model model, @PathVariable("id") Long id  ) {
    	Book book = bookService.findBook(id);
    	model.addAttribute("book" , book);
    	return "index.jsp";	
    }
    @RequestMapping("/books")
    public String showBoosk(Model model) {
    	List<Book> books = bookService.allBooks();
    	model.addAttribute("books" , books);
    	return "dashboard.jsp";	
    }
   
    
    


    //

}
