package com.codeclan.example.foldersFilesHW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface User extends JpaRepository<User, Long> {
}
