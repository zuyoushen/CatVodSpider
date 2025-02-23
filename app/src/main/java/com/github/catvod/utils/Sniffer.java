package com.github.catvod.utils;

import java.util.regex.Pattern;

public class Sniffer {

    public static final Pattern RULE = Pattern.compile(
                    "http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a)\\?.*|" +
                    "http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a)|" +
                    "http((?!http).)*?xg.php\\?id=|" +
                    "http((?!http).)*?video/tos*"
    );
}
