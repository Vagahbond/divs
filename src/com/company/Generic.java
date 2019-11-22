package com.company;

class Generic {

    static int gcd (int x, int y) {
        int greater = Math.max(Math.abs(x), Math.abs(y));
        int smaller = Math.min(Math.abs(x), Math.abs(y));
        if (smaller == 0 && greater != 0) {
            return greater;
        }
        else if (greater == 0) {
            return  1;
        }
        else{
            return   gcd(smaller, greater - smaller);
        }

    }
}
