package com.serg.cardetails.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements GrantedAuthority  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="role")
    private String role;
    @OneToMany(mappedBy = "userRole",cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
    private List<User> users=new ArrayList<>();

    @Override
    public String getAuthority() {
        return role;
    }
}
