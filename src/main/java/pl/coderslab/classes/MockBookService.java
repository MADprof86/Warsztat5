package pl.coderslab.classes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class MockBookService implements BookService{

    private final List<Book> books = new ArrayList<>();
    public MockBookService(){

        books.add(new Book(1, "100000001", "Title1", "Author1", "Publisher1", "Type1"));
        books.add(new Book(3, "100000003", "Title3", "Author3", "Publisher3", "Type3"));
        books.add(new Book(2, "100000002", "Title2", "Author2", "Publisher2", "Type2"));
        books.add(new Book(6, "100000006", "Title6", "Author6", "Publisher6", "Type6"));
        books.add(new Book(4, "100000004", "Title4", "Author4", "Publisher4", "Type4"));
        books.add(new Book(5, "100000005", "Title5", "Author5", "Publisher5", "Type5"));
        books.add(new Book(9, "100000009", "Title9", "Author9", "Publisher9", "Type9"));
        books.add(new Book(7, "100000007", "Title7", "Author7", "Publisher7", "Type7"));
        books.add(new Book(8, "100000008", "Title8", "Author8", "Publisher8", "Type8"));
        books.add(new Book(12, "100000012", "Title12", "Author12", "Publisher12", "Type12"));
        books.add(new Book(10, "100000010", "Title10", "Author10", "Publisher10", "Type10"));
        books.add(new Book(11, "100000011", "Title11", "Author11", "Publisher11", "Type11"));
        books.add(new Book(15, "100000015", "Title15", "Author15", "Publisher15", "Type15"));
        books.add(new Book(13, "100000013", "Title13", "Author13", "Publisher13", "Type13"));
        books.add(new Book(14, "100000014", "Title14", "Author14", "Publisher14", "Type14"));
        books.add(new Book(18, "100000018", "Title18", "Author18", "Publisher18", "Type18"));
        books.add(new Book(16, "100000016", "Title16", "Author16", "Publisher16", "Type16"));
        books.add(new Book(17, "100000017", "Title17", "Author17", "Publisher17", "Type17"));
        books.add(new Book(21, "100000021", "Title21", "Author21", "Publisher21", "Type21"));
        books.add(new Book(19, "100000019", "Title19", "Author19", "Publisher19", "Type19"));
        books.add(new Book(20, "100000020", "Title20", "Author20", "Publisher20", "Type20"));
        books.add(new Book(24, "100000024", "Title24", "Author24", "Publisher24", "Type24"));
        books.add(new Book(22, "100000022", "Title22", "Author22", "Publisher22", "Type22"));
        books.add(new Book(23, "100000023", "Title23", "Author23", "Publisher23", "Type23"));
        books.add(new Book(27, "100000027", "Title27", "Author27", "Publisher27", "Type27"));
        books.add(new Book(25, "100000025", "Title25", "Author25", "Publisher25", "Type25"));
        books.add(new Book(26, "100000026", "Title26", "Author26", "Publisher26", "Type26"));
        books.add(new Book(30, "100000030", "Title30", "Author30", "Publisher30", "Type30"));
        books.add(new Book(28, "100000028", "Title28", "Author28", "Publisher28", "Type28"));
        books.add(new Book(29, "100000029", "Title29", "Author29", "Publisher29", "Type29"));
        books.add(new Book(33, "100000033", "Title33", "Author33", "Publisher33", "Type33"));
        books.add(new Book(31, "100000031", "Title31", "Author31", "Publisher31", "Type31"));
        books.add(new Book(32, "100000032", "Title32", "Author32", "Publisher32", "Type32"));
        books.add(new Book(36, "100000036", "Title36", "Author36", "Publisher36", "Type36"));
        books.add(new Book(34, "100000034", "Title34", "Author34", "Publisher34", "Type34"));
        books.add(new Book(35, "100000035", "Title35", "Author35", "Publisher35", "Type35"));
        books.add(new Book(39, "100000039", "Title39", "Author39", "Publisher39", "Type39"));
        books.add(new Book(37, "100000037", "Title37", "Author37", "Publisher37", "Type37"));
        books.add(new Book(38, "100000038", "Title38", "Author38", "Publisher38", "Type38"));
        books.add(new Book(42, "100000042", "Title42", "Author42", "Publisher42", "Type42"));
        books.add(new Book(40, "100000040", "Title40", "Author40", "Publisher40", "Type40"));
        books.add(new Book(41, "100000041", "Title41", "Author41", "Publisher41", "Type41"));
        books.add(new Book(45, "100000045", "Title45", "Author45", "Publisher45", "Type45"));
        books.add(new Book(43, "100000043", "Title43", "Author43", "Publisher43", "Type43"));
        books.add(new Book(44, "100000044", "Title44", "Author44", "Publisher44", "Type44"));
        books.add(new Book(48, "100000048", "Title48", "Author48", "Publisher48", "Type48"));
        books.add(new Book(46, "100000046", "Title46", "Author46", "Publisher46", "Type46"));
        books.add(new Book(47, "100000047", "Title47", "Author47", "Publisher47", "Type47"));
        books.add(new Book(51, "100000051", "Title51", "Author51", "Publisher51", "Type51"));
        books.add(new Book(49, "100000049", "Title49", "Author49", "Publisher49", "Type49"));
        books.add(new Book(50, "100000050", "Title50", "Author50", "Publisher50", "Type50"));
        books.add(new Book(54, "100000054", "Title54", "Author54", "Publisher54", "Type54"));
        books.add(new Book(52, "100000052", "Title52", "Author52", "Publisher52", "Type52"));
        books.add(new Book(53, "100000053", "Title53", "Author53", "Publisher53", "Type53"));
        books.add(new Book(57, "100000057", "Title57", "Author57", "Publisher57", "Type57"));
        books.add(new Book(55, "100000055", "Title55", "Author55", "Publisher55", "Type55"));
        books.add(new Book(56, "100000056", "Title56", "Author56", "Publisher56", "Type56"));
        books.add(new Book(60, "100000060", "Title60", "Author60", "Publisher60", "Type60"));
        books.add(new Book(58, "100000058", "Title58", "Author58", "Publisher58", "Type58"));
        books.add(new Book(59, "100000059", "Title59", "Author59", "Publisher59", "Type59"));
        books.add(new Book(61, "100000061", "Title61", "Author61", "Publisher61", "Type61"));
        books.add(new Book(62, "100000062", "Title62", "Author62", "Publisher62", "Type62"));
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Optional<Book> get(Long id) {
        return
                books.stream().filter(book -> book.getId() == id).findFirst();
    }

    @Override
    public void add(Book book) {
        books.add(book);

    }

    @Override
    public void delete(Long id) {
        books.removeIf(book -> book.getId() == id);
    }

    @Override
    public void update(Book book) {
        get(book.getId()).map(oldBook ->{
            oldBook.setIsbn(book.getIsbn());
            oldBook.setAuthor(book.getAuthor());
            oldBook.setPublisher(book.getPublisher());
            oldBook.setTitle(book.getTitle());
            oldBook.setIsbn(book.getIsbn());
            oldBook.setType(book.getType());
            return oldBook;
        });

    }
}
