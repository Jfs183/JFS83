package taskdata;

public class Task {
	private final String taskID;
	private String name;
	private String description;
	
	// Constructor
	public Task(String taskID, String name, String description) {
		if (taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException(s:"Task ID must be non-null and at most 10 characters.");
		}
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException(s:"Task name must be non-null and at most 20 characters.");
		}
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException(s:"Task description must be non-null and at most 50 characters.");
		}
        this.taskID = taskID;
        this.name = name;
        this.description = description;
	}  
	
	// Getters 
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	// Setters for upDatable fields
	public void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException(s:"Task name must be non-null and at most 20 characters.");
		}
	    this.name = name;
	}
	
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException(s:"Task name must be non-null and at most 50 characters.");
		}
	    this.description = description;
	}
}

// TaskService.java
pakage  taskdata;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
	private final Map<String, Task> tasks;
	
	public TaskService() {
		this.tasks = new HashMap<>();
	}
	
	// Add Task
	public void addTask(Task task) {
		if (task == null || tasks.containKey(task.getTaskID())) {
	        throw new IllegalArgumentException(s:"Task must be ubique and not null.");
		}
		task.put(task.getTask(), task;
	}
	
	// Delete Task
	public void deleteTask(String taskID) {
		if (!tasks.containskey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found.");
		}
	    tasks.remove(taskID);
	}
	
	//Update Task Name
	public void updateTaskName(String taskID, String name) {
		if (!tasks.containsKey(TaskID)) {
			throw new IllegalArgumentException(s:"Task Id not found.");
		}
	    task.get(taskID).setName(name);
	}
	
	// Update Task Description
	public void updateTaskDescription(String taskID) {
	    if (!tasks.containsKey(TaskID)) {
			throw new IllegalArgumentException(s:"Task Id not found.");
			}
		    task.get(taskID).setDescription(description);
	}
}
	
	
	
	
	
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







