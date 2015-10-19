package com.wpj.wx.daomain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wpj.wx.util.MyDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_listmain")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)//自动忽略空字段
public class TbListmain {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "link")
    private String link;

    @Column(name = "class_name")
    private String className;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;
    private String desc;

    private String img;

    @Column(name = "thumb_addition")
    private String thumbAddition;

    @Column(name = "main_addition")
    private String mainAddition;

    @Column(name = "list_id")
    @JsonIgnore
    private Integer listId;
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className= className;
    }

    /**
     * @return date
     */
    @JsonSerialize(using=MyDateSerializer.class)
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return thumb_addition
     */
    public String getThumbAddition() {
        return thumbAddition;
    }

    /**
     * @param thumbAddition
     */
    public void setThumbAddition(String thumbAddition) {
        this.thumbAddition = thumbAddition;
    }

    /**
     * @return main_addition
     */
    public String getMainAddition() {
        return mainAddition;
    }

    /**
     * @param mainAddition
     */
    public void setMainAddition(String mainAddition) {
        this.mainAddition = mainAddition;
    }

    /**
     * @return list_id
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * @param listId
     */
    public void setListId(Integer listId) {
        this.listId = listId;
    }

    @Override
    public String toString() {
        return "TbListmain{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", className='" + className+ '\'' +
                ", date=" + date +
                ", desc='" + desc + '\'' +
                ", img='" + img + '\'' +
                ", thumbAddition='" + thumbAddition + '\'' +
                ", mainAddition='" + mainAddition + '\'' +
                ", listId=" + listId +
                '}';
    }
}