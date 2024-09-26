
public class Personajes {
    private String nombre;
    private int vida;
    
    public Personajes (String nombre,int vida){
        this.nombre=nombre;
        this.vida=vida; 
    }
    public String getnombre(){
        return nombre;
    }
    public void morir(){
    }
    public void saltar(){
        System.out.println(nombre + " saltó");
    }
    public void agachar(){
        System.out.println(nombre + " se agacho");
    }
    public void caminar(){
        System.out.println(nombre + "camino");
    }
} 
}
