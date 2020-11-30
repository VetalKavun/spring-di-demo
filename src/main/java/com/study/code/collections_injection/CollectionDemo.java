package com.study.code.collections_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

    private Set<String> setOfStrings;
    private List<String> listOfStrings;
    private Map<String, String> mapOfStrings;

    public void setSetOfStrings(Set<String> setOfStrings) {
        this.setOfStrings = setOfStrings;
    }

    public void setListOfStrings(List<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public void setMapOfStrings(Map<String, String> mapOfStrings) {
        this.mapOfStrings = mapOfStrings;
    }

    public Set<String> getSetOfStrings() {
        return setOfStrings;
    }

    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    public Map<String, String> getMapOfStrings() {
        return mapOfStrings;
    }
}
