package main.Java.Lebedenko.lesson2;

public interface IDBInterface <T>{
    Human  getSingleRecordFromDB ();
    Human getAllRecordFromDB ();
    void saveSingleRecordToDB (Human human);
    void saveAllRecordToDB (Human human);
}

