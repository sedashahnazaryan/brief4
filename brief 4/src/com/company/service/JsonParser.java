package com.company.service;

import com.company.model.People;

public interface JsonParser {

    String parseToJsonAndWriteInFile(People...օ);
    Object parseFromJson(String jsonStr, Class c);
}
