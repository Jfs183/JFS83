package taskdata;

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
			throw new IllegalArgumentException(s:"Task must be unique and not null");
		}
	    tasks.put(task.getTaskID(), task);
	}
	
    //  Delete Task
	public void deleteTask(String taskID) {
		if (!tasks.containsKey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found");
        }
	    tasks.remove(taskID);
	}
	
	// Update Task Name
	public void updateTaskName(String taskID, String name) {
		if (!tasks.containsKey(taskID)) {
			throw new IllegalArgumentException(s:"Task ID not found");
        }
	    tasks.remove(taskID).setName(name);
	}
	
	// Update Task Description
	public void updateTaskDescription(String taskID, String description);
	    if (!tasks.containKey(taskID)) {
		    throw new IllegalArgumentException(s:"Task ID not found");
        }
        tasks.remove(taskID).setDescription(description);
    }
}

// TaskTest.java
package taskdata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupter.api.Test;

public class TaskTest {
	@Test
	void testTaskCreation() {
		Task task = new Task(taskID:"CLN001", name:"Vacuum Room", description:"Vacuum the entire living room and hallway.");
		assertEquals("ClN001", task.getTaskID());
		assertEquals("Vacuum Room", task.getName());
	    assertEquals("Vacuum the entire living room and hallway.", task.getDescription());
	}

	@Test
	void testSetName() {
		Task task = new Task(taskID:"CLN002", name:"Mop Floor", description:"Mop the kitchen floor and disinfect counters.");
		task.setName(name:"Mop Kitchen");
		aeertEquals("Mop Kitchen", task.getName());
	}
	
	@Test
	void testSetDescription() {
		Task task = new Task(taskID:"CLN003", name:"Dust Furniture", description:"Dust all furniture in the living room.");
		task.setDescription(description:"Dust and polish all furniture in the living room.";)
		assertEquals("Dust and polish all furniture in the living room.", task.getDescription());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	