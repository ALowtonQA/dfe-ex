package com.qa.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
	
    private List<? super Shape> list;

    public void add(List<? super Shape> list) {
        this.list = list;
    }

    public List<? super Shape> get() {
        return list;
    }
    
    public static void main(String[] args) {
		LowerBound lb = new LowerBound();
		List<Shape> shapes = new ArrayList<>();
		
		lb.add(shapes);
		
		List<String> strings = new ArrayList<>();
		
//		This won't compile, because String is not a superclass of Shape and our rule is <? super Shape>
//		lb.add(strings);

		List<Object> objects = new ArrayList<>();
		
		lb.add(objects);
	}
}
