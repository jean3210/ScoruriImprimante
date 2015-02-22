/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author ionut
 */
public interface NewInterface {

    boolean equals(Object obj);

    int getDepartament_id();

    int getId();

    String getPass();

    String getUser();

    int hashCode();

    void setDepartament_id(int departament_id);

    void setId(int id);

    void setPass(String pass);

    void setUser(String user);
    
}
