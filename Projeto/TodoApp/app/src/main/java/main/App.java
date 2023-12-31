 /*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main;


import controller.ProjectController;
import controller.TaskController;
import util.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {

    public static void main(String[] args) {
    
        // Connection c = ConnectionFactory.getConnection();
        // ConnectionFactory.closeConnection(c);
       
        //teste do project
        ProjectController projectController = new ProjectController();
//       
//        Project project = new Project(); 
//        project.setName("Projeto Teste");
//        project.setDescription("Descrição");
//        project.setUpdatedAt(new Date());
//
//        projectController.save(project);
//        
        List<Project> projects = projectController.getAll();
//        System.out.println("Total de Projetos "+projects.size());
//
//        project.setId(projects.get(0).getId());
//        project.setName("Novo nome do projeto");
//        project.setUpdatedAt(new Date());
//         
//        projectController.update(project);
//        
//        projects = projectController.getAll();
//        System.out.println("Total de Projetos "+projects.size());
//        
//        projectController.removebyId(projects.get(0).getId());
//        
//        projects = projectController.getAll();
//        System.out.println("Total de Projetos "+projects.size());
        
        //teste do task
        int numProject = projects.get(0).getId();
        TaskController taskController = new TaskController();
       
        Task task = new Task(); 
        task.setName("Projeto Teste");
        task.setDescription("Descrição");
        task.setUpdatedAt(new Date());
        task.setDeadLine(new Date());
        task.setIdProject(numProject);
   //     task.setId(1);

        taskController.save(task);
        
        List<Task> tasks = taskController.getAll(numProject);
        System.out.println("Total de Projetos "+tasks.size());

        task.setId(tasks.get(0).getId());
        task.setName("Novo nome da tarefa");
        task.setUpdatedAt(new Date());
         
        taskController.update(task);
        
        tasks = taskController.getAll(numProject);
        System.out.println("Total de tarefas "+tasks.size());
        
        //taskController.removebyId(tasks.get(0).getId());
        
        //tasks = taskController.getAll(numProject);
        //System.out.println("Total de Projetos "+tasks.size());
       
    
    }
}
