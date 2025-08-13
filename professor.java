public class professor extends pessoa {
    public String matricula;

    @Override
    public boolean Salvar(){
        if(super.Salvar()){  
            System.out.println("salvando na tabela de professores ");
            return  true;
        }
      
        return false;
    }
}
