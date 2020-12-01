/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantingtask;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Joman
 */
public class TasksController implements Initializable {
    @FXML
    void AddTask(ActionEvent event) throws IOException{
        Parent registerParent1 = FXMLLoader.load(getClass().getResource("AddTasks.fxml"));
        
        Scene registerScene1=new Scene(registerParent1);
        
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(registerScene1);
        window.show();

    }

    @FXML
    void ToPlant(MouseEvent event) throws IOException{
        Parent registerParent1 = FXMLLoader.load(getClass().getResource("plants.fxml"));
        
        Scene registerScene1=new Scene(registerParent1);
        
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(registerScene1);
        window.show();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
       
     }
    
      
    

