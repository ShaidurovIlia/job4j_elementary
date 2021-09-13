package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            return post[post.length - 1] == word[word.length - 1];
        }
        return false;
    }
}

