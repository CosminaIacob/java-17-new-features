package com.example.java17.randomGenerator.java;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class PRNG {

    // returns an InputStream with size @streamSize
    // of random numbers generated using the @algorithm
    // where the lower bound is 0 and the upper is 100
    public static IntStream getPseudoInts(String algorithm, int streamSize) {
        return RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 0, 100);
    }

    public static void main(String[] args) {
        IntStream pseudoInts = getPseudoInts("L64X128StarStarRandom", 5);
        pseudoInts.forEach(System.out::println);

        // generates all the Java 17 algorithms
        RandomGeneratorFactory.all()
                .map(fac -> fac.group() + " : " + fac.name())
                .sorted()
                .forEach(System.out::println);
    }
}
