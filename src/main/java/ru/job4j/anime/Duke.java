package ru.job4j.anime;
/******************************************************************************
     * Compilation: javac Duke.java
     * Execution: java Duke
     * Dependencies: StdDraw.java StdIn.java
     *
     * Draw the sequence of images T1.gif to T17.gif. This creates
     * the illusion of motion, where the Java mascot Duke cart-wheels
     * across the screen.
     *
     * Reference: http://java.sun.com/docs/books/tutorial/uiswing/components/example-1dot4/index.html#TumbleItem
     *
     ******************************************************************************/

    public class Duke {
        public static void main(String[] args) {
            int images = 17; // number of images
            int WIDTH = 130, HEIGHT = 80; // images are 130-by-80
         /**   StdDraw stdDraw = new StdDraw();
            stdDraw.setCanvas(500,500);
            StdDraw.setCanvasSize(WIDTH, HEIGHT);
            StdDraw.setXscale(0, WIDTH);
            StdDraw.setYscale(0, HEIGHT);
            StdDraw.enableDoubleBuffering();

            // main animation loop
            for (int t = 0; true; t++) {
                int i = 1 + (t % images);
                String filename = "T" + i + ".gif"; // name of the ith image
                StdDraw.picture(WIDTH/2.0, HEIGHT/2.0, filename);
                StdDraw.show();
                StdDraw.pause(100);
            }*/
        }
    }

