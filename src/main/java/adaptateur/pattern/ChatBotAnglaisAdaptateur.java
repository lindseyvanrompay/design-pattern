package adaptateur.pattern;

import adaptateur.Base.ChatBotAnglais;


/**
 * Creation d'un adaptateur.
 * Celui ci va posséder un objet qu'il veut adapter et implementer une classe commune
 */
public class ChatBotAnglaisAdaptateur implements ChatBotGeneralAdaptateur{
    private final ChatBotAnglais chatBotAnglais;

    public ChatBotAnglaisAdaptateur(ChatBotAnglais chatBotAnglais){
        this.chatBotAnglais = chatBotAnglais;
    }

    @Override
    public void parler(String msg) {
        chatBotAnglais.parlerAnglais(msg);
    }


}
