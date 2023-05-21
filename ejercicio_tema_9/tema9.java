public class Main{

    public static void main(String[] args){

        Cliente cliente = new Cliente();

        cliente.setEdad(24);
        cliente.setNombre("Dani");
        cliente.setTelefono("1234567890");
        cliente.setCredito(17800.45);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(38);
        trabajador.setNombre("Jorge");
        trabajador.setTelefono("9993334432");
        trabajador.setSalario(29500.52);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getSalario());


    }

}


public class Persona{

    private int edad;
    private String telefono;
    private String nombre;

    public void setEdad( int edad){
        this.edad = edad;
    }

    public void setTelefono( String telefono ){
        this.telefono = telefono;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre
    }

    public int getEdad(){
        return this.edad;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getNombre(){
        return this.nombre;
    }

}

public class Cliente extends Persona{

    private float credito;

    public void setCredito( float credito){
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }

}


public class Trabajador extends Persona{

    private float salario;

    public void setSalario( float salario ){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

}



