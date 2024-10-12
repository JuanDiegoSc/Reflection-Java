//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import groovy.lang.GroovyShell;

public class Numeros {
    private int a;
    private int b;
    private String script;

    public Numeros(int a, int b, String script) {
        this.a = a;
        this.b = b;
        this.script = script;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getScript() {
        return this.script;
    }

    public int operar() throws Exception {
        GroovyShell shell = new GroovyShell();
        shell.setVariable("a", this.a);
        shell.setVariable("b", this.b);
        Object result = shell.evaluate(this.script);
        return (Integer)result;
    }
}
