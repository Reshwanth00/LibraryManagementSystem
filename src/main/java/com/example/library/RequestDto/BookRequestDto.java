package com.example.library.RequestDto;
import com.example.library.Enums.Genre;
import lombok.Data;
@Data
public class BookRequestDto {
    private String name;
    private Genre genre;
    private int authorId;
}
