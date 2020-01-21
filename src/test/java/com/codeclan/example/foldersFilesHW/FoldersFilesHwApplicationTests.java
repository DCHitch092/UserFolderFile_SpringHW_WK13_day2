package com.codeclan.example.foldersFilesHW;

import com.codeclan.example.foldersFilesHW.models.File;
import com.codeclan.example.foldersFilesHW.models.Folder;
import com.codeclan.example.foldersFilesHW.models.User;
import com.codeclan.example.foldersFilesHW.repositories.FileRepository;
import com.codeclan.example.foldersFilesHW.repositories.FolderRepository;
import com.codeclan.example.foldersFilesHW.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersFilesHwApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){
		User user = new User("Johnny UserLad");
		userRepository.save(user);

		Folder folder = new Folder("normal documents", user);
		folderRepository.save(folder);

		File file = new File("definitely work", "exe", 100, folder);
		fileRepository.save(file);

		folder.addFile(file);
		folderRepository.save(folder);
		user.addFolder(folder);
		userRepository.save(user);



	}

}
