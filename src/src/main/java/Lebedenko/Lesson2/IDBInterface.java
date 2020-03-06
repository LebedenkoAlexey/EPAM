package EPAM_Lessons.Lesson2;

public interface IDBInterface <Human>{
    Human  getSingleRecordFromDB ();
    Human getAllRecordFromDB ();
    void saveSingleRecordToDB (Human human);
    void saveAllRecordToDB (Human human);
}

