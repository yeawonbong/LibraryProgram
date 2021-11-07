import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LibraryProgram() {
	private final int MAX_BOOK_LENGTH = 10;
    Book [] BookList = new Book[MAX_BOOK_LENGTH];
    int BookLength = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() {
        while (true) {
            int input = -1;
            System.out.println("----------------------");
            System.out.println("원하시는 동작을 입력해주세요.");
            System.out.println("1. new Book");
            System.out.println("2. delete Book");
            System.out.println("3. search Book");
            System.out.println("4. print Book info");
            System.out.println("0. Quit");
            System.out.println("Input : ");

            try {
                input = Integer.valueOf(br.readLine());
            } catch (Exception e) {
                System.out.println("ERROR!!");
                continue;
            }

            switch(input) {
                case 1:
                    newBook();
                    break;
                case 2 :
                    deleteBook();
                    break;
                case 3 :
                    searchBook();
                    break;
                case 4 :
                    printBook();
                    break;
                case 0 :
                    System.out.println("Quit Library Program...");
                    return;
                default:
                    System.out.println("ERROR: Invalid Input");
            }
        }
    }

    public void newBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("추가할 도서의 정보를 입력해주세요.");
        System.out.println("도서 제목: ");
        /*
        0. 리스트 수 검사해서 배열크기보다 크지 않은 지 예외 처리
        1. 버퍼로 받아서 유효성 검사
        2. 그 다음에 new Book 리스트에 추가해서 버퍼 정보 넣기
        3. 중복 검사
        * */


    }
    public void deleteBook() {

    }
    public void searchBook() {

    }
    public void printBook() {

    }
}