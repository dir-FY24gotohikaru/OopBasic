package company;

public class Employee {
    // フィールド
    String name;
    String department;
    String position;
    int employeeId;
    //フィールドはクラス定義 public class Employee { ... } の中に書きます。

    // コンストラクター
    public Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    //this. はインスタンスを表しています。これはコンストラクターの引数と区別するために用いられます。
    //コンストラクターはインスタンスの初期化を行うメソッドです

    // 報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }
    //ここではインスタンスメソッドを定義しています
    /* report() メソッドでは、インスタンスフィールドを使用して、
     文字列をコンソールに出力する処理を記述しています
     */

    // 報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }

}
