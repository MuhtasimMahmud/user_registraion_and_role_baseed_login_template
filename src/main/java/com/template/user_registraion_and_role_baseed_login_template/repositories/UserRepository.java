package com.template.user_registraion_and_role_baseed_login_template.repositories;

import com.template.user_registraion_and_role_baseed_login_template.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

    @Query("select U from User U where U.role = :role")
    public User findByRole(String role);

}
