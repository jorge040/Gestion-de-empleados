public class Programador extends empleados{

    String Nombre,Apellido,Actvidades_Diarias;
    int Edad, codigo_emp;
    

    public void Programador(){
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
        return 9000;
    }

    public void setcodigo_emp(){
        this.codigo_emp = codigo_emp;
    }

    public void obtenerActividesDiariasp(){
        String Valor = "Eclipse";
        System.out.println("Pedro "+getNombre()+"Campos "+getApellido()+"24 "+getEdad()+"Codigo del empleado: "+getcodigo_emp()+" "+"Herramienta: "+Valor+" "+"Actividades Diarias: "+"Análisis de requerimientos "+getActvidades_Diarias()+"Desarrollo de requerimientos "+getActvidades_Diarias()+"Presentación-pruebas unitarias "+getActvidades_Diarias());
    }

    

    
}
