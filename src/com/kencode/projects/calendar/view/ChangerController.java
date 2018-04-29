/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.projects.calendar.view;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Vidurajith
 */
public class ChangerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button lastYearBtn;

    @FXML
    private Button nextYearBtn;
    
     @FXML
     private Button mNext;
     
     @FXML
     private Button mLast;
    
     public int count=1;
     private int yrCount;
     
     private CalendarViewController calendar;
     private static ChangerController changerController;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        calendar=CalendarViewController.getInstance();
        
        Date d=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String date=df.format(d);
        
        char[] ch=date.toCharArray();
        
        String year="";
        
        for(int i=0;i<4;i++){
            year+=ch[i];
        }
        yrCount=Integer.parseInt(year);
        
      
    }    
    
    private ChangerController(){
        
    }
    
    
    @FXML
    public void mNextOnAction(ActionEvent evt) {
        
        calendar.setDefaultColor();
        
        count++;
        
         switch (count) {
             case 1:
                 CalendarViewController.getInstance().setQualities("JANUARY", Integer.toString(yrCount));
                 break;
             case 2:
                 CalendarViewController.getInstance().setQualities("FEBRUARY", Integer.toString(yrCount));
                 break;
             case 3:
                 CalendarViewController.getInstance().setQualities("MARCH", Integer.toString(yrCount));
                 break;
             case 4:
                 CalendarViewController.getInstance().setQualities("APRIL", Integer.toString(yrCount));
                 break;
             case 5:
                 CalendarViewController.getInstance().setQualities("MAY", Integer.toString(yrCount));
                 break;
             case 6:
                 CalendarViewController.getInstance().setQualities("JUNE", Integer.toString(yrCount));
                 break;
             case 7:
                 CalendarViewController.getInstance().setQualities("JULY", Integer.toString(yrCount));
                 break;
             case 8:
                 CalendarViewController.getInstance().setQualities("AUGUST", Integer.toString(yrCount));
                 break;
             case 9:
                 CalendarViewController.getInstance().setQualities("SEPTEMBER", Integer.toString(yrCount));
                 break;
             case 10:
                 CalendarViewController.getInstance().setQualities("OCTOBER", Integer.toString(yrCount));
                 break;
             case 11:
                 CalendarViewController.getInstance().setQualities("NOVEMBER", Integer.toString(yrCount));
                 break;
             case 12:
                 CalendarViewController.getInstance().setQualities("DECEMBER", Integer.toString(yrCount));
                 break;
             case 13:
                 CalendarViewController.getInstance().setQualities("JANUARY", Integer.toString(++yrCount));
                 count=1;
                 break;
             default:
                 break;
         }
        
        int nextMonthFirstDay=getButtonNo(dayUpper(calendar.identifyDay(calendar.getFinalDate())));
        String nextMonth=decideMonth(count);
        int dayAmount=calendar.getDayAmount(nextMonth,yrCount);
        
        calendar.setDatesToNextMonthButtons(nextMonthFirstDay,nextMonth,dayAmount);
        
        setCurrentDate(yrCount, decideMonth(count));
         
    }
    
    @FXML
    private void mLastOnAction(ActionEvent evt) {
        
        calendar.setDefaultColor();
        
        count--;
        
         switch (count) {
             case 0:
                 CalendarViewController.getInstance().setQualities("DECEMBER", Integer.toString(--yrCount));
                 count=12;
                 
                 break;
             case 1:
                 CalendarViewController.getInstance().setQualities("JANUARY", Integer.toString(yrCount));
                 break;
             case 2:
                 CalendarViewController.getInstance().setQualities("FEBRUARY", Integer.toString(yrCount));
                 break;
             case 3:
                 CalendarViewController.getInstance().setQualities("MARCH", Integer.toString(yrCount));
                 break;
             case 4:
                 CalendarViewController.getInstance().setQualities("APRIL", Integer.toString(yrCount));
                 break;
             case 5:
                 CalendarViewController.getInstance().setQualities("MAY", Integer.toString(yrCount));
                 break;
             case 6:
                 CalendarViewController.getInstance().setQualities("JUNE", Integer.toString(yrCount));
                 break;
             case 7:
                 CalendarViewController.getInstance().setQualities("JULY", Integer.toString(yrCount));
                 break;
             case 8:
                 CalendarViewController.getInstance().setQualities("AUGUST", Integer.toString(yrCount));
                 break;
             case 9:
                 CalendarViewController.getInstance().setQualities("SEPTEMBER", Integer.toString(yrCount));
                 break;
             case 10:
                 CalendarViewController.getInstance().setQualities("OCTOBER", Integer.toString(yrCount));
                 break;
             case 11:
                 CalendarViewController.getInstance().setQualities("NOVEMBER", Integer.toString(yrCount));
                 break;
             case 12:
                 CalendarViewController.getInstance().setQualities("DECEMBER", Integer.toString(yrCount));
                 break;
             default:
                 break;
         }
         
        
        
        int lastMonthFinalDay=getButtonNo(dayLower(calendar.identifyDay(calendar.getFirstDate()+1)));
        String lastMonth=decideMonth(count);
        int dayAmount=calendar.getDayAmount(lastMonth,yrCount);
        
        calendar.setDatesToLastMonthButtons(lastMonthFinalDay,lastMonth,dayAmount);
        
        setCurrentDate(yrCount, decideMonth(count));
         
    }
    @FXML
    private void lastYearOnAction(ActionEvent event) {
        
        calendar.setDefaultColor();
        
        for(int i=0;i<12;i++){
            mLastOnAction(event);
        }
        setCurrentDate(yrCount, decideMonth(count));
    }
    
    @FXML
    public void nextYearOnAction(ActionEvent event) {
        
        calendar.setDefaultColor();
      
        for(int i=0;i<12;i++){
            mNextOnAction(event);
        }
        setCurrentDate(yrCount, decideMonth(count));
        
    }

    private String decideMonth(int month){
        
        switch(month){
            
            case 1:return "JANUARY";
            case 2:return "FEBRUARY";
            case 3:return "MARCH";
            case 4:return "APRIL";
            case 5:return "MAY";
            case 6:return "JUNE";
            case 7:return "JULY";
            case 8:return "AUGUST";
            case 9:return "SEPTEMBER";
            case 10:return "OCTOBER";
            case 11:return "NOVEMBER";
            case 12:return "DECEMBER";
            default: return null;
        }
    }
    
    private String dayUpper(String lastMonthFinalDayName){
        
        switch(lastMonthFinalDayName){
            
            case "Mon":return "Tue";
            case "Tue":return "Wed";
            case "Wed":return "Thu";
            case "Thu":return "Fri";
            case "Fri":return "Sat";
            case "Sat":return "Sun";
            case "Sun":return "Mon";
            default:return null;
        }
    }
    private String dayLower(String lastMonthFirstDayName){
        
        switch(lastMonthFirstDayName){
            
            case "Mon":return "Sun";
            case "Tue":return "Mon";
            case "Wed":return "Tue";
            case "Thu":return "Wed";
            case "Fri":return "Thu";
            case "Sat":return "Fri";
            case "Sun":return "Sat";
            default:return null;
        }
    }
    
    private int getButtonNo(String dayName){
        
        switch(dayName){
            case "Mon": return 0;
            case "Tue": return 1;
            case "Wed": return 2;
            case "Thu": return 3;
            case "Fri": return 4;
            case "Sat": return 5;
            case "Sun": return 6;
            default:return -1;
        }
    }
    public static ChangerController getInstance(){
        if(changerController==null){
            changerController=new ChangerController();
        }
        return changerController;
    }
    private void setCurrentDate(int year,String month){
        
        Date d=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String date=df.format(d);
                
        char[] days=date.toCharArray();

        String years="";
        String months="";
        String daynum="";

        for(int i=0;i<4;i++){
            years+=days[i];
        }
        for(int i=5;i<7;i++){
            if(days[i]==0){
                months+="";
            }
            months+=days[i];
        }
        for(int i=8;i<10;i++){
            daynum+=days[i];
        }
        
        int yearNum=Integer.parseInt(years);
        String monthName=decideMonth(Integer.parseInt(months));
        
        if((yearNum==year) && (monthName.equals(month))){
            calendar.buttonAccessor(daynum);
        }
    }

}
