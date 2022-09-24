import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //サウナマップを登録する
        Map<String,String> saunaMap = new HashMap<>();
        saunaMap.put("錦糸町","黄金湯");
        saunaMap.put("船橋","ジートピア");
        saunaMap.put("池袋","かるまる");
        saunaMap.put("本八幡","レインボー");

        //標準入力で駅名を受け取る
        System.out.println("駅名を入力してください。その駅のおすすめのサウナを紹介します。");
        Scanner scanner = new Scanner(System.in);
        String station = scanner.nextLine();

        //登録されていない駅名を受け取った場合、エラーメッセージを表示する
        if(saunaMap.get(station) == null){
            throw new Exception(station + "駅のサウナは登録されていません。");
        }
        //登録されている駅名を受け取った場合、対応するおすすめのサウナを表示する
        System.out.println("おすすめのサウナは" + saunaMap.get(station) + "です。");
    }
}
