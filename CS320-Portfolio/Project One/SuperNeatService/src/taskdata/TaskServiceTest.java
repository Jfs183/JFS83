package taskdata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
	private TaskService taskService;
	
	@BeforeEach
	void setUp() {
		taskService = new TaskService();
	}

	@Test 
	void testAddTask() {
		Task task = new Task(taskID:"CLN004", "Sweep Garage", description:"Sweep and tidy up the gargage."):
			 taskService.addTask(task):
			 assertEquals(task, taskService.getTask("CLN004")):
	}
	
	@Test
	void testDeleteTask() {
		Task task = new Task(taskID:"CLN005", name:"Organize Closet, description:"Sort and organize closet shelves.");")
		taskService.addTask(task);
		taskService.deleteTask(taskID:"CLN005");
		assertThrows(IllegalArgumentException.class, () -> taskService.getTask("CLN005)"));
	}
	
	@Test
	void testUpdateTaskName() {
		Task task = new Task(taskID:"CLN006", name:"Clean Windows, description:"Wipe down all windows inside and out.");")
		taskService.addTask(task);
		taskService.UpdateTaskName(taskID:"CLN006", name:"Wash Windows");
		assertEquals("Wash Windows", taskService.getTask("CLN006").getName());
	}
	
	@Test
	void testUpdateTaskDescription() {
		Task task = new Task(taskID:"CLN007", name:"Wash Dishes", description:"Clean all dishes and utensils.");")
		taskService.addTask(task);
		taskService.UpdateTaskDescription(taskID:"CLN007", description:"Clean all dishes and wipe down sink area.");
		assertEquals("Clean all dishes and wipe down sink area.", taskService.getTask("CLN007").getDescription());
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
