package D_ModeladoObjComplejosYClases;

public class Android implements SistemaOperativo {
    @Override
    public void boot() {
        System.out.println("Android is booting up...");
    }

    @Override
    public void shutdown() {
        System.out.println("Android is shutting down...");
    }
}
