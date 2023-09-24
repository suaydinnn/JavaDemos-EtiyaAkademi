

public class Main {
    public static void main(String[] args) {

        String [] sortingOptions = {"Growing","Decreasing","Best Selling"};
            for (int i = 0 ; i<sortingOptions.length; i++){
                System.out.println("Sorting Options:" + sortingOptions[i]);
            }
            String option = "Growing";
            if (option.equals("Growing")){
                System.out.println("Prices are sorted in ascending order");
            }
            else if (option.equals("Decreasing")){
                System.out.println("Prices are sorted in decreasing order");
            }
            else if (option.equals("Best Selling")){
                System.out.println("Prices are sorted by best selling");
            }
            else {
                System.out.println("Sorting method not selected");
            }
    }
}