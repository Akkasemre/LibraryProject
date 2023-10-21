package com.example.LibraryProject.controller.business;

import com.example.LibraryProject.payload.response.business.BookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService = bookService;

    @GetMapping
    public Page<BookResponse> getAllBooksWithPage(@RequestParam(value = "page" )int page,
                                                  @RequestParam(value = "size") int size,
                                                  @RequestParam(value = "sort" )String sort,
                                                  @RequestParam(value = "type")String type
    ){
    return bookservice.getAllBookWithPage(page,size,sort,type);
    }


}
