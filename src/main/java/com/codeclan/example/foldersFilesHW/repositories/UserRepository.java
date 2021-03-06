package com.codeclan.example.foldersFilesHW.repositories;

import com.codeclan.example.foldersFilesHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
