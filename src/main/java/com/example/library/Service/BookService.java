package com.example.library.Service;
import com.example.library.Convertors.BookConvertor;
import com.example.library.Models.Author;
import com.example.library.Models.Book;
import com.example.library.Repository.AuthorRepository;
import com.example.library.Repository.BookRepository;
import com.example.library.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;
    public String createBook(BookRequestDto bookRequestDto){
        Book book = BookConvertor.convertDtoToEntity(bookRequestDto);
        int authorId = bookRequestDto.getAuthorId();
        Author author  = authorRepository.findById(authorId).get();
        book.setAuthor(author);
        List<Book> currentListOfBooks = author.getBooksWritten();
        currentListOfBooks.add(book);
        author.setBooksWritten(currentListOfBooks);
        authorRepository.save(author);
        return "succesfully added book";
    }
}
