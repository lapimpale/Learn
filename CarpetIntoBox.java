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