package pessoa;
public class PessoaJuridica extends Pessoa{
  private String cnpj;
  public String getCnpj(){
    return cnpj;
  }
  public void setCpnj(String cnpj){
    this.cnpj=cnpj;
  }
}