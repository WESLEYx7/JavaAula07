package processamento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProcNota {
    
        private String nomeClienteFatura;
        private LocalDate dataDaBaixa;

        public String getNomeClienteFatura() {
            return nomeClienteFatura;
        }

        public void setNomeClienteFatura(String nomeClienteFatura) {
            this.nomeClienteFatura = nomeClienteFatura;
        }

        public ProcNota (String nomeCliente) {
            nomeClienteFatura = nomeCliente;
        }

        //Hora da baixa da NFC
        public void baixarNota() {
            dataDaBaixa = LocalDate.now();
        }

        //Dando baixa no horário padrão nacional
        public String getDataDaBaixa() {
            if(dataDaBaixa == null) {
                return "Data nao definida. Nota nao foi dada baixa";
            }
            DateTimeFormatter dtf = 
            DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return dataDaBaixa.format(dtf) + "";
        }
        

    }

