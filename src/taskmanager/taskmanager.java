package taskmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class taskmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		List <Task> TaskList = new ArrayList<>();
		Task task = new Task(++counter,"learn cooking","briyani",new Date(),false); 
		TaskList.add(task);
		
		boolean k = true;
		while (k) {
		Scanner homeMenuScanner = new Scanner(System.in);
		System.out.println("        Task Manager");
		System.out.println("****************************");
		System.out.println("1. Create a new Task");
		System.out.println("2. View a Task");
		System.out.println("3. Update a Task");
		System.out.println("4. Delete a Task");
		System.out.println("5. Exit App");
		System.out.println("****************************");
		
		System.out.println("Enter your Choice :");
		int homeMenuChoice = homeMenuScanner.nextInt();
		
		switch (homeMenuChoice) {
		case 1:
			createTask(TaskList,counter);
			
			break;
		case 2:
			ViewTask(TaskList);
			break;
		case 3:
			UpdateTask(TaskList);
			break;
		case 4:
			DeleteTask(TaskList);
			break;
		case 5:
			k = false;
			break;
				
		default:	
			System.out.println("Invalid Choice");
			break;
		}
		}
	}

	private static void UpdateTask(List<Task> taskList) {
		// TODO Auto-generated method stub
		
		Scanner updateScanner = new Scanner(System.in);
		System.out.println("Task Manager");
		System.out.println("********************");
		System.out.println("Enter the taskID to be Updated :");
	
		int index = updateScanner.nextInt();
		//Task task = taskList.get(index);
		
		for(Task task:taskList) {
			if(task.getId()== index) {
				Scanner update = new Scanner(System.in);
				
				System.out.println("Task Manager");
				System.out.println("********************");
				
				System.out.println("Enter Title: ");
				String newTitle  = update.nextLine();
				System.out.println("Enter Description: ");
				String newDescription = update.nextLine();
				
				
				task.setTitle(newTitle);
				task.setDescription(newDescription);
				
				
			}
		}
				
		
		System.out.println("Task Updated Successfully......");
		return;
		
	}

	private static void DeleteTask(List<Task> taskList) {
		// TODO Auto-generated method stub
		Scanner deleteScanner = new Scanner(System.in);
		System.out.println("      Task Manager");
		System.out.println("***************************");
		System.out.println("Enter the ID to be Deleted :");
		int taskID = deleteScanner.nextInt();
		
		System.out.println("Task Manager");
		System.out.println("***************************");
		taskList.remove(taskID);
		System.out.println("Task was deleted Successfully......");
		return;
		
	}

	private static void ViewTask(List<Task> taskList) {
		// TODO Auto-generated method stub
		Scanner viewScanner = new Scanner(System.in);
		
		
		if(taskList.isEmpty()) {
			System.out.println("No Tasks Found.");
			return;
		}	
		
				
		System.out.println("         Task Manager");
		System.out.println("********************************");
		for (Task task: taskList) {
			System.out.println(task.getId()+". "+task.getTitle());			
		}		
		System.out.println("********************************");
		System.out.println("Enter task Id to view");
		int taskId = viewScanner.nextInt();
		System.out.println("         Task Manager");
		System.out.println("********************************");
		for(Task task : taskList) {
			if(task.getId()== taskId) {
				System.out.println(task.getId());
				System.out.println("Task Title:");
				System.out.println(task.getTitle());
				System.out.println("Task Description:");
				System.out.println(task.getDescription());
				System.out.println("Task Created On:");
				System.out.println(task.getCreatedDateTime());
			
			}
			

		
		}
		
	}

	private static void createTask(List<Task> taskList, int counter) {
		// TODO Auto-generated method stub
		Task task = new Task();
		Scanner addtaskScanner = new Scanner(System.in);
		Date date = new Date();
		System.out.println("********************");
		System.out.println("Enter Title: ");
		String title  = addtaskScanner.nextLine();
		System.out.println("Enter Description: ");
		String description = addtaskScanner.nextLine();
		
		task.setId(++counter);
		task.setTitle(title);
		task.setDescription(description);
		task.setCreatedDateTime(date);
		
		taskList.add(task);
		System.out.println(task.getTitle()+" Added Successfully!");
		return;
		
		}
	
	

}
