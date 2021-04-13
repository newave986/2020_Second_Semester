/*
04-03.
문제의 조건에 맞춰 노래 한 곡을 나타내는 Song 클래스를 작성한다.
*/

class Q3_Song {

    private String title;
    private String artist;
    private int year;
    private String country;

    public Q3_Song() {
    }
    // 기본 생성자

    public Q3_Song(String title, String artist, int year, String country) {
        this.title = title; this.artist = artist; this.year = year; this.country = country;
    }
    // 매개변수로 모든 필드를 초기화하는 생성자

    public void show() {
        System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
    // 노래 정보를 출력하는 show() 메소드

    public static void main(String[] args) {
        Q3_Song mySong = new Q3_Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        mySong.show();
    }
}