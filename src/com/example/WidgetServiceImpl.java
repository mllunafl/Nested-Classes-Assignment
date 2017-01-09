package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class WidgetServiceImpl implements WidgetService {

    Map<Integer, Widget> widgetMap = new HashMap<>();

    @Override
    public int createWidget(String name, String type) {
        Widget widget = new Widget();
        widget.setName(name);
        widget.setType(type);
        int id = widgetMap.size() + 1;
        widget.setId(id);
        widgetMap.put(id, widget);
        return widget.getId();
    }

    @Override
    public String listWidgets() {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(widgetMap.values());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String getWidge(int id) {
        ObjectMapper mapper = new ObjectMapper();
        String json= null;
        try {
            json = mapper.writeValueAsString(widgetMap.get(id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }

    @Override
    public boolean addAttachment(int id, String name, String type) {
        Widget widget = widgetMap.get(id);
        if (widget == null){
            return false;
        } else {
            Widget.Attachment attachment = new Widget.Attachment();
            attachment.setName(name);
            attachment.setType(type);
            widget.getAttachmentList().add(attachment);
            return true;
        }
    }
}
