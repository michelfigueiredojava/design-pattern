package com.michelfigueiredo.designpattern.behavioural.command.file;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;
         
    @Override
    public String execute() {
        return textFile.save();
    }
}
