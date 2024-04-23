package D_ModeladoObjComplejosYClases;

public class Móvil {
        private Pantalla screen;
        private Batería battery;
        private SistemaOperativo operatingSystem;

        public Móvil(Pantalla screen, Batería battery, SistemaOperativo operatingSystem) {
            this.screen = screen;
            this.battery = battery;
            this.operatingSystem = operatingSystem;
        }

        public void turnOn() {
            this.operatingSystem.boot();
        }

        public void turnOff() {
            this.operatingSystem.shutdown();
        }
    }

