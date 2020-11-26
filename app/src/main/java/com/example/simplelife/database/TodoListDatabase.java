package com.example.simplelife.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.simplelife.dao.TodoListDao;
import com.example.simplelife.entities.TodoList;

@Database(entities = TodoList.class, version = 1, exportSchema = false)
public abstract class TodoListDatabase extends RoomDatabase {

    private static TodoListDatabase todoListDatabase;

    public static synchronized TodoListDatabase getDatabase(Context context) {
        if (todoListDatabase == null) {
            todoListDatabase = Room.databaseBuilder(
                    context,
                    TodoListDatabase.class,
                    "todo_db"
            ).build();
        }
        return todoListDatabase;
    }

    public abstract TodoListDao todoListDao();
}
