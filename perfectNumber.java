

    // perfect number method
    public static boolean perfectNumber (int num) {
        if ( num<1 ) {
            return false;
        }


        ArrayList<Integer> count = new ArrayList<Integer>();
        for ( int k = 1; k<num; k++ ) {
            if ( num%k == 0 )
            count.add(k);
        }

        int result = 0;
        for ( int a = 0; a<count.size(); a++ ) {
            result += count.get(a);
        }

        System.out.println("result is " + result + " , and number is " + num);
        return result == num;
    }
