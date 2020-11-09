/**
 * Task1_1: 課題内容
 *
 * 本課題では、データ型・文字列の使い方を学んでいきましょう。
 * 問①から問⑧まであります。
 * 指定された型・値・変数名を守って記述してください。
 * 問③,⑦については、コメントを入れてください。
 *
 */
public class Task1_1 {
  public static void main(final String[] args) {
      // ①int型の hogeInt という名前の変数を宣言し、値「50」で初期化
      int hogeInt = 50;
      // ②Stringクラスの hogeString という名前の変数を宣言、値「テスト」で初期化
      String hogeString = "テスト";
      // ③下記の処理について、何をしているのかコメントを記入してください
      //浮動小数点型doubleの変数hogeDoubleを宣言し、0.2を代入している。
      final double hogeDouble = 0.2;
      // ④変数 hogeInt を値「100」で上書き
      hogeInt = 100;
      // ⑤変数 hogeString を値「合格」で上書き
      hogeString = "合格";
      // ⑥変数 hogeInt の値を表示
      System.out.println(hogeInt);
      // ⑦下記の処理について、何をしているのかコメントを記入してください
      //引数として変数hogeStringを指定し、その値を出力している。
      System.out.println(hogeString);
      // ⑧変数 hogeDouble の値を表示
      System.out.println(hogeDouble);
  }
}