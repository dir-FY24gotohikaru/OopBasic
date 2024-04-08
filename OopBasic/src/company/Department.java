package company;

public class Department {
    private final String name;
    private final String departmentId;
    private int budget;
    /*フィールド：
name（名前）：部署の名前を表す文字列
departmentId（部署ID）：固有の部署ID
budget（予算）：部署の予算を表す整数*/
    
    /*フィールドにfinalを用いることで
     * フィールドが初期化後に変化されることを防ぐ*/
    /*このように、インスタンスフィールドが不用意に変更されないように
     *することを 不変（Immutability） と呼びます*/

    // コンストラクター
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
        
    }

    // 会議を開催する
    public void meeting() {
        System.out.println("部内会議を開催します。部署：" + name + "、予算：" + budget);
    }

    // nameのgetter
    public String getName() {
        return name;
    }

    // budgetのgetter
    public double getBudget() {
        return budget;
    }

    // budgetのsetter
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        this.budget = budget;
    }

}
