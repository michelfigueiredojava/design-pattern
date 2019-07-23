package com.michelfigueiredo.designpattern.behavioural.command.file;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class TextFile {
     
    private String name;

     
    String open() {
        return "Opening file " + name;
    }
     
    String save() {
        return "Saving file " + name;
    }

}
