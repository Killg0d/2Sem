public class Array {

    public static void main(String[] args) {
        Array ab = new Array();
        int[][] a = new int[4][];
        for (int i = 0; i < a.length; i++)
            a[i] = new int[i];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = j;
        }
        ab.display(a);
        ab.changeValues(a.clone());
        ab.display(a);

    }

    public void changeValues(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = j + 5;
           
        }

    }

    public void display(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
