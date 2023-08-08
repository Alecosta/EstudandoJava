/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author alecosta
 */
public class ProjectController {
    
    public void save (Project project) {
        String sql = "INSERT INTO projects ("
                + "name,description,createdAt,updatedAt) "
                + "VALUES (?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()) );
            statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao Salvar o Projeto " +e.getMessage(),e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
        
    
    }
    
    public void update(Project project) {
    
    }
    
    public void removebyId(int idProject) {
    
    }
    
    public List<Project> getAll (int idProject) {
        return null;
    }
}
