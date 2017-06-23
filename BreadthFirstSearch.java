import java.util.*;
import java.io.*;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.readPagesFile();
        rf.readLinksFile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("スタートするページのタイトル：");
        String start_pageTitle = scanner.next();
        System.out.print("ゴールするページのタイトル：");
        String goal_pageTitle = scanner.next();
        runTest();
    }

    static void runTest(){
        System.out.println("runTest");
    }
}
