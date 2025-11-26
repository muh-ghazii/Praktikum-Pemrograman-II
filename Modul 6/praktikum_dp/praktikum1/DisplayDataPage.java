package praktikum1;
// Halaman yang memanfaatkan Template Method dengan mengisi doContent().
public class DisplayDataPage extends AbstractPage {

    public DisplayDataPage() {
        super("FITUR: TAMPILKAN DATA");
    }

    @Override
    protected String doContent(AppContext context) {
        String data = context.getSharedData();

        System.out.println("Data yang tersimpan saat ini:");
        System.out.println("-> " + data);
        System.out.println();

        return "MENU";
    }
}