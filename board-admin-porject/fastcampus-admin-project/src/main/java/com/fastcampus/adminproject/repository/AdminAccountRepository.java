package com.fastcampus.adminproject.repository;

import com.fastcampus.adminproject.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {

}
