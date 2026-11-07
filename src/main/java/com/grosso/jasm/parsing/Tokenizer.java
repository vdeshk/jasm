package com.grosso.jasm.parsing;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;

@AllArgsConstructor
public class Tokenizer {
    @NonNull
    private final String rawLine;
    @NonNull
    private String mnemonic;
    @NonNull
    private ArrayList<String> args;

    TokenModel tokenize(){
        String trimmedLine = this.rawLine.trim();
        int charIndex = 0;

        //loop to parse mnemonic
        for(int i = 0 ; i < trimmedLine.length() ; i++){
            if(trimmedLine.charAt(i) == ' '){
                mnemonic = trimmedLine.substring(0 , i - 1);
                charIndex = i;
                break;
            }
        }

        //loop to parse args
        for (int i = charIndex ; i < trimmedLine.length() ; i++){
            if(trimmedLine.charAt(i) != ','){
                continue;
            } else{
                args.add(trimmedLine.substring(charIndex , i - 1).trim());
            }
        }

        return new TokenModel(mnemonic , args);
    }
}
