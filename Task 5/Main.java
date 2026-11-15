
public class Main {

public static void main(String[] args) throws InterruptedException {

Thread t1 = new Thread(() -> {
PrinterSpooler spooler = PrinterSpooler.getInstance();
spooler.addJob("Assignment.pdf");
});

Thread t2 = new Thread(() -> {
PrinterSpooler spooler = PrinterSpooler.getInstance();
spooler.addJob("Report.docx");
});

Thread t3 = new Thread(() -> {
PrinterSpooler spooler = PrinterSpooler.getInstance();
spooler.addJob("Presentation.pptx");
});


t1.start();
t2.start();
t3.start();


t1.join();
t2.join();
t3.join();


PrinterSpooler spooler = PrinterSpooler.getInstance();


spooler.printAll();
}
}