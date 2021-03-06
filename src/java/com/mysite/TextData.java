/* CheckBoxData.java */
package com.mysite;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value="textData")
@RequestScoped

public class TextData implements Serializable{
    
    private String readOnlyTextData="This text is readonly.";
    private String muteableTextdata="This text can be changed.";
    private String passworddata="password";
    private String textAreadata="Everything is awesome!";
    
    public String getReadOnlyTextData(){
        return readOnlyTextData;
    }
    
    public void setReadOnlyTextData(String readOnlyTextData){
        this.readOnlyTextData=readOnlyTextData;
    }
    
    public String getMuteableTextdata(){
        return muteableTextdata;
    }
    
    public void setMuteableTextdata(String muteableTextdata){
        this.muteableTextdata=muteableTextdata;
    }
    
    public String getPassworddata(){
        return passworddata;
    }
    
    public void setPassworddata(String passworddata){
        this.passworddata=passworddata;
    }
    
    public String getTextAreadata(){
        return textAreadata;
    }
    
    public void setTextAreadata(String textAreadata){
        this.textAreadata=textAreadata;
    }
    
    public void setTextAreadataAction(String textAreadata){
        this.textAreadata=textAreadata;
    }
}