package com.bank.securewallet.config.uuid.impl;

import com.bank.securewallet.config.uuid.UUIDGenerator;
import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class UUIDGenerateImpl implements UUIDGenerator {
    @Override
    public UUID generateUUID() {
        return Generators.timeBasedGenerator().generate();
    }
}
