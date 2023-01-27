package com.example.library.Convertors;
import com.example.library.Models.Book;
import com.example.library.RequestDto.BookRequestDto;
public class BookConvertor {
    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){
        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()) .build();
        return book;
    }
}
