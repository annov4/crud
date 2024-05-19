package annov4.crud.crud.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String Name;

    @Column(name = "age")
    private int Age;

    @Column(name = "email")
    private String Email;

    public User(String name, int age, String email) {
        Name = name;
        Age = age;
        Email = email;
    }
}
