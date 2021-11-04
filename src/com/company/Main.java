package com.company;


import java.util.Arrays;

public class Main {

            public static void main(String[] args) {
                double[] word = {3.4, -9.4, 5.8, 5.1, -7.5, 89.1, 54.8, -7.9, 26.8, 71.4, 3.5, -56.3, 76.7, 3.5};
                int trt = 0;
                double utu = 0;
                boolean ljhkj = false;
                for (double tfhnbv : word) {
                    if (tfhnbv < 0) {
                        ljhkj = true;
                    } else {
                        if (ljhkj) {
                            trt++;
                            utu += tfhnbv;

                        }

                    }

                }
                System.out.println(Arrays.toString(word));
                System.out.println(utu/trt);
            }
        }


