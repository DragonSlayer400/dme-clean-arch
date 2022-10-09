package ru.develop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.develop.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
