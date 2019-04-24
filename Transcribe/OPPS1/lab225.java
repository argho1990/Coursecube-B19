class Customer{
int cid =0;
String cname = null;
String email = null;
long phone=0;
void show(){
System.out.println(cid + "\t" + cname + "\t" + email + "\t " + phone);
}
}
class lab225{
public static void main(String args[]){
Customer cust = new Customer();
cust.show();
}
} 
