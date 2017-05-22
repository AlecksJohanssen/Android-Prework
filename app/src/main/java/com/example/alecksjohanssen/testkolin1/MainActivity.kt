package com.example.alecksjohanssen.testkolin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.alecksjohanssen.testkolin1.Model.Todo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        val tv = findViewById(R.id.sample_text) as TextView
        tv.text = stringFromJNI()
        newTodo()
        System.out.println("Blah")

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")

        }
    }

    fun newTodo() {
        System.out.println("Hello World")
        val result = Todo()
        result.title = "Cheeseburger"
        result.description = "Go have some breakfast"
        result.addTodo(result)
        result.getAllTodo().forEachIndexed { index, todo ->

        }

    }

}

