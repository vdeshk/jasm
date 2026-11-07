package com.grosso.jasm.parsing;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@AllArgsConstructor
public class LineExtractor {
    @NonNull
    private final String filePath;

    ArrayList<String> ExtractLines(){
        ArrayList<String> lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String currentLine;

            //loop stops when current line is null ergo when file is up
            while((currentLine = br.readLine()) != null){
                lines.add(currentLine);
            }
        }
        //catches any kind of exception and prints the stacktrace so that we know for sure what went wrong
        catch (Exception e){
            e.printStackTrace();
        }

        return lines;
    }

}
