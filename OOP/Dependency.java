class Printer{
    void printDocument(String doc_name){
        System.out.println("Printing Document " +doc_name);
    }
}

class OfficeWork{
    void doWork(){
        Printer printer = new Printer();
        printer.printDocument("Java Book");
    }
}

public class Dependency {
    public static void main(String[] args) {
        OfficeWork office = new OfficeWork();
        office.doWork();
    }
}
