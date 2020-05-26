package academy.learnprogramming;

        public class Main {

            public static void main(String[] args) {
                int beerNum = 99;
                String word = "бутылок (бутылки)";

                System.out.println(beerNum + " " + word + " пива на стене");

                while (beerNum > 0) {

                    if (beerNum == 1) {
                        word = "бытылка"; // в единсвенном числе - ОДНА БУТЫЛКА
                    }
                    System.out.println(beerNum + " " + word + " пива на стене");
                    System.out.println("Возьми одну.");
                    System.out.println("Пусти по кругу.");
                    beerNum = beerNum - 1;
                    if (beerNum > 0) {
                        System.out.println(beerNum + " " + word + "  пива на стене");
                    }
                }
            }
        }

//        99 bottles of beer on the wall, 99 bottles of beer.
//        Take one down and pass it around, 98 bottles of beer on the wall.

//        98 bottles of beer on the wall, 98 bottles of beer.
//        Take one down and pass it around, 97 bottles of beer on the wall.

//        97 bottles of beer on the wall, 97 bottles of beer.
//        Take one down and pass it around, 96 bottles of beer on the wall.