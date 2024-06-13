package tugas.dao;

import java.util.*;

import tugas.entities.Folder;

public interface FolderDAO{
    public int createFolder(String foldername);
    public ArrayList<Folder> listAllFolders();
    }
    