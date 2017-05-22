package com.example.alecksjohanssen.testkolin1.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.alecksjohanssen.testkolin1.Model.Todo
import com.example.alecksjohanssen.testkolin1.R
import org.w3c.dom.Text

/**
 * Created by AlecksJohanssen on 5/22/17.
 */
class TodoAdapter(context: Context, todos: ArrayList<Todo>) : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {
    var mTodos:  ArrayList<Todo> = todos
    var mContext: Context = context

    init {
        mTodos = todos
        mContext = context
    }

    fun getContext() : Context {
        return mContext;
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var todo: Todo = mTodos[position]
        val textView = holder.mTodoEditTextView
        textView.text = todo.title

    }

    override fun getItemCount(): Int {
        return mTodos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context: Context = parent.context
        val todoView: View = LayoutInflater.from(context).inflate(R.layout.todo_detail, parent, false)
        val viewHolder = ViewHolder(todoView)
        return viewHolder
    }

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val mTodoEditTextView: TextView = itemView.findViewById(R.id.tvTitle) as TextView
    }


}