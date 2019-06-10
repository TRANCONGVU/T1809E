package asgnment_5;

import java.util.Scanner;

public class dangky extends user{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void nhapthongtin() {
        System.out.println("NHAP TEN");
        Scanner nhap = new Scanner(System.in);
        String ten = nhap.nextLine();
        super.nhapthongtin();
}
}
