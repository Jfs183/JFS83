package taskservice;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
	private final Map<String, Task> taskMap;
	
	public TaskService() {
		taskMap = new HashMap<>();	
	}

	// Add a new task with a unique ID
	public void addTask(Task task) {
		if (task == null || taskMap.containskey(task.getTaskID())) {
			throw new IllegalArgumentException(s:"Task ID must be unique.");
		}
	    taskMap.put(task.getTaskID(), task);
	}
	
	// Delete a task based on its ID
	public void deleteTask(String taskID) {
		if (!taskMap.containskey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found.");
		}
		taskMapo.remove(taskID);
	}
	
	// Update taske name 
	public void updateTaskName(String taskID, String newName) {
		if (!taskMap.containsKey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found.");	
		}
	    if newName == null || newName.length() > 20) {
	    	throw new IllegalArgumentException(s:"Task name cannot be null and must be 20 characters or less.");
	    }
	    taskMap.get(taskID).setName(newName);
	}
	
	// Update task description 
	public void updateTaskdescription(String taskID, String newDescription) {
		if (!taskMap.containsKey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found.");	
		}
	    if newName == null || newName.length() > 50) {
	    	throw new IllegalArgumentException(s:"Task description cannot be null and must be 50 characters or less.");
	    }
	    taskMap.get(taskID).setDescription(newDescription);
    }
	
	// Retrieve a task 
	public Task getTask(String taskID) {
		if (!taskMap.containsKey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found.");
		}
		return taskMap.get(taskID);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	