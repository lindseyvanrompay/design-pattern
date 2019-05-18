package adaptateur.pattern;

import adaptateur.Base.ChatBotFrancais;


/**
 * Creation d'un adaptateur.
 * Celui ci va posséder un objet qu'il veut adapter et implementer une classe commune
 */
public class ChatBotFrancaisAdaptateur implements ChatBotGeneralAdaptateur {

    private ChatBotFrancais chatBotFrancais;

    public ChatBotFrancaisAdaptateur(ChatBotFrancais chatBotItalien) {
        this.chatBotFrancais = chatBotItalien;
    }

    @Override
    public void parler(String msg) {
        chatBotFrancais.parlerFrancais(msg);
    }
}
