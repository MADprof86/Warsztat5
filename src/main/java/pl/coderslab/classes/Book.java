package pl.coderslab.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;
}
