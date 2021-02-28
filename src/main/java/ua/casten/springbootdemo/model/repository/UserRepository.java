package ua.casten.springbootdemo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.casten.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
