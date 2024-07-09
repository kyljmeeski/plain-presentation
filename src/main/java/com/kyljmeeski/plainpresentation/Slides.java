package com.kyljmeeski.plainpresentation;

public interface Slides {

    Iterable<Slide> iterate();

    void add(Slide slide);

    void delete(Slide slide);

}
