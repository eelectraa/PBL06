public abstract class Roupa implements Produto {

    private String tamanhoDaRoupa;
    private String corDaRoupa;
    private float preco;

    public Roupa(String tamanhoDaRoupa,String corDaRoupa,float preco){
        this.tamanhoDaRoupa = tamanhoDaRoupa;
        this.corDaRoupa = corDaRoupa;
        this.preco = preco;

    }
    public abstract float calcularPrecoFinal(float acrescimo);


}