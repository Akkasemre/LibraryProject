package com.example.LibraryProject.entities.user;

import com.example.LibraryProject.entities.business.Loan;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2,max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2,max = 30)
    private String lastName;

    @Range(max = 2, min = -2)
    private int score=0;

    @NotNull
    @Size(min = 19, max = 100)
    private String address;

    @NotNull
    @Length(max = 12)
    @Pattern(regexp = "^999-999-9999$")
    private String phone;

    @NotNull
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @Pattern(regexp = "^9999-99-99$")
    private String birthDate;

    @NotNull
    @Size(min = 10, max = 80)
    @Email
    private String email;

    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-ddTHH:mm:ssZ")
    private LocalDateTime createDate;

    @Nullable
    private String resetPasswordCode;

    @NotNull
    private Boolean isBuiltIn = Boolean.FALSE;

}
