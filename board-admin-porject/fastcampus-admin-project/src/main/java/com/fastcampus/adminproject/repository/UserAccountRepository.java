package com.fastcampus.adminproject.repository;

import com.fastcampus.adminproject.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {

}
