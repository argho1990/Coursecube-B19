public class Lab569 {

    public static void main(String[] args) {

        System.out.println("main() starts");
        try {
            StudentService serv = new StudentService();
            serv.getNameBySid("null");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main ends");
    }
}

class StudentService {

    String getNameBySid(String sid) {

        if (sid == null || sid.isEmpty() || !sid.equals("JLC-099"))
            throw new StudentNotFoundException(sid);
        else
            return "Srinivas";
    }
}

class StudentNotFoundException extends RuntimeException {

    StudentNotFoundException(String sid) {

        super(sid);

    }

}
