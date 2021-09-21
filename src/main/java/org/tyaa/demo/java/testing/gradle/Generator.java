package org.tyaa.demo.java.testing.gradle;

import java.util.ArrayList;
import java.util.List;

public class Generator implements IGenerator {
    @Override
    public List<Character> generate(char startChar, char endChar) {
        char currentCharacter = startChar;
        List<Character> characters = new ArrayList<>();
        while (currentCharacter <= endChar) {
            characters.add(currentCharacter++);
        }
        return characters;
    }
}
