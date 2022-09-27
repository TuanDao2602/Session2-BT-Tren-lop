import java.util.Scanner;

public class thongTinSinhVien {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//
        String name = "";
        String maSv="";
        int age=0;
        String sex="";
        String email="";
        int soDienThoai=0;
        String address="";
        int tuoi=0;
        int namHienTai=2022;
        do {
            System.out.println("****************Menu****************");
            System.out.println("1 Nhập thông tin sinh viên");
            System.out.println("2 Hiển thị thông tin sinh viên");
            System.out.println("3 Tỉnh tuổi sinh viên");
            System.out.println("4 Thoát");
            System.out.print("Sự lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("nhập vào tên của sinh viên ");
                     name += scanner.nextLine();
                    System.out.println("nhập vào mã sinh viên ");
                    maSv +=scanner.nextLine();
                    System.out.println("nhập vào năm sinh của sinh viên");
                    age += scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập vào giới tính của sinh viên");
                     sex += scanner.nextLine();

                    System.out.println("nhập vào email của sinh viên");
                     email += scanner.nextLine();
                    System.out.println("nhập vào số điện thoại của sinh viên ");
                    soDienThoai += scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập vào địa chỉ sinh viên");
                     address +=scanner.nextLine();



                    break;
                case 2:
                    System.out.printf("tên sinh viên là: %s\n",name);
                    System.out.printf("mã sinh viên là: %s\n",maSv);
                    System.out.printf("Năm sinh sinh viên là: %d\n",age);
                    System.out.printf("giới tính sinh viên là: %s\n",sex);
                    System.out.printf("email sinh viên là: %s\n",email);
                    System.out.printf("số điện thoại sinh viên là: %d\n",soDienThoai);
                    System.out.printf("địa chỉ sinh viên là: %s\n",address);
                    break;
                case 3:
                    tuoi += namHienTai-age;
                    System.out.printf("tuổi của sinh viên là %d\n",tuoi);
                    break;
                case 4:
                    System.exit(0);

            }
        }while (true);
    }
}
