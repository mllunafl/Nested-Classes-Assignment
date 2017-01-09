package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class Widget {

    private String name;
    private String type;
    private int id;
    private List<Attachment> attachmentList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }


    @Override
    public String toString() {
        return "Widget{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", attachmentList=" + attachmentList +
                '}';
    }

    public static class Attachment{
        private String name;
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Attachment{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }


}
