package com.example.alecksjohanssen.testkolin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.alecksjohanssen.testkolin1.Adapter.TodoAdapter
import com.example.alecksjohanssen.testkolin1.Model.Todo

class MainActivity : AppCompatActivity() {
    private val result = Todo()
    private lateinit var buttonSubmit: Button
    private lateinit var editText: EditText
    private lateinit var rvTodos: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Example of a call to a native method
        //val tv = findViewById(R.id.sample_text) as TextView
        //tv.text = stringFromJNI()
        System.out.println("Blah")
        buttonSubmit = findViewById(R.id.btnSubmit) as Button
        rvTodos = findViewById(R.id.rvTodos) as RecyclerView
        val adapter: TodoAdapter = TodoAdapter(this, result.getAllTodo())
        editText = findViewById(R.id.newTodo) as EditText
        rvTodos.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager
        rvTodos.adapter = adapter
        newTodo()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    // external fun stringFromJNI(): String

//    companion object {
//
//        // Used to load the 'native-lib' library on application startup.
//        init {
//            System.loadLibrary("native-lib")
//
//        }
//    }

    fun submitTodo(data: String) {
        result.title = data
        result.addTodo(result)
        rvTodos.adapter.notifyDataSetChanged()
        editText.text.clear()
    }

    fun newTodo() {
        buttonSubmit.setOnClickListener({
            view -> submitTodo(editText.text.toString())
        })
    }
}

