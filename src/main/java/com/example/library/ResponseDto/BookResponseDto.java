package com.example.library.ResponseDto;
import com.example.library.Enums.Genre;
import lombok.Builder;
@Builder
public class BookResponseDto {
    String name;
    Genre genre;
}