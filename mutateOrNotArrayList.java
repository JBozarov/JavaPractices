
    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        //lowercase the first letter, and uppercase the rest of the letters, using streams.  Also, depending on the value of the boolean flag 'mutate',
        // mutate the original animals list, or perform your stream operations on a 'copy' of the animals list.  return the list out of hte function in both cases.
        ArrayList<String> animalsCopy = (ArrayList<String>) animaList.stream().map(a -> {
            String newAnimal;
            newAnimal = a.substring(0, 1).toLowerCase() + a.substring(1).toUpperCase();
            return newAnimal;
        }).collect(Collectors.toList());

        if (mutate) {
            System.out.println("true fired ");
            animaList = animalsCopy;
            return animaList;
        } else {
            System.out.println("false fired ");
            return animalsCopy;
        }
    }
