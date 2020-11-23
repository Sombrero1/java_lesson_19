package ru.mirea;

import ru.mirea.students.Test;
import ru.mirea.students.Student;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shop shop = new Shop();
        shop.buy();//первый пункт





    }


    public static Test iteratSearch(Test[] mass, Test t){
        for (Test g:mass
        ) {
            if(g==t) return g;

        }

        return null;
    }
    public static Test binarSearch(int begin, int end,Test[] mass, Test t){
        int mid=(begin+end)/2;
        if(mass[mid]==t) return mass[mid];
        if(begin==mid||end==mass.length) return null;
        if(t.getiDNumber()<mass[mid].getiDNumber()) return binarSearch(begin,mid, mass, t);
        else {
            return binarSearch(mid, end, mass, t);
        }
    }

}
