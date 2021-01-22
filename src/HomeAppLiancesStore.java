package com.company;


class HomeAppLiancesStore{



    int x;
    String name;
    String address;
    public static int setX(int x) {

        return x;
    }

    public static String setName(String name) {

        return name;
    }
    public static String setAddress(String address) {

        return address;
    }

    public static void main (String[]args ){

        // write your code here

        String name=setName(args[0]);
        String addres=setAddress(args[1]);

        try{
            int x=setX(Integer.parseInt(args[2]));
            System.out.println( "oi employee einai:" + x);
        }
        catch(Exception e){
            System.out.println("Min apodekto  parametron eisosou");
            int x=0;
        }

        try{
            System.out.println(name);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(addres);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(args[2]);

        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }





    }





}
