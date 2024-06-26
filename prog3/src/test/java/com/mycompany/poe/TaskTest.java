package com.mycompany.poe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    Task task = new Task();
    
    public TaskTest() {
    }
   /*  @Test
    public void testCheckTaskDescription() { 
        assertTrue(task.checkTaskDescription("Task successfully captured"));
       
    }
    
          @Test
           public void testFalseCheckTaskDescription() {
               assertFalse(task.checkTaskDescription("Please enter a task description of less than 50 characters"));
    }
           


  @Test
    public void testGenerateTaskId() {
        String taskName = "Login feature";
        String taskDeveloperDetails = "Robyn Harrison";
        int taskNum = 123;

        String expectedTaskId = "LO:123:SON";
        String actualTaskId = task.createTaskId(taskName, taskDeveloperDetails, taskNum);

        assertEquals(expectedTaskId, actualTaskId);
    }
    
    */
    
 
    
    

    

   @Test
    public void testLongestTask() {
        Task task = new Task();

        String expected = "\nDeveloper: Glenda Oberholzer\nTask Duration: 11";
        String actual = task.showLongestTask(task_developers, task_Durations);

        assertEquals(expected, actual);
    }

   
    @Test
    public void testTaskAssignedToDeveloper() {
        Task task = new Task();

        String expected = "\nTask Name: Create Reports\nTask Status: Done";
        String actual = task.getTaskAssignedToDeveloper(task_developers, task_Names, task_Status, "Samantha", "Paulson");

        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task();

        String expected = "Task has been deleted.";
        String actual = task.deleteTask(task_Names, task_developers, task_Durations, task_Status, "Create Reports");

        assertEquals(expected, actual);
    }

  

}

    
    

    


