package org.example;

public class Main {
    public static void main(String[] args) {

        String a = "Sentinals Of Light";
        String b = "gaia's Vengence";
        String c = " is the best vandal skin";
        String e = "";
        String f = "Tenz Tenz";
        String g = "Are mereko laga tha re, Mereko hamesha laga hota hai";
        String name = "ARyAn raJ";
        String h =  "    Centrally Alligned               ";







        //CharAt()
        System.out.println(a.charAt(6));




        //compareTo()
        System.out.println(a.compareTo(b));
        //Can be Used to arrange names in a certain pattern




        //compareToIgnoreCase()
        System.out.println(a.compareToIgnoreCase(b));




        //concat()
        String d = a.concat(c);
        System.out.println(d);
        //Used to combine 2 strings




        //contains()
        System.out.println(d.contains("vandal"));
        //gives out a boolean expression
        //Can be used for searches




        //containsEquals()
        System.out.println(d.contains("vandle"));
        //Can be used for checking spellings




        //endsWith()
        System.out.println(d.endsWith("skin"));
        //Search but backwards ?????????




        //equals()
        System.out.println(a.equals("Sentinal Tenz"));
        //Detection of duplicates




        //EqualsIgnoreCase()
        System.out.println(a.equalsIgnoreCase("sentinals Of LIGht"));
        //Detection of duplicates despite of case




        //indexOf()
        System.out.println(a.indexOf("ight"));
        //More Searches




        //isEmpty()
        System.out.println(a.isEmpty());
        System.out.println(e.isEmpty());
        //Can be used for detection of empty text files




        //lastIndexOf()
        System.out.println(a.lastIndexOf("i"));




        //length()
        System.out.println(d.length());





        //replace()  replaceFirst()  replaceAll()
        System.out.println(d.replace("vandal","operator"));

        System.out.println(f.replaceFirst("Tenz","Sen"));

        System.out.println(g.replaceAll("laga","pata"));
        //Correction over a large text





        //startsWith()
        System.out.println(a.startsWith("Sen"));




        //toCharArray
        System.out.println(a.toCharArray());





        //toLowerCase()   toUpperCase()
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());




        System.out.println(h.trim());



        //Doubts:  copyValueOf()      format()      lastIndexOf()       matches()      regionMatches()
        //Doubts:  split()       subSequence()        sunString()       toString()





    }
}