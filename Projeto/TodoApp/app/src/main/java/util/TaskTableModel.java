/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author alecosta
 */
public class TaskTableModel extends AbstractTableModel {
    
    String[] columns = {"Nome","Descrição","Prazo","Tarefa Concluída","Editar","Excluir" };
    List<Task> tasks = new ArrayList();

    @Override 
    public int getRowCount() {
        return tasks.size();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return columns.length;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if (tasks.isEmpty()) {
          return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex  ) {
        
        if (columnIndex == 3) {
            return true;
        } else {
            return false;
        }
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
                //break;
            case 1:
                return tasks.get(rowIndex).getDescription();
                //break;
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadLine());
                //break;
            case 3:
                return tasks.get(rowIndex).getIsCompleted();
                //break;
            case 4:
                return "";
                //break;
            case 5:
                return "";
                //break;
            default:
                return "Dados não encontrados";
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}
