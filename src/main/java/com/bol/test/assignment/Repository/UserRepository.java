package com.bol.test.assignment.Repository;

import com.bol.test.assignment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
