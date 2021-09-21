package org.tyaa.demo.java.testing.gradle.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.tyaa.demo.java.testing.gradle.Generator;
import org.tyaa.demo.java.testing.gradle.IGenerator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class GeneratorTest {

    private Generator generator;

    @BeforeAll
    public void setupTest() {
        generator = new Generator();
    }

    @Mock
    private IGenerator generatorMock;

    @Test
    public void givenGeneratorMock_whenGenerateCalled_thenCorrectStringGenerated () {
        given(generatorMock.generate('B', 'E'))
            .willReturn(new char[]{'B', 'C', 'D', 'E'});
        assertArrayEquals(new char[]{'B', 'C', 'D', 'E'}, generatorMock.generate('B', 'E'));
    }

    @Test
    public void givenGenerator_whenGenerateCalled_thenCorrectStringGenerated () {
        assertArrayEquals(new char[]{'B', 'C', 'D', 'E'}, generator.generate('B', 'E'));
    }
}
