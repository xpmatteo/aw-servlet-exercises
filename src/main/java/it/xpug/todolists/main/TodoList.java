package it.xpug.todolists.main;

import static java.util.Collections.*;

import java.util.*;

import org.json.*;

public class TodoList {
	private String name;
	private List<TodoItem> todoItems = new ArrayList<>();

	public TodoList(String name) {
	    this.name = name;
    }

	public String getName() {
	    return name;
    }

	public void addItem(String todoItemText) {
		todoItems.add(new TodoItem(todoItemText));
    }

	public JSONObject toJson() {
	    JSONObject result = new JSONObject()
	    	.put("name", getName())
	    	.put("items", emptyList());
	    for (TodoItem todoItem : todoItems) {
	        result.append("items", todoItem.toJson());
        }
	    return result;
    }

}
