package net.app.springboot.controller;

import java.util.HashMap;
import net.app.springboot.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.app.springboot.exception.ResourceNotFoundException;
import net.app.springboot.model.Task;

import net.app.springboot.respository.TaskRepository;

@RestController
@RequestMapping("/api/v1/")
public class TaskController {
	
	@Autowired
	private  TaskRepository taskrepository;
	
	
	Logger log = Logger.getAnonymousLogger();

	
	// APIs
	
	/*1. create  a Task 
	 *  basic task details like title,
	 *   description,
	 *   createdBy
	 */
	
	@PostMapping("/Task/create")
	public Task createTask(@RequestBody Task task)
	{
		return taskrepository.save(task);
		
	}
	

	// 5.Get history of updates(task/history) given id of task fetch all the update history

		@GetMapping("/Task/search")
		public List<Task> getAllTask(){
			return taskrepository.findAll();
		}		
		
	
	//4.Search Task(task/search) search task by its id & title.

	@GetMapping("/Task/search/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
		Task task= taskrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Task not exist with id :" + id));
		return ResponseEntity.ok(task);
	}
	
	// Getmapping String title
	
	/*@GetMapping("/getTitle/{s}")
	public Task findByname(@PathVariable String s) {
		return taskrepository.findByname(s);
	}*/

	
	
	// 
	/*2.Update Task(task/update) update basic task details like
	 * title, description, status

	 */
	
//2.Update Task(task/update) update basic task details like title, description, status
	@PutMapping("/Task/update/{id}")
	public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task tasks){
		Task task =taskrepository .findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Task doesnt not exist with id :" + id));
		
		
		task.setEmploye_name(tasks.getEmploye_name());
		task.setJob_title(tasks.getJob_title());
		task.setEmail(tasks.getEmail());
		task.setAddres(tasks.getAddres());
		task.setCity(tasks.getCity());
		task.setState(tasks.getState());
		task.setP_E_C_1(tasks.getP_E_C_1());
		task.setPhone_number_1(tasks.getPhone_number_1());
		task.setRelation_1(tasks.getRelation_1());
		task.setP_E_C_2(tasks.getP_E_C_2());
		task.setPhone_number_2(tasks.getPhone_number_2());
		task.setRelation_2(tasks.getRelation_2());		
		Task updatedTask = taskrepository.save(task);
		return ResponseEntity.ok(updatedTask);
	}

	// delete task rest api
		@DeleteMapping("/Task/delete/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteTask(@PathVariable Long id){
			Task task =taskrepository .findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Task not exist with id :" + id));
			
			taskrepository.delete(task);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		//Assign task(task/assign) assign created task to someone who is going to work on it.*/
		//assign 
	
	
}
