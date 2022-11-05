import java.security.PublicKey;

public class Diseñador extends empleados{
    String Nombre,Apellido,Actvidades_Diarias;
    int Edad, codigo_emp;
    
    public void Diseñador(){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Actvidades_Diarias = Actvidades_Diarias;
        this.Edad = Edad;
        this.codigo_emp = codigo_emp;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(){
        this.Nombre = Nombre;
    }
    public String getApellido(){
        return Apellido;
    }

    public void setApellido(){
        this.Apellido = Apellido;
    }
    public String getActvidades_Diarias(){
        return Actvidades_Diarias;
    }

    public void setActvidades_Diarias(){
        this.Actvidades_Diarias = Actvidades_Diarias;
    }
    public int getEdad(){
        return Edad;
    }

    public void setEdad(){
        this.Edad = Edad;
    }
    public int getcodigo_emp(){
        return 8000;
    }

    public void setcodigo_emp(){
        this.codigo_emp = codigo_emp;
    }


    public void obtenerActividesDiariasd(){
        String Valor = "Photoshop";
        System.out.println("Juan "+getNombre()+"Perez "+getApellido()+"Edad: 25"+getEdad()+"Codigo del empleado: "+getcodigo_emp()+" "+"Herramienta: "+Valor+" "+"Actividades Diarias: "+"Reuniones de avance "+getActvidades_Diarias()+"Elaboración de diseño para páginas webs "+getActvidades_Diarias()+"Presentación-ajustes del diseño "+getActvidades_Diarias());
    }

   


}
