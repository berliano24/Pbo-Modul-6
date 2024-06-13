package tugas.dao;

import tugas.entities.PasswordStores;
import tugas.entities.UserData;
import java.util.*;
public interface PasswordStoreDAO{
    public int addPassword(PasswordStores newPassword, UserData user);
    public ArrayList<PasswordStores> listPassword(UserData user);
    public ArrayList<PasswordStores> findPassword(String name, UserData user);
    public int updatePass(PasswordStores changedPass);
    public int deletePass(PasswordStores deletedPass);
    }
    
