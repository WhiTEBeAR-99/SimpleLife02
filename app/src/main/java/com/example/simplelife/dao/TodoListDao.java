package com.example.simplelife.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.simplelife.entities.TodoList;

import java.util.List;

@Dao
public interface TodoListDao {

    @Query("SELECT * FROM todolists ORDER BY done DESC")
    List<TodoList> getAllTodoList();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTodoList(TodoList todoList);

    @Delete
    void deleteTodoList(TodoList todoList);
}
