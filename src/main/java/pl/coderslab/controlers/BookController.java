package pl.coderslab.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.classes.Book;
import pl.coderslab.classes.MockBookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MockBookService mockBookService = new MockBookService();

//    @Autowired
//    public BookController(MockBookService mockBookService){
//        this.mockBookService = mockBookService;
//    }
    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1, "978832463", "Thinking in Java",
                "Bruce Eckel", "HelioLn", "programming");
    }
    @GetMapping
    public List<Book> getBooks(){
        return mockBookService.getBooks();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return mockBookService.get(id);
    }

}
