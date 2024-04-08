package company;
  /*このプログラムは Employee のインスタンスを生成し、
   インスタンスメソッドを呼び出しています*/
public class ObjectSample {

    public static void main(String[] args) {
     // インスタンスの作成
        var employee = new Employee("鈴木", "営業部", "課長", 100);

        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        /*employee.report(); で、
         * 引数のない report() メソッドを呼び出す
         * employee.report(2); で、
         * 引数を持つ report(times) メソッドを呼び出す*/
        
     // 1行空ける
        System.out.println("");

        // インスタンスの作成
        var engineer = new Employee("田中", "開発部", "一般社員", 88);

        // インスタンスメソッドの呼び出し
        engineer.report();

    }

}
