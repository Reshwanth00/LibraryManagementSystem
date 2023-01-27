package com.example.library.Controllers;
import com.example.library.Models.Author;
import com.example.library.RequestDto.AuthorRequestDto;
import com.example.library.ResponseDto.AuthorResponseDto;
import com.example.library.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){

        return authorService.createAuthor(authorRequestDto);
    }
    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name")String name){
        return authorService.findAuthorByName(name);
    }
}
