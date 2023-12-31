package com.springboot.multi.tenant.example.repository.user;

import com.springboot.multi.tenant.example.repository.user.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserModel, Long> {
}
