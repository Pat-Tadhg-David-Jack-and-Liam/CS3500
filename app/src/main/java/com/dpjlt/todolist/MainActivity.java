package com.dpjlt.todolist;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // todo make private and access with getter
    private static ToDoList toDoList = AppLaunch.getToDoList();

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newTaskPopup;
    private Button newTaskSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toDoList.addItem("WOW");

//         RecyclerView rvTodoList = (RecyclerView) findViewById(R.id.);
//         bind the recyclerview
    }

    public void addTask (View view){
        EditText editTodo = findViewById(R.id.editTodo);
        toDoList.addItem(editTodo.getText().toString());
        editTodo.setText("");
    }
}