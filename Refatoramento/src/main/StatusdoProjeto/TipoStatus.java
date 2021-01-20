package main.StatusdoProjeto;

public enum TipoStatus {

    ANDAMENTO{
        public AlterarStatus ObterStatus()
        {
            return new Andamento();        
        }
    },
    CONCLUSAO{
        public AlterarStatus ObterStatus()
        {
            return new Conclusao();
        }
    };

    public abstract AlterarStatus ObterStatus();
}
