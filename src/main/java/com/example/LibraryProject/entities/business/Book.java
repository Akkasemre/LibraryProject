package com.example.LibraryProject.entities.business;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.File;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2,max = 80)
    private String name;

    @NotNull
    @Length(max = 17)
    @Pattern(regexp = "^999-99-99999-99-9$")
    private String isbn;

    @Nullable
    private int pageCount;

    @ManyToOne(cascade =CascadeType.PERSIST)
    private Author authorId;

    @ManyToOne(cascade =CascadeType.PERSIST)
    private Publisher publisherId;

    @Nullable
    private int publishDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category categoryId;

    @Nullable
    private File image;

    @NotNull
    private Boolean loanable = Boolean.TRUE;

    @NotNull
    @Length(max = 6)
    @Pattern(regexp = "^AA-999$")
    private String shelfCode;

    @NotNull
    private Boolean active = Boolean.TRUE;

    @NotNull
    private Boolean featured = Boolean.FALSE;

    @NotNull
    // ex: 1990-10-25T10:35:25Z
    private LocalDateTime createDate;

    @NotNull
    private Boolean builtIn = Boolean.FALSE;
}
