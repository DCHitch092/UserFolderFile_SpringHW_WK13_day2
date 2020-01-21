package com.codeclan.example.foldersFilesHW.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String title;
    private List<File> fileList;

    public Folder(String title) {
        this.title = title;
        this.fileList = new ArrayList<File>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }
}
