package com.example;

public class Main {

    public static void main(String[] args) {
	    Foo foo = new Foo() {
            @Override
            public boolean bar(String in) {
                if (in == null){
                    return false;
                }
                if (in.trim().isEmpty()){
                    return true;
                }
                if (!in.isEmpty()){
                    return false;
                }
                return true;
            }
        };

	    String in = null;

        System.out.println(foo.bar("Hello"));
        System.out.println(foo.bar(""));
        System.out.println(foo.bar("    "));
        System.out.println(foo.bar(in));

        WidgetServiceImpl widget = new WidgetServiceImpl();
        System.out.println( widget.createWidget("Widget Name","Best Type"));
        System.out.println(widget.createWidget("More Widgets","So-so Type"));
        System.out.println(widget.addAttachment(2,"All Atchments","Epic"));
        System.out.println(widget.addAttachment(1,"Widget Attachment","Awesome Attachment"));
        System.out.println(widget.getWidge(1));
        System.out.println(widget.listWidgets());
    }

    interface Foo {
        boolean bar (String in);
    }



}
