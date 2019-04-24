public class Lab568 {

    public static void main(String[] args) {

        System.out.println("Main Started");
        String nm = "";
        try {
            StudentService serv = new StudentService();
            nm = serv.getNameBySid("JLC-088");
            System.out.println("Name:" + nm);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Completed");
    }
}

class EmptySidException extends RuntimeException {
}

class StudentService {

  String getNameBySid(String sid){

    if(sid==null)
      throw new NullPointerException();
    else if(sid.isEmpty())
      throw new EmptySidException();
    else if(sid.equals("JLC-099"));
      return "Srinivas";
    else 
      throw new StudentNotFoundException(sid);
  }
}

class StudentNotFoundException extends RuntimeException {

    StudentNotFoundException(String sid) {

        super(sid);

    }

}
