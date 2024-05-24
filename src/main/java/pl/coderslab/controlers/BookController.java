package pl.coderslab.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.classes.Book;
import pl.coderslab.classes.MockBookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MockBookService mockBookService = new MockBookService();


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
    @PostMapping
    public void createBook(@RequestBody Book book){
        mockBookService.add(book);
    }
    @PutMapping
    public void updateBook(@RequestBody Book book){
        mockBookService.add(book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        mockBookService.delete(id);
    }


}
