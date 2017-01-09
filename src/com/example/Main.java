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
    }

    interface Foo {
        boolean bar (String in);
    }
}
