/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.people;

/**
 *
 * @author Iwa Stojnowa
 */
class PersonDataExceptionBean {
     private String message;
 
    public PersonDataExceptionBean() {
    }
    public PersonDataExceptionBean(String message) {
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    } 
}
