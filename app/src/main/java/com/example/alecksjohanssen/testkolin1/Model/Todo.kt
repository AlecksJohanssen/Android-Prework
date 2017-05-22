package com.example.alecksjohanssen.testkolin1.Model

/**
 * Created by AlecksJohanssen on 5/22/17.
 */
class Todo {
    var list = ArrayList<Todo>()
    private var _description: String = ""

    private var _title: String = ""

    var title: String
        get() = _title
        set(value) {
            _title = value
        }

    var description: String
        get() = this.toString()
        set(value) {
            _description = value
        }

    fun addTodo(todo: Todo) {
        list.add(todo)
        System.out.println("Add Complete")
    }

    fun getAllTodo(): ArrayList<Todo> {
        return list
    }


}