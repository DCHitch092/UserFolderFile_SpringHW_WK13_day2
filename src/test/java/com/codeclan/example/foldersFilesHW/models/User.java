package com.codeclan.example.foldersFilesHW.models;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String userName;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Folder> folderList;

    public User(String userName) {
        this.userName = userName;
        this.folderList = new ArrayList<Folder>();
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Folder> getFolderList() {
        return new ArrayList<>(folderList);
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }
}

