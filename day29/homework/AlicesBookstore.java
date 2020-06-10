package day29.homework;

import java.util.HashMap;

public class AlicesBookstore {

    public static int kids = 10;
    public static int recipe = 10;
    public static int novels = 10;
    public static int comics = 10;

    public static void SoldKids(int soldNum){
        kids-=soldNum;
     //   System.out.println("Kids books left: " +kids);
        if(kids<10 && kids >=7 ){
            System.out.println("You R fine " +kids);
        }else if(kids<6 && kids>=4){
            System.out.println("state the book as best seller! " + kids);
        }else if(kids>=1){
            System.out.println("Order More "+ kids);
        }else{
            System.out.println("Pre-Sold ship later, please " + kids);
        }
    }
    public static void soldRecipe(int soldNum){
        recipe-=soldNum;
        System.out.println("Reciepe books left: " +recipe);
    }
    public static void SoldNovels(int soldNum){
        novels-=soldNum;
        System.out.println("Novels books left: " +novels);
    }
    public static void SoldComics(int soldNum){
        comics-=soldNum;
        System.out.println("Comics books left: " +comics);
    }

    public static int moneyEarned(){
 kids*=3;
 recipe*=10;
 novels*=7.55;
 comics*=4.99;
        return 0;
    }


}
