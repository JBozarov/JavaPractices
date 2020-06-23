// greates common devisor
    public static int greatestCommonDevison(int n1, int n2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int smallest = 0;
        if ( n1<n2 ) {
            smallest = n1;
        } else {
            smallest = n2;
        }

        for ( int i = 1; i<smallest; i++ ) {
            if ( n1%i == 0 && n2%i == 0 ) {
                arr.add(i);
            }
        }

        // doing logic
        int max = arr.get(0);
        for ( int k = 0; k<arr.size(); k++ ) {
            System.out.println("Array list is " + arr.get(k));

            if ( max<arr.get(k) ){
                max = arr.get(k);
            }
        }
        System.out.println("Return of greatestCommonDevison is " + max);
        return max;
    }
