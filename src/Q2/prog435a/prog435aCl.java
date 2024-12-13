package Q2.prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class prog435aCl { public static void main(String[] args) {
    try {
        Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
        Cl435a[] list = new Cl435a[100];
        int cnt = 0;

        while (file.hasNext()){
            int Ct = file.nextInt();
            int G = file.nextInt();

            if (Ct != -99) {
                Cl435a fortnite = new Cl435a(Ct, G);
                list[cnt] = fortnite;
                cnt++;
            }
            for (int z = 0; z < cnt; z++) {
                list[z].calc();
            }
            for (int z = 0; z < cnt; z++) {
                System.out.println(list[z]);
            }
        }

    } catch (IOException e){
        System.out.println("Error: " + e);
    }
}
}
/*
Compact Car	$1.0	$1.35	$1.35
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Small Car	$1.3	$1.35	$1.7550000000000001
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Small Car	$1.3	$1.35	$1.7550000000000001
Mid Size Car	$1.6	$2.0	$3.2
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Small Car	$1.3	$1.35	$1.7550000000000001
Mid Size Car	$1.6	$2.0	$3.2
Full Size Car	$2.0	$2.5	$5.0
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Small Car	$1.3	$1.35	$1.7550000000000001
Mid Size Car	$1.6	$2.0	$3.2
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$3.25	$7.8
Compact Car	$1.0	$1.35	$1.35
Small Car	$1.3	$2.5	$3.25
Mid Size Car	$1.6	$4.1	$6.56
Full Size Car	$2.0	$5.5	$11.0
Truck	$2.4	$2.0	$4.8
16 Wheeler	$2.7	$3.25	$8.775
Compact Car	$1.0	$4.8	$4.8
Small Car	$1.3	$6.0	$7.800000000000001
Mid Size Car	$1.6	$1.35	$2.16
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$4.1	$9.839999999999998
16 Wheeler	$2.7	$5.5	$14.850000000000001
Compact Car	$1.0	$6.0	$6.0
Small Car	$1.3	$1.35	$1.7550000000000001
Mid Size Car	$1.6	$2.0	$3.2
Full Size Car	$2.0	$2.5	$5.0
Truck	$2.4	$3.25	$7.8
16 Wheeler	$2.7	$4.1	$11.07
 */