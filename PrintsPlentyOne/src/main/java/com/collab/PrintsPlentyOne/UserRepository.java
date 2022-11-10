package com.collab.PrintsPlentyOne;

import com.collab.PrintsPlentyOne.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
