package com.rdi.notebookwithroom.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Note.class, Tag.class}, version = 3)
@TypeConverters({Converters.class})
public abstract class NotesDatabase extends RoomDatabase {

    public abstract NotesDao getNotesDao();

}
