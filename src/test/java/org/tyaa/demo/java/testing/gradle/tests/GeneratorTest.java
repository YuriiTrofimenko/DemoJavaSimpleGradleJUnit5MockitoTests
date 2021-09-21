package org.tyaa.demo.java.testing.gradle.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.tyaa.demo.java.testing.gradle.Generator;
import org.tyaa.demo.java.testing.gradle.IGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class GeneratorTest {

    private static Generator generator;

    @BeforeAll
    public static void setupTest() {
        generator = new Generator();
    }

    @Mock
    private IGenerator generatorMock;

    @Test
    public void givenGeneratorMock_whenGenerateCalled_thenCorrectStringGenerated () {
        given(generatorMock.generate('B', 'E'))
            .willReturn(List.of('B', 'C', 'D', 'E'));
        assertArrayEquals(List.of('B', 'C', 'D', 'E').toArray(), generatorMock.generate('B', 'E').toArray());
    }

    @Test
    public void givenGenerator_whenGenerateCalled_thenCorrectStringGenerated () {
        assertArrayEquals(List.of('B', 'C', 'D', 'E').toArray(), generator.generate('B', 'E').toArray());
    }
}
