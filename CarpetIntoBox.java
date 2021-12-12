// Given a carpet of size a * b [length * breadth] and a box of size c * d, one has to fit the carpet in the box in the minimum number of moves. A move is to fold the carpet in half, either by length or breadth.

// One can even turn the carpet by 90 degrees any number of times, won’t be counted as a move.

// Example: Box = 6 * 10 Carpet = 8 * 12

// Output: No of moves = 1

// Fold the carpet by breadth, 12/2 so now carpet is 6*8 and can fit fine.



class CarpetIntoBox {
    public static int carpetIntoBox(int A, int B, int C, int D){
        int c1 = 0,c2 =0;
        int aa = A, bb = B, cc = C, dd = D;

        while(A>C||B>D){
            if(A>C){
            A/=2;
        }else{
            B/=2;
        }
        c1++;
    }

    while(aa>dd||bb>cc){
        if(aa>dd){
        aa/=2;
    }else{
        bb/=2;
    }
    c2++;
}

        return Math.min(c1,c2);
    }
    
    public static void main(String[] args) {
        System.out.println(carpetIntoBox(8,13,6,10));
    }
}