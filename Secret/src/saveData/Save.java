/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveData;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Sofrosyn
 */
public class Save {

    private IntegerProperty id;
    private StringProperty title;
    private StringProperty date;
    private StringProperty data;
    

        public Save() {
        id = new SimpleIntegerProperty();
        title = new SimpleStringProperty();
        date = new SimpleStringProperty();
        data = new SimpleStringProperty();
 
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getid() {
        return id.get();
    }

    /**
     * Sets the  id.
     *
     * @param id the new id
     */
    public void setid(int ids){
        id.set(ids);
    }

    /**
     *  id property.
     *
     * @return the integer property
     */
    public IntegerProperty idProperty(){
        return id;
    }
    
    public StringProperty titleProperty(){
        return title;
    }
    
    public StringProperty dateProperty(){
        return date;
    }
    public StringProperty dataProperty(){
        return data;
    }
    
 public String getTitle(){ return title.get();        }
 public String getDate() { return date.get();}   
 public String getData() { return data.get();}   
 
    
 
 public void setTitle(String titles){title.set(titles);    }   
 public void setDate(String dates){date.set(dates);    }   
 public void setData(String datas){data.set(datas);    }   
    
    
    
}
