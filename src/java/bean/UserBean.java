/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ionut
 */
@SessionScoped
@Named("user")
public class UserBean implements Serializable {
    @EJB
    private NewSessionBeanLocal newSessionBean;
   

    private int id, departament_id;
    private String user, pass;

    public UserBean() {
    }

    public UserBean(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public UserBean(int id, int departament_id, String user, String pass) {
        this.id = id;
        this.departament_id = departament_id;
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public int getDepartament_id() {
        return departament_id;
    }

  
    public void setDepartament_id(int departament_id) {
        this.departament_id = departament_id;
    }

    
    public String getUser() {
        return user;
    }

  
    public void setUser(String user) {
        this.user = user;
    }


    public String getPass() {
        return pass;
    }

   
    public void setPass(String pass) {
        this.pass = pass;
    }

   
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserBean other = (UserBean) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }
    
    
    
}
