/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colormouse;


/**
 *
 * @author Omar
 */
public class Metodos {
    private int R,G,B;
    
    

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }
    
    public String GenerateRandomColor(){
        //Inicializamos las variables de los Colores
        int R=(int) (Math.random()*255);
        int G=(int) (Math.random()*255);
        int B=(int) (Math.random()*255);
        setR(R);
        setG(G);
        setB(B);
        String Hex = String.format("#%02X%02X%02X", R,G,B);
        return Hex;
    }
}
