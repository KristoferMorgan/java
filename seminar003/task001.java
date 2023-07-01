//1. Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

  public static void main(String[] args) {
        
        
        Integer n = GetNumber("Enter syze array: ");
        ListRandomeNew(n);



    }

    public static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }

    static void ListRandomeNew(int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }
        for (int item : list) {
            System.out.print(item + " ");
        }
        Collections.sort(list);

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.print(col.next() + " ");
        }

    }
    
}