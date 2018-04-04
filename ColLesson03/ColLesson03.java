import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        final int max_size = 5;

        Word[] words = new Word[max_size];

        System.out.println("わからない単語とその意味をスペースを区切って入力してください。");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while(!input.equals("e")){
            if(index > max_size){
                System.out.println("登録制限を超えました。登録済みデータは以下になります。");
                break;
            }
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0],tmp[1]);
            words[index] = wd;
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
        }
        for(int i = 0;i < index; i++){
            System.out.println("単語：" + words[i].getWord() + " 日本語：" + words[i].getMeaning());
        }
        System.out.println(index + "件、登録しました。");
    }
}
