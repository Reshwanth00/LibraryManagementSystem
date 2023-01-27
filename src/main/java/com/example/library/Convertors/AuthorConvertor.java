package com.example.library.Convertors;
import com.example.library.Models.Author;
import com.example.library.RequestDto.AuthorRequestDto;
import com.example.library.ResponseDto.AuthorResponseDto;
import java.util.ArrayList;
import java.util.List;
public class AuthorConvertor {
    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().
                name(authorRequestDto.getName())
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();
        return  author;
    }
    public static List<AuthorResponseDto> convertEntityToDto(List<Author>authors){
        List<AuthorResponseDto> authorResponseDtoList = new ArrayList<>();
        for(Author author: authors){
            AuthorResponseDto authorRequestDto = AuthorResponseDto.builder().id(author.getId()).name(author.getName()).age(author.getAge())
                    .country(author.getCountry()).email(author.getEmail()).build();
            authorResponseDtoList.add(authorRequestDto);
        }
        return authorResponseDtoList;
    }
}
