package com.wpj.wx.daomain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Table(name = "tb_menu")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)//自动忽略空字段
public class TbMenu {
    @Id
    @Column(name = "Menu_Id")
    @JsonIgnore
    private Integer menuId;
    @Column(name = "html_id")
    private String id;
    @Column(name = "class_Name")
    private String className;
    private String theme;
    @Column(name = "cols")
    private Integer cols;
    @Column(name = "offCanvasFlip")
    private boolean offcanvasflip;
    @JsonIgnore
    private String menu_Name;
    @Transient
    private List<TbMenuitem> content;
    @Transient
    private Map<String,Object> options;

    public Map<String, Object> getOptions() {
      Map<String,Object> option=new   HashMap<String,Object>();
        if(this.cols!=null){
            option.put("cols",this.cols);
        }

        this.options=option;
        return options;
    }

    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public boolean getOffcanvasflip() {
        return offcanvasflip;
    }

    public void setOffcanvasflip(boolean offcanvasflip) {
        this.offcanvasflip = offcanvasflip;
    }

    public String getMenu_Name() {
        return menu_Name;
    }

    public void setMenu_Name(String menu_Name) {
        this.menu_Name = menu_Name;
    }

    public List<TbMenuitem> getContent() {
        return content;
    }

    public void setContent(List<TbMenuitem> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TbMenu{" +
                "menuId=" + menuId +
                ", id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", theme='" + theme + '\'' +
                ", cols=" + cols +
                ", offcanvasflip=" + offcanvasflip +
                ", menu_Name='" + menu_Name + '\'' +
                ", content=" + content +
                ", options=" + options +
                '}';
    }
}