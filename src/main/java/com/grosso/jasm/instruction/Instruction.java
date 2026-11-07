package com.grosso.jasm.instruction;

import com.grosso.jasm.parsing.TokenModel;

public interface Instruction {
    public boolean validateToken(TokenModel token);
}
