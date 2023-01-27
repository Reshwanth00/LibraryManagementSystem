package com.example.library.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {
    private int id;
    private String name;
    private int age;
    private String country;
    private String email;
}
