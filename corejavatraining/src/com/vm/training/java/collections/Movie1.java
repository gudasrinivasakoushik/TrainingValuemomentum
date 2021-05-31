package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1>
{
private double rating;
private String name;
private int year;

public int compareTo(Movie1 m)
{
return this.year - m.year;
}

public Movie1(double rating, String name, int year) {

this.rating = rating;
this.name = name;
this.year = year;
}

public double getRating() { return rating;}
public String getName() { return name;}
public int getYear(){ return year; }



}




class RatingCompare implements Comparator<Movie1>
{
public int compare(Movie1 m1,Movie1 m2)
{
if(m1.getRating() < m2.getRating())  return -1;
if(m1.getRating() > m2.getRating())  return -1;
else return 0;
}
}

class NameCompare implements Comparator<Movie1>
{
public int compare(Movie1 m1,Movie1 m2)
{
return m1.getName().compareTo(m1.getName());
}
}