package com.example;

/**
 * Created by LunaFlores on 1/9/17.
 */
public interface WidgetService {

    int createWidget(String name, String type);

    String listWidgets();

    String getWidge(int id);

    boolean addAttachment(int id, String name, String type);
}
