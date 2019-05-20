package visiteur;

import java.util.ArrayList;

public class RapportControleTechnique {

    private String status;
    private ArrayList<String> pieceDefaillante;


    public RapportControleTechnique() {
        this.status = "Validé rien à signaler";
        this.pieceDefaillante = new ArrayList<>();
    }



    public void ajoutPieceDef(String piece){
        this.pieceDefaillante.add(piece);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Contre Visite")){
            this.status = status;
        }else if(status.equals("Contre Visite") && !this.status.equals("Contre Visite")){
            this.status = status;
        }
    }

    public ArrayList<String> getPieceDefaillante() {
        return pieceDefaillante;
    }

    public void setPieceDefaillante(ArrayList<String> pieceDefaillante) {
        this.pieceDefaillante = pieceDefaillante;
    }
}
