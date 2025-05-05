package com.znaji.method.staticMembers;

public class Snake {

    public static int hiss = 0;

    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.hiss = 1;
        System.out.println(snake.hiss);

        snake = null;// eben though this ref is null, java actually uses the type to get static value not the ref itself.
        System.out.println(snake.hiss);// eben though this ref is null, java actually uses the type to get static value not the ref itself.
    }
}
