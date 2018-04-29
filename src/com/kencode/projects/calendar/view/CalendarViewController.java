/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.projects.calendar.view;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Vidurajith
 */
public class CalendarViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        @FXML
    private Label lblMonth;

    @FXML
    private Label lblYear;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn14;

    @FXML
    private JFXButton btn13;

    @FXML
    private JFXButton btn12;

    @FXML
    private JFXButton btn11;

    @FXML
    private JFXButton btn10;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn15;

    @FXML
    private JFXButton btn16;

    @FXML
    private JFXButton btn17;

    @FXML
    private JFXButton btn18;

    @FXML
    private JFXButton btn19;

    @FXML
    private JFXButton btn20;

    @FXML
    private JFXButton btn21;

    @FXML
    private JFXButton btn28;

    @FXML
    private JFXButton btn27;

    @FXML
    private JFXButton btn34;

    @FXML
    private JFXButton btn35;

    @FXML
    private JFXButton btn26;

    @FXML
    private JFXButton btn25;

    @FXML
    private JFXButton btn24;

    @FXML
    private JFXButton btn23;

    @FXML
    private JFXButton btn22;

    @FXML
    private JFXButton btn29;

    @FXML
    private JFXButton btn30;

    @FXML
    private JFXButton btn31;

    @FXML
    private JFXButton btn32;

    @FXML
    private JFXButton btn33;

    @FXML
    private JFXButton btn36;

    @FXML
    private JFXButton btn37;

    @FXML
    private JFXButton btn38;

    @FXML
    private JFXButton btn40;

    @FXML
    private JFXButton btn39;

    @FXML
    private JFXButton btn42;

    @FXML
    private JFXButton btn41;

    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    private static CalendarViewController calendarViewController;
    
    private int count=0;
    private boolean isPressed=false;
    private JFXButton previousPressed;
    private int button=0;
    String dayName=null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        viewDates();
        checkDates();
        
        
    }
    
   private CalendarViewController(){
        
   }
   
   public void buttonAccessor(String btn){
       
       JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        
        for(int i=0;i<dates.length;i++){
            
            if(dates[i].getText().equals(btn)){
                
                dates[i].setStyle("-fx-background-color:blue");
                break;
            }
        }
       
   }
    
    @FXML
    private void btn10OnAction(ActionEvent event) {
        
        count=1;
        isPressed=true;
        
        setDate(btn10);
        
    }

    @FXML
    private void btn11OnAction(ActionEvent event) {
        
        count=1;
        isPressed=true;
        
        setDate(btn11);
    }

    @FXML
    private void btn12OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn12);
    }

    @FXML
    private void btn13OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn13);
    }

    @FXML
    private void btn14OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn14);
    }

    @FXML
    private void btn15OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn15);
    }

    @FXML
    private void btn16OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn16);
    }

    @FXML
    private void btn17OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn17);
    }

    @FXML
    private void btn18OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn18);
    }

    @FXML
    private void btn19OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn19);
    }

    @FXML
    private void btn1OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn1);
    }

    @FXML
    private void btn20OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn20);
    }

    @FXML
    private void btn21OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn21);
    }

    @FXML
    private void btn22OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn22);
    }

    @FXML
    private void btn23OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn23);
    }

    @FXML
    private void btn24OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn24);
    }

    @FXML
    private void btn25OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn25);
    }

    @FXML
    private void btn26OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn26);
    }

    @FXML
    private void btn27OnAction(ActionEvent event) {
        
        count=2;
        isPressed=true;
        
        setDate(btn27);
    }

    @FXML
    private void btn28OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn28);
    }

    @FXML
    private void btn29OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn29);
    }

    @FXML
    private void btn2OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn2);
    }

    @FXML
    private void btn30OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn30);
    }

    @FXML
    private void btn31OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn31);
    }

    @FXML
    private void btn32OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn32);
    }

    @FXML
    private void btn33OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn33);
    }

    @FXML
    private void btn34OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn34);
    }

    @FXML
    private void btn35OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn35);
    }

    @FXML
    private void btn36OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn36);
    }

    @FXML
    private void btn37OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn37);
    }

    @FXML
    private void btn38OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn38);
    }

    @FXML
    private void btn39OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn39);
    }

    @FXML
    private void btn3OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn3);
    }

    @FXML
    private void btn40OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn40);
    }

    @FXML
    private void btn41OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn41);
    }

    @FXML
    private void btn42OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn42);
    }

    @FXML
    private void btn4OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn4);
    }

    @FXML
    private void btn5OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn5);
    }

    @FXML
    private void btn6OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn6);
    }

    @FXML
    private void btn7OnAction(ActionEvent event) {

        count=2;
        isPressed=true;
        
        setDate(btn7);
    }

    @FXML
    private void btn8OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn8);
    }

    @FXML
    private void btn9OnAction(ActionEvent event) {

        count=1;
        isPressed=true;
        
        setDate(btn9);
    }

    
    public static CalendarViewController getInstance(){
        
        if(calendarViewController==null){
            calendarViewController=new CalendarViewController();
        }
        return calendarViewController;
    }
    
    private void setDate(JFXButton btn){
        
        String month=monthSelection(lblMonth.getText());

        if(previousPressed==null){
            previousPressed=btn;
        }else{
            previousPressed.setStyle("-fx-background-color:default");
            previousPressed=btn;
        }
        
        if(isPressed=true){
            if(count==1){
                
                btn.setStyle("-fx-background-color:orange");
                count=0;
                InitiateViewController.date=lblYear.getText()+"/"+month+"/"+btn.getText();
                
                
            }else{
              
                btn.setStyle("-fx-background-color:red");
                count=0;
                InitiateViewController.date=lblYear.getText()+"/"+month+"/"+btn.getText();
            }
        }
           
    }

    private String monthSelection(String mName) {
        
        switch(mName){
            case "JANUARY": return "01";
            case "FEBRUARY": return "02";
            case "MARCH": return "03";
            case "APRIL": return "04";
            case "MAY": return "05";
            case "JUNE": return "06";
            case "JULY": return "07";
            case "AUGUST": return "08";
            case "SEPTEMBER": return "09";
            case "OCTOBER": return "10";
            case "NOVEMBER": return "11";
            case "DECEMBER": return "12";
            default:return null;

        }
    }
    
    public void checkDates(){
        
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        
        for(int i=0;i<dates.length;i++){
            
            if(dates[i].getText().equals("")){
                dates[i].setVisible(false);
            }else{
                button=i;
            }
        }
    }
    
    public int getFinalDate(){
        
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        int j=0;
        for(int i=0;i<dates.length;i++){
            
            if(!dates[i].getText().equals("")){
                button=i+1;
            }
        }
        j=button;
        return j;
    }
    
    public int getFirstDate(){
        
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        int j=0;
        for(int i=0;i<dates.length;i++){
            
            if(!dates[i].getText().equals("")){
                button=i;
                break;
            }
        }
        j=button;
        return j;
    }
    
    public String identifyDay(int btn){
        
        int defference;
       
        if(btn>=1 && btn<8){
            
           defference=btn-1;
           return dayName=daySelection(defference);
           
        }else if(btn>=8 && btn<15){
           defference=btn-8;
           return dayName=daySelection(defference); 
        
        }else if(btn>=15 && btn<22){
           defference=btn-15;
           return dayName=daySelection(defference); 
        
        }else if(btn>=22 && btn<29){
           defference=btn-22;
           return dayName=daySelection(defference); 
        
        }else if(btn>=29 && btn<36){
           defference=btn-29;
           return dayName=daySelection(defference); 
        
        }else if(btn>=36 && btn<43){
           defference=btn-36;
           return dayName=daySelection(defference); 
        }
        return null;
    }
    
    
    private String daySelection(int defference){
        
        switch(defference){
            case 0: return "Mon";
            case 1: return "Tue";
            case 2: return "Wed";
            case 3: return "Thu";
            case 4: return "Fri";
            case 5: return "Sat";
            case 6: return "Sun";
            default:return null;
        }
    }
    public void setQualities(String month, String year){

        lblMonth.setText(month);
        lblYear.setText(year);
    }

    public void viewDates() {
        
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        
        for(int i=0;i<dates.length;i++){
            dates[i].setVisible(true);
        }
    }
    
    public int getDayAmount(String month,int year){
        
        switch(month){
            
            case "JANUARY": 
                return 31;
            case "FEBRUARY":
                if(year%4==0){
                    return 29; 
                }else{
                    return 28;
                }      
            case "MARCH": 
                return 31;
            case "APRIL":
                return 30;
            case "MAY": 
                return 31;
            case "JUNE":
                return 30;
            case "JULY": 
                return 31;
            case "AUGUST":
                return 31;
            case "SEPTEMBER":
                return 30;
            case "OCTOBER":
                return 31;
            case "NOVEMBER":
                return 30;
            case "DECEMBER": 
                return 31;
            default:
                return 0;
        }
    }
    
    public void setDatesToNextMonthButtons(int firstDate,String month,int dayAmount){
        
        int value=1;
        
        clearAll();
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        viewDates();
        for(int i=1;i<=dayAmount;i++){
            if(i<10){
                dates[firstDate+(i-1)].setText("0"+i);
                value++;
            }else{
                dates[firstDate+(i-1)].setText(i+"");
                value++;
            }
        }
        
        for(int i=value+5;i<dates.length;i++){
            dates[i].setText("");
        }
        checkDates();
        
    }
    
    public void setDatesToLastMonthButtons(int lastDate,String month,int dayAmount){

        for(int i=dayAmount;i>0;i--){
            
            if(lastDate==0){
                lastDate=7;
            }
            lastDate--;
        }
        
        int value=1;
        
        clearAll();
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        viewDates();
        
        if(lastDate==6){
            
            for(int i=0;i<dayAmount;i++){
                if(i<9){
                    dates[i].setText("0"+(i+1));
                    value++;
                }else{
                    dates[i].setText((i+1)+"");
                    value++;
                }
            }
            
        }else{
            
            for(int i=1;i<=dayAmount;i++){
                if(i<10){
                    dates[lastDate+(i)].setText("0"+i);
                    value++;
                }else{
                    dates[lastDate+(i)].setText(i+"");
                    value++;
                }
            }

        }
        
        for(int i=value+5;i<dates.length;i++){
            dates[i].setText("");
        }
        checkDates();
        
    }
    
    private void clearAll(){
       
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        
        for(int i=0;i<dates.length;i++){
            dates[i].setText("");
        }
    
    }
    public void setDefaultColor(){
        
        JFXButton[] dates={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42};
        for(int i=0;i<dates.length;i++){
            dates[i].setStyle("-fx-background-color:default");
        }
    }
    
        
}
