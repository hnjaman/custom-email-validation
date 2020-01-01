package com.bol.test.assignment.model;

import com.bol.test.assignment.util.EmailValidator;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NoArgsConstructor
@Data
@Entity
@Table(name= "user")
@Builder
@AllArgsConstructor
public class User {

   @Column
   private String firstName;

   @Column
   private String lastName;

   @Id
//   @Email(message = "Not a valid email")
   @EmailValidator
   private String email;
}
