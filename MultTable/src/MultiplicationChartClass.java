public class MultiplicationChartClass implements MultiplicationChartInterface{

    private int numGlobal;

    public MultiplicationChartClass(int num) {
        numGlobal = num;
    }

    @Override
    public void displayChart() {

        System.out.print("X\t|\t");

        for(int y = 1; y <= numGlobal; y++){
            System.out.print(y + "\t");

        }
        System.out.println("");
        System.out.println("----------------------------");

       for(int x = 1;x <= numGlobal;x++){
           System.out.print(x + "\t|\t");
          for(int y = 1; y <= numGlobal; y++){
              System.out.print(x*y + "\t");
          }
          System.out.println("");
       }

    }
}
