package oop;

public class Book {

    //Field
    public String title;
    public String author;
    private int numberOfPages;

    public void setNumberOfPages(int numberOfPages) {

        if (isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else {
            System.out.println("THe provided number of pages is incorrect " + numberOfPages);
        }

    }

    private boolean isNumberOfPagesCorrect (int numberOfPages){
        return numberOfPages >= 10;
    }

    public void printBookInfo(){
        System.out.printf("The book %s with author %s has %d pages\n",title,author,numberOfPages);
    }

}
