class Account {
  private long acc_no;
  private String name;
  private String email;
  private float ammount;

  public long getAcc_no() {
    return acc_no;
  }

  public void setAcc_no(long acc_no) {
    this.acc_no = acc_no;
  }
}

public class _01_Encapsulation {
  public static void main(String[] args) {

    Account acc = new Account();
    acc.setAcc_no(7884289);
    System.out.println(acc.getAcc_no());
    ;
  }
}
