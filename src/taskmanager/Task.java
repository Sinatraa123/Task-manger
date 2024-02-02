package taskmanager;

import java.util.Date;
import java.util.Objects;

public class Task {
	
	private int id; 
	private String title;
	private String description;
	private Date createdDateTime;
	private Boolean taskIsCompleted;
	private float estimatedtime;
	
	public Task() {}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(createdDateTime, description, id, taskIsCompleted, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(createdDateTime, other.createdDateTime) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(taskIsCompleted, other.taskIsCompleted)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", createdDateTime="
				+ createdDateTime + ", taskIsCompleted=" + taskIsCompleted + "]";
	}
	public Task(int id, String title, String description, Date createdDateTime, Boolean taskIsCompleted) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.createdDateTime = createdDateTime;
		this.taskIsCompleted = taskIsCompleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Boolean getTaskIsCompleted() {
		return taskIsCompleted;
	}
	public void setTaskIsCompleted(Boolean taskIsCompleted) {
		this.taskIsCompleted = taskIsCompleted;
	}
	
	
}

