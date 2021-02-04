package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        //return true;
//        for (int i = 0; i < post[post.length]; i++) {
//            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;     //(post[post.length - 1] == word[word.length - 1]);
//    }

        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

