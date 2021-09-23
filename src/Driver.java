class Driver {
  public static void main(String[] args) {
    Example ex = new Example();
    int total = 0;

    while (total < 100) {
      int num = ex.getNums()[0];
      total += num;
    }

    System.out.println(total);

    String myName = "Shauryan";

    if (ex.sameName(myName)) {
      System.out.println("Same Name");
    }
    else {
      System.out.println("Not Same Name");
    }
  }
}

