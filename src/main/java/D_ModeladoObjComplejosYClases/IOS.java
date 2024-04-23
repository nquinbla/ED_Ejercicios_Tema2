package D_ModeladoObjComplejosYClases;

public class IOS implements SistemaOperativo {
    @Override
    public void boot() {
        System.out.println("iOS is booting up...");
    }

    @Override
    public void shutdown() {
        System.out.println("iOS is shutting down...");
    }
}
