package com.example.LibraryProject.entities.user;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "KTP")
    private Long roleId;

    @Enumerated(EnumType.STRING)
    private String roleName;

    private String name;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User>users;

}
