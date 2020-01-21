package com.codeclan.example.foldersFilesHW.components;

import com.codeclan.example.foldersFilesHW.models.File;
import com.codeclan.example.foldersFilesHW.models.Folder;
import com.codeclan.example.foldersFilesHW.models.User;
import com.codeclan.example.foldersFilesHW.repositories.FileRepository;
import com.codeclan.example.foldersFilesHW.repositories.FolderRepository;
import com.codeclan.example.foldersFilesHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User user = new User("Johnny UserLad");
        userRepository.save(user);

        User user2 = new User("Brenda Computerbae");
        userRepository.save(user2);

        Folder folder = new Folder("normal documents", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("work", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("play", user2);
        folderRepository.save(folder3);

        File file = new File("definitely work", "exe", 100, folder);
        fileRepository.save(file);

        File file2 = new File("definitely play", "txt", 101, folder2);
        fileRepository.save(file2);

        File file3 = new File("work cv", "doc", 101, folder2);
        fileRepository.save(file3);

        folder.addFile(file);
        folder2.addFile(file2);
        folder2.addFile(file3);
        folderRepository.save(folder);

        user.addFolder(folder);
        userRepository.save(user);
        user2.addFolder(folder2);
        userRepository.save(user2);
    }
}
