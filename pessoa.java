public abstract class pessoa {

    public String cpf;
    public String nome;
    public boolean Salvar(){
        /*Considerando que o salver sera sobreescrito nas classes especializadas, o return true não parece adequado*/
         if(this.cpf.equals("888")){
            return  false;
        }
        return true;
    }

}
