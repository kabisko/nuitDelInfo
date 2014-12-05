/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.naming.InitialContext;

/**
 *
 * @author pc
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        try {
            InitialContext ctx = new InitialContext();
//            qcmpackage.Facade qcm = (qcmpackage.Facade) (ctx.lookup("questionnaire"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
