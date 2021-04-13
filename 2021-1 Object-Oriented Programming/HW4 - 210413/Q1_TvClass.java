/*
04-01.
main() 메소드를 실행시켰을 때 brand 에서 만든 year 년형 inch 인치 TV 형식으로 출력되도록 TV 클래스를 작성.
*/

class Q1_TvClass {

    private String brand;
    private int year;
    private int inch;

    public Q1_TvClass(String brand, int year, int inch) {
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.print(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }

    
    public static void main(String[] args) {
        Q1_TvClass myTv = new Q1_TvClass("Lg", 2017, 32);
        myTv.show();
    }
} 