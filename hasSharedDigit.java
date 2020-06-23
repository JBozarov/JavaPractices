

    // has shared digit method
    
    public static boolean hasSharedDigit( int n1, int n2 ) {
        // let's convert both nums into array so we can loop thru them
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String[] a1 = s1.split("");
        String[] a2 = s2.split("");

        // let's do the logic here we use nested for loop
        boolean result = false;
        for ( int g = 0; g<a1.length; g++ ) {
            for ( int l = 0; l<a2.length; l++ ) {
                if ( a1[g].equals(a2[l]) ) {
                    System.out.println(true);
                    result = true;
                }
            }
        }
        System.out.println(result);
        return result;
    }
