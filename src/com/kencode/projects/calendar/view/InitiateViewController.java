/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.projects.calendar.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Vidurajith
 */
public class InitiateViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    public static String date;
    
    @FXML
    private JFXTextField txtDate;
    
    @FXML
    public JFXDrawer calendarDrawer;
    
    @FXML
    private JFXDrawer changeDrawer;
    
    @FXML
    private JFXButton btn;
    
    @FXML
    private JFXButton closeBtn;
    
    public static JFXDrawer drawer1;
    
    private ChangerController changerController;
    private CalendarViewController calendarViewController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       changerController=ChangerController.getInstance(); 
       calendarViewController=CalendarViewController.getInstance();
        
       drawer1=calendarDrawer;
      
       closeBtn.setVisible(false);
       
    }  
    
    @FXML
    private void iconOnAction(ActionEvent evt){
        
        changerController.count=1;
        try {
            
            FXMLLoader fXMLChangerLoader=new FXMLLoader(getClass().getResource("/com/kencode/projects/calendar/view/Changer.fxml"));
            fXMLChangerLoader.setController(changerController);

            closeBtn.setVisible(true);
            changeDrawer.setVisible(true);

            FXMLLoader fXMLLoader=new FXMLLoader(getClass().getResource("/com/kencode/projects/calendar/view/CalendarView.fxml"));
            fXMLLoader.setController(CalendarViewController.getInstance());
            AnchorPane box=fXMLLoader.load();
            calendarDrawer.setSidePane(box);
            calendarDrawer.open();


            AnchorPane change=fXMLChangerLoader.load();
            changeDrawer.setSidePane(change);
            changeDrawer.open();
            
            
            if(txtDate.getText().equals("") ){
               
                Date d=new Date();
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                String date=df.format(d);
                
                char[] days=date.toCharArray();
                
                String year="";
                String month="";
                String day="";
                
                for(int i=0;i<4;i++){
                    year+=days[i];
                }
                for(int i=5;i<7;i++){
                    month+=days[i];
                }
                for(int i=8;i<10;i++){
                    day+=days[i];
                }
                
                int years=Integer.parseInt(year);
                
                int yearDefference=years-2017;
                
                if(yearDefference==0){
                    int months=Integer.parseInt(month);
                
                    for(int i=0;i<(months-1);i++){
                        changerController.mNextOnAction(evt);
                    }
                    calendarViewController.buttonAccessor(day);
                    
                }else{
                  
                    for(int i=0;i<yearDefference;i++){
                        changerController.nextYearOnAction(evt);
                    }
                    
                    int months=Integer.parseInt(month);
                    
                    for(int i=0;i<(months-1);i++){
                        changerController.mNextOnAction(evt);
                    }
                    calendarViewController.buttonAccessor(day);
                }
                
            }else{
                
                String date=txtDate.getText();
       
                char[] days=date.toCharArray();
                
                String year="";
                String month="";
                String day="";
                
                for(int i=0;i<4;i++){
                    year+=days[i];
                }
                for(int i=5;i<7;i++){
                    if(days[i]==0){
                        month+="";
                    }
                    month+=days[i];
                }
                for(int i=8;i<10;i++){
                    day+=days[i];
                }
                
                int years=Integer.parseInt(year);
                
                int yearDefference=years-2017;
                
                if(yearDefference==0){
                    int months=Integer.parseInt(month);
                
                    for(int i=0;i<(months-1);i++){
                        changerController.mNextOnAction(evt);
                    }
                    calendarViewController.buttonAccessor(day);
                    
                }else{
                    
                    for(int i=0;i<yearDefference;i++){
                        changerController.nextYearOnAction(evt);
                    }
                    
                    int months=Integer.parseInt(month);
                    
                    for(int i=0;i<(months-1);i++){
                        changerController.mNextOnAction(evt);
                    }
                    calendarViewController.buttonAccessor(day);
                }
            }
           
        } catch (IOException ex) {
            Logger.getLogger(InitiateViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @FXML
    private void closeOnAction(ActionEvent evt){
        
        closeBtn.setVisible(false);
        calendarDrawer.close();
        changeDrawer.close();
        changeDrawer.setVisible(false);
        
        txtDate.setText(date);
        
        
    }
    
}
