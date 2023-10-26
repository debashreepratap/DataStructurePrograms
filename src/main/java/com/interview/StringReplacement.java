package com.interview;
class StringReplacement {
    public static void main(String[] args) {
        String original = "hello there {0} {2} you {1}...";
        String[] replacements = {"how", "doing", "are"};
        System.out.println(replceStringByIndex(original, replacements));
    }
    private static String replceStringByIndex(String original, String[] replacements) {
    String[] originalArr = original.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < originalArr.length; i++) {
            if (originalArr[i].charAt(0) == '{' && originalArr[i].charAt(1) != '{') {
                int x= Character.getNumericValue(originalArr[i].charAt(1));
                sb.append(replacements[x]).append(originalArr[i].substring(3)).append(" ");
            } else if (originalArr[i].charAt(0) == '{' && originalArr[i].charAt(1) == '{') {
              sb.append(originalArr[i].substring(1)).append(" ");
            } else {
               sb.append(originalArr[i]).append(" ");
            }
        }
        return sb.toString();
    }
}