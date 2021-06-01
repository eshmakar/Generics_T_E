package com.test;

public class Generics {
    public static void main(String[] args) {
        Info<String, String> stringInfo = new Info<>("Hello", "Hi");
        System.out.println(stringInfo);

        Info<Integer, Integer> integerInfo = new Info<>(100, 50); //можно также использовать другие типы, как Integer например
        System.out.println(integerInfo);
    }
}

class Info<T, E> { //здесь вместо T, E можно писать любую букву, слово. Т, E означает, что в дальнейшем будем использоваться какие-то типы String, String либо String, Integer, либо Integer, Integer и т.д.
    private T value;//первый параметр будет называтся value
    private E value2;//второй параметр будет называтся value2
    Info(T value, E value2){
        this.value=value; this.value2=value2;
    }//и здесь тоже на String value
    public String toString(){
        return "(( " + value + " )) (( " + value2 + " ))";
    }
}
/*
OUTPUT:
(( Hello )) (( Hi ))
(( 100 )) (( 50 ))
*/
