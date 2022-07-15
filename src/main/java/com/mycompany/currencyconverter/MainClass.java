/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.currencyconverter;

/**
 *
 * @author Tristan
 */
public class MainClass {
    
    //create data variable here
        
    public static void main(String args[]){
        System.out.println("Hello World");
        
        LoadingFrame loadingobj = new LoadingFrame();
        
        //start
        loadingobj.setVisible(true);

        //if done getting the data
        MainFrame mainobj = new MainFrame();

        loadingobj.dispose();
        mainobj.setVisible(true);
    }
}
