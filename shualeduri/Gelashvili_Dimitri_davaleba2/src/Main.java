import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstINPUT = new Scanner(System.in);
        File faili = new File("C:\\Users\\dito\\Desktop\\btu_documents");

        while(true) {
            String asoebi;
            asoebi = firstINPUT.next();

            Runnable nakadi = new Runnable() {

                String[] failebi = faili.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        if(name.contains(asoebi.toLowerCase())) {
                        }
                        return name.contains(asoebi);
                    }
                });

                @Override
                public void run() {
                    while(true) {
                        for(String name: failebi) {
                            System.out.println(name);
                        }
                        try {
                            Thread.sleep(3000);
                        }catch(InterruptedException exception) {
                            System.out.println("EXCEPTION CAUGHT");;
                        }
                    }
                }
            };

            Thread meorenakadi = new Thread(nakadi);


        }

    }
}
