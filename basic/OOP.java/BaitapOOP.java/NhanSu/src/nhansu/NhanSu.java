package nhansu;
import java.util.Scanner;

public class NhanSu {
    String fullname;
    double salary;
    static int count = 0;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        fullname = sc.nextLine();
        System.out.print(" Luong: ");
        salary = sc.nextDouble();
    }
    public void output(){
        System.out.println(" Ho ten: " + fullname + " - Luong: " + salary + " - Thu Nhap: " + getIncome());
    }
    public NhanSu(){
        this.fullname = "";
        this.salary = 0;
    }
    public NhanSu(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
    public void giveBonus(double ...monney){
        for(int i = 0; i < monney.length; i++){
            this.salary += monney[i];
        }
    }
    public double getIncomeTax(){
        if(salary <= 500){
            return 0;
        } 
        return salary * 10 / 100;
    }
    void setInfo(String name, double salary){
        this.fullname = name;
        this.salary = salary;
    }
    double getSalary(){
        return this.salary;
    }
    double getIncome(){
        return this.salary - this.getIncomeTax();
    }  
    public void setsalary(double salayry){
        if(salary <0){
            System.out.println("luong khong hop le:");
            return;
        }else{
            this.salary = salary;
        }
        
    }
    public void setname(String fullname){
        if(fullname !=null ||!fullname.isEmpty()){
            return ;
        }
        this.fullname= fullname;    
    }
    public String getname(){
        return this.fullname;
    }
    public double setsalary(){
        return this.salary;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N = ");
        int N = sc.nextInt();
        NhanSu arr[] = new NhanSu[N];
        for(int i = 0; i < N; i++){
            arr[i] = new NhanSu();
            count++; 
        }
        System.out.println("Nhap danh sach nhan su:");
        for(int i = 0; i < N; i++){
            arr[i].input();
        }
        System.out.println("Danh sach nhan vien da nhap:");
        for(int i = 0; i < N; i++){
            arr[i].output();
        }
        System.out.println("Danh sach nhan vien co ho Tran hoac ten Hoa:");
        System.out.println("Danh sach nhan vien theo thu tu luong >= 600:");
        luongtusautram(arr);
        System.out.println("Danh sach nhien vien da duoc sap xep theo alphabe:");
        sapxep(arr);
        System.out.println("Thu nhap binh quan cua can bo trong cong ty la: " + tbThuNhap(arr));
        System.out.println("Danh sach nhan vien tang dan theo luong:");
        boolean val = true;
        sortBySalary(arr, val);
        for(int i = 0; i < N; i++){
            arr[i].output();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].salary <= 1000){
                addSalary(arr[i], 200);
            }
        }
        /*System.out.println("Danh sach nhan vien sau khi tang luong cho nhung nhan vien co luong duoi 1000:");
        for(int i = 0; i < N; i++){
            arr[i].output();
        }*/
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getIncomeTax() == 0){
                arr[i].giveBonus(1000);
            }
        }
        System.out.println("Them tien thuong: ");
        for(int i = 0; i < arr.length; i++){
            arr[i].output();
        }
    }
    static void addSalary(NhanSu arr, double tmp){
        arr.salary += tmp;
    }
    static void sortBySalary(NhanSu arr[], boolean order){
        if(order == true){
            for(int i = 0; i < arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i].salary > arr[j].salary){
                        NhanSu tam = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tam;
                    }
                }
            }
        }
        else{
            for(int i = 0; i < arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i].salary < arr[j].salary){
                        NhanSu tam = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tam;
                    }
                }
            }
        }
    }
    static void nvTranHoa(NhanSu arr[]){
        for(int i = 0; i < arr.length; i++){
            String n[] = arr[i].fullname.split(" ");
            if(n[0].toLowerCase().startsWith("tran") || n[n.length-1].toLowerCase().endsWith("hoa")){
                arr[i].output();
            }
        }
    }
    static void luongtusautram(NhanSu arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].salary >= 600){
                arr[i].output();
            }
        }
    }
    static void sapxep(NhanSu arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                String tam[] = arr[i].fullname.split(" ");
                String tmp[] = arr[j].fullname.split(" ");
                if(tam[0].compareTo(tmp[0]) > 0){
                    NhanSu u = arr[i];
                    arr[i] = arr[j];
                    arr[j] = u;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i].output();
        }
    }
    static double tbThuNhap(NhanSu arr[]){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i].getIncome();
        }
        return sum/arr.length;
    }
}