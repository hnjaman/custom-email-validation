package com.hnj.code.model;

import com.hnj.code.util.EmailValidator;
import lombok.*;

import javax.persistence.*;

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
   @EmailValidator
   private String email;
}
