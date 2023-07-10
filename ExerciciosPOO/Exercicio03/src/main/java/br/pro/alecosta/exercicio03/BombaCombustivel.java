package br.pro.alecosta.exercicio03;

/**
 *
 * @author alecosta
 */
public class BombaCombustivel {
    
   private String tipoCombustivel; 
   private float valorPorLitro; 
   private float quantCombustivelNaBomba;
   
   public void  abastecerPorValor(float valor){
      float quantLitros = valor /  getValorPorLitro();
      System.out.println("A quantidade de litros que foi colocada no veículo é "+ quantLitros );
      //setQuantCombustivel(getQuantCombustivel()-quantLitros);
   };  

   public void abastecerPorLitro(float litros){
      float valor = litros * getValorPorLitro();
      System.out.println("O valor a ser pago pelo cliente é "+ valor );
      //setQuantCombustivel(getQuantCombustivel()-litros);
   };  

   public void alterarValor(float valor){
       setValorPorLitro(valor);
   };  

   public void alterarCombustivel(String tipoCombustivel){
       setTipoCombustivel(tipoCombustivel);
   };  

   public void alterarQuantidadeCombustivel(float litros){
       setQuantCombustivel(litros);    
   };
   

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQuantCombustivel() {
        return quantCombustivelNaBomba;
    }

    public void setQuantCombustivel(float quantCombustivel) {
        this.quantCombustivelNaBomba = quantCombustivel;
    }
   
   
    
}
