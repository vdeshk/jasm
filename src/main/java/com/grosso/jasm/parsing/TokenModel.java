package com.grosso.jasm.parsing;

import lombok.NonNull;

import java.util.ArrayList;

public record TokenModel(@NonNull  String mnemonic , @NonNull ArrayList<String> args) {}
