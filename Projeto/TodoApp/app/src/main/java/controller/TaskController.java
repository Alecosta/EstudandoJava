/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author alecosta
 */
public class TaskController {
    
    public void save(Task task) {
        
        String sql = "INSERT INTO tasks (idProject,name,description,completed,"
                +"notes,deadLine,createdAt,updatedAt) "
                +"values(?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa "+ e.getMessage(),e); 
        } finally {
            ConnectionFactory.closeConnection(connection,statement);
        }
    }
    
    public void update(Task task) {
        
        String sql = "UPDATE tasks SET idProject= ? ,name= ? ,"
                +"description= ? ,notes= ? ,completed= ? ,deadLine= ? ,"
                +"createdAt= ? ,updatedAt= ?  WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
            
        } catch (Exception e) {
             throw new RuntimeException("Erro ao atualizar a tarefa "+ e.getMessage(),e); 
        } finally {
            ConnectionFactory.closeConnection(conn,statement);
        }
        
    }
    
    public void removebyId(int taskId) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE ID = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa"+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
        
    }
    
    public List<Task> getAll(int idProject) {
       String sql = "SELECT * FROM tasks WHERE ID = ?";
       
       Connection conn = null;
       PreparedStatement statment = null;
       ResultSet resultSet = null;
       
       List<Task> tasks = new ArrayList<Task>();
       
        try {
            conn = ConnectionFactory.getConnection();
            statment = conn.prepareStatement(sql);
            statment.setInt(1, idProject);
            resultSet = statment.executeQuery();
            
            while (resultSet.next()) {                
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("Description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("isCompleted"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(task);
                
                 
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir a tarefa"+e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn,statment,resultSet) ;
        }
       
       return tasks;
    } 
    
    
    
}
