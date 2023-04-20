public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================" + "\n");
        System.out.println("Tugas Pegawai(1)");

        Pegawai pegawaiBiasa = new Pegawai("pegawaiBiasa",'P');
        pegawaiBiasa.setGaji(3000);
        System.out.println("THR " + pegawaiBiasa.getNama() + ": " + pegawaiBiasa.getThr());

        Salesman salesman1 =  new Salesman("salesman1",'L');
        salesman1.setGaji(500);
        salesman1.setTarget(5);
        salesman1.setPenjualan(7);
        System.out.println("THR " + salesman1.getNama() + ": " + salesman1.getThr());

        Manager manager1 = new Manager("manager1",'P');
        manager1.setGaji(7000);
        System.out.println("THR " + manager1.getNama() + ": " + manager1.getThr() + "\n");
        System.out.println("=========================================" + "\n");


        System.out.println("Tugas Pegawai(2)");

        Pegawai steve = new Pegawai("steve",'L');
        Pegawai alex = new Pegawai("alex",'P');
        Pegawai notch = new Pegawai("notch", 'L');

        steve.setCuti(7);
        System.out.println("Jumlah Cuti " + steve.getNama() + ": " + steve.getCuti());
        alex.setCuti("persalinan");
        System.out.println("Jumlah Cuti " + alex.getNama() + ": " + alex.getCuti());
        notch.setCuti("mudik");
        System.out.println("Jumlah Cuti " + notch.getNama() + ": " + notch.getCuti() + "\n");
        System.out.println("=========================================" + "\n");

        System.out.println("Tugas Pegawai(3)");

        Pegawai pegawai1 = new Pegawai("pegawai1",'L');
        Pegawai pegawai2 = new Pegawai("pegawai2",'P');
        Pegawai pegawai3 = new Pegawai("pegawai3", 'L');
        pegawai1.setNip("P0001");
        pegawai2.setNip("S0001");
        pegawai3.setNip(2);

        System.out.println("NIP Pegawai Biasa:");
        System.out.println(pegawai1.getNip());
        System.out.println(pegawai2.getNip() + "\n");

        Salesman salesman2 = new Salesman("salesman2",'L');
        Salesman salesman3 = new Salesman("salesman3",'L');
        salesman2.setNip("S0001");
        salesman3.setNip(3);

        System.out.println("NIP Salesman:");
        System.out.println(salesman2.getNip());
        System.out.println(salesman3.getNip() + "\n");


        Manager manager2 = new Manager("manager1",'L');
        Manager manager3 = new Manager("manager1",'P');
        manager2.setNip("M0001");
        manager3.setNip(4);

        System.out.println("NIP Manager:");
        System.out.println(manager2.getNip());
        System.out.println(manager3.getNip() + "\n");
        System.out.println("=========================================" + "\n");
    }
}