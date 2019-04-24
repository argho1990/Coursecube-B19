class EFL {

  public static void main(String args[]) {
    int bucky[] = { 3, 4, 5, 6, 7 };

    int total = 0;

    // Enhanced For Loop:
    // Its kind of a For Loop but its different in a couple of ways.
    // Instead of taking three options
    // [for (int i = 0; i < d.length; i++) {}],it only takes 2 different things
    // that it needs in the parameters or parenthesis.
    // The first it needs is a type of data and an identifier
    // [type-->int, identifier -->x]
    // A kind of [counter variable] in your [regular-forloops],but its kind of
    // different,
    // What x is? Its going to store the values in the array,
    // as it is looping through your array.
    // So the first time its going to start with 3 then 4,5,6,7.

    for (int x : bucky) {
      total += x;
    }

    System.out.println(total);
  }

}