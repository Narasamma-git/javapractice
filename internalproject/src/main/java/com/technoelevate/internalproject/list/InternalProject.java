package com.technoelevate.internalproject.list;

import java.util.*;

public class InternalProject {
 private List<String> list;
 private List<String> data1;
 private List<String> data2;
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public List<String> getData1() {
	return data1;
}
public void setData1(List<String> data1) {
	this.data1 = data1;
}
public List<String> getData2() {
	return data2;
}
public void setData2(List<String> data2) {
	this.data2 = data2;
}
@Override
public String toString() {
	return "InternalProject [list=" + list + ", data1=" + data1 + ", data2=" + data2 + "]";
}
public InternalProject() {
	super();
	// TODO Auto-generated constructor stub
}
 
 

}

