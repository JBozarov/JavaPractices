    public static String allFactors (int n) {
        if (n<1) return "Invalid Value";
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for ( int i = 1; i<n; i++ ) {
            if ( n%i == 0 ) {
                factors.add(i);
            }
        }

        for ( int k = 0; k<factors.size(); k++ ) {
            System.out.println("Factors are " + factors.get(k));
        }
        return null;
    }
