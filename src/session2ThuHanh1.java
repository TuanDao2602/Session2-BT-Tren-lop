import java.util.Scanner;

public class session2ThuHanh1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập vào số nguyên n: ");
        int n = Integer.parseInt(sc.nextLine());
        int sum;
        boolean check;
        do {
            System.out.println("****************Menu****************");
            System.out.println("1 In ra các số chẵn và tính tổng trong khoảng 0..n");
            System.out.println("2 In ra các số lẻ và tính tổng trong khoảng 0..n");
            System.out.println("3 Kiểm tra n có phải số nguyên tố không");
            System.out.println("4 Kiểm tra xem n có phải số hoàn hảo không");
            System.out.println("5 In ra các số nguyên tố trong khoảng 0...n");
            System.out.println("6 In ra các ước số và tính tổng");
            System.out.println("7 Thoát");
            System.out.print("Sự lựa chọn của bạn là: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                     sum=0;
                    //in ra các số chan tu 1 den n
                    System.out.printf("các số chẵn trong khoảng 1... %d là: \n",n);
                    for (int i=0;i<n;i++){
                        if (i%2==0){
                            System.out.printf("%d\t",i);
                            sum+=i;
                        }

                    }
                    System.out.printf("\n tổng các số chẵn là %d\n",sum);
                    break;
                case 2:
                    sum=0;
                    System.out.printf(" các số lẻ trong khoảng 1 ...%d là: \n",n);
                    for (int i=0;i<=n;i++){
                        if (i%2==1){
                            System.out.printf("%d\t",i);
                            sum += i;
                        }
                    }
                    System.out.printf("\n tổng các số chẵn là %d\n",sum);
                    break;
                case 3:
                    if (n>=2){
                        check=false;
                        for (int i=2;i<= Math.sqrt(n);i++){
                            if (n % i==0){
                                check=true;
                                break;
                            }
                        }if (check){
                            System.out.printf("%d không phải là số nguyên tố \n",n);

                        }else {
                            System.out.printf("%d là số nguyên tố \n",n);
                        }


                    }else {
                        System.out.printf("%d không phải là số nguyên tố\n",n);
                    }
                    break;
                case 4:
                    sum=0;
                    for (int i=1;i<n;i++){
                        if (n%i==0){
                            sum+=i;
                        }
                    }
                    if (sum==n){
                        System.out.printf("%d là số hoàn hảo\n",n);
                    }else {
                        System.out.printf("%d khoong phải là số hoàn hảo\n",n);
                    }
                    break;
                case 5:
                    if (n>=2){
                        System.out.printf("Cac so nguyen to tu 0 den %d la: \n",n);
                        for (int i = 2; i <=n ; i++) {
                            //Kiem tra i co phai la so nguyen to hay khong?
                            check = false;
                            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                                if(i%j==0){
                                    //j la uoc cua i
                                    check = true;
                                    break;
                                }
                            }
                            if(!check){
                                //i la so nguyen to
                                System.out.printf("%d\t",i);
                            }
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 6:
                    sum=0;
                    System.out.printf("các uoc số của %d là: ",n);
                    for (int i=1;i<=n;i++){
                        if (n%i==0){
                            System.out.printf("%d\t",i);
                            sum +=i;
                        }
                    }
                    System.out.printf("\n tổng các ước của %d là: %d\n",n,sum);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-7");

            }
        }while (true);
    }
}
