/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantingtask;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taskdata")
public class Task_POJO implements java.io.Serializable {

    //private User SelectedUser;
    @Id
    @Column(name = "taskID")
    private int taskID;

    @Column(name = "taskName")
    private String taskName;

    @Column(name = "taskScore")
    private int taskScore;

    @Column(name = "taskState")
    private String taskState;

    @Column(name = "userName")
    private String userName;

    @Column(name = "dueDate")
    private Date dueDate;
    
    @Column(name ="Done")
    private String isDone;

    public Task_POJO() {
    }

    public Task_POJO(int taskID, String taskName, int taskScore, String taskState, String userName, Date dueDate, String isDone) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskScore = taskScore;
        this.taskState = taskState;
        this.userName = userName;
        this.dueDate = dueDate;
        this.isDone = isDone;
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskScore(int taskScore) {
        this.taskScore = taskScore;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskScore() {
        return taskScore;
    }

    public String getTaskState() {
        return taskState;
    }
    
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    public String getIsDone() {
        return isDone;
    }

    public void setIsDone(String isDone) {
        this.isDone = isDone;
    }
}
