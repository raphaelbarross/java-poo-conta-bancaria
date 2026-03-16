package aula05;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());


    }

    public void abriConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fechaConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois está em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositaConta(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Conta depositado com sucesso" + this.getDono());
        } else {
            System.out.println("impossivel depositar");
        }
    }

    public void sacaConta(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Conta sacado com sucesso " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta fechada");
        }
    }

    public int pagamentoConta() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;

        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Conta pagamento com sucesso" + this.getDono());

        } else {
            System.out.println("Impossivel pagar");
        }
        return v;

    }

    //metodos especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}




