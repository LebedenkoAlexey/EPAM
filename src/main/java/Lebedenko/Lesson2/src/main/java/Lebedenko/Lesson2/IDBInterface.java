package main.Java.Lebedenko.lesson2;


public interface IDBInterface <T>{
    T getSingleRecordFromDB();
    T[] getAllRecordFromDB();
    void saveSingleEntityToDB(T t);
    void saveAllEntitiesToDB(T[] t, int i);
}

