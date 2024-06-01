package Exercicio.Computador;

public class Computador implements Monitor {
    // Atributos
    private String marcaMouse;
    private String marcaTeclado;
    private String marcaMonitor;
    private boolean ligado;
    private boolean mouseConec;
    private boolean tecladoConec;
    
    // Construtor
    public Computador() {
        this.setLigado(false);
        this.setMouseConec(false);
        this.setTecladoConec(false);
    }

    // Getters & Setters
    public String getMarcaMouse() {
        return this.marcaMouse;
    }

    public void setMarcaMouse(String m) {
        this.marcaMouse = m;
    }

    public String getMarcaTeclado() {
        return this.marcaTeclado;
    }

    public void setMarcaTeclado(String t) {
        this.marcaMouse = t;
    }

    public String getMarcaMonitor() {
        return this.marcaMonitor;
    }

    public void setMarcaMonitor(String m) {
        this.marcaMonitor = m;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getMouseConec() {
        return this.mouseConec;
    }

    public void setMouseConec(boolean m) {
        this.mouseConec = m;
    }

    public boolean getTecladoConec() {
        return this.tecladoConec;
    }

    public void setTecladoConec(boolean t) {
        this.tecladoConec = t;
    }
    
    // Métodos Abstratos
    @Override
    public void conecMouse() {
        this.setMouseConec(true);
    }

    @Override
    public void desconecMouse() {
        this.setMouseConec(false);
    }

    @Override
    public void conecTeclado() {
        this.setTecladoConec(true);
    }

    @Override
    public void desconecTeclado() {
        this.setTecladoConec(false);
    }

    @Override
    public void clicar() {
        if (this.getLigado() && this.getMouseConec()) {
            int qntdClks = 0;
            qntdClks++;
            System.out.println("Quantidade de clicks " + qntdClks);
        }
        else {
            System.out.println("O mouse e o pc estão desconectados");
        }
    }
    @Override
    public void digitar() {
        if (this.getLigado() && this.getTecladoConec()) {
            System.out.println("Digitando...");
        }
        else {
            System.out.println("O teclado e o pc estão desconectados");
        }
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void trabalhar() {
        if (this.getLigado() && this.getTecladoConec() && this.getMouseConec()) {
            System.out.println("Trabalhando...");
        }
        else {
            System.out.println("Pc, Mouse e Teclado desconectados");
        }

    }
    @Override
    public void jogar() {
        if (this.getLigado() && this.getTecladoConec() && this.getMouseConec()) {
            System.out.println("Jogando...");
        }
        else {
            System.out.println("Pc, Mouse e Teclado desconectados");
        }
    }

    @Override
    public void sobrePc() {
       if (this.getLigado()) {
        System.out.println("Monitor está conectado");
        if (this.getMouseConec())
            System.out.println("Mouse está conectado");
        else {
            System.out.println("Mouse desconectado");
        }
        if (this.getTecladoConec())
            System.out.println("Teclado está conectado");
        else {
            System.out.println("Teclado está desconectado");
        }
       }
       else {
        System.out.println("Monitor está desconectado");
       }

    }

}
