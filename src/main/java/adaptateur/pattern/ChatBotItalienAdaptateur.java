package adaptateur.pattern;

import adaptateur.Base.ChatBotItalien;

/**
 * Creation d'un adaptateur.
 * Celui ci va posséder un objet qu'il veut adapter et implementer une classe commune
 */
public class ChatBotItalienAdaptateur implements ChatBotGeneralAdaptateur {

    private ChatBotItalien chatBotItalien;

    public ChatBotItalienAdaptateur(ChatBotItalien chatBotItalien) {
        this.chatBotItalien = chatBotItalien;
    }

    @Override
    public void parler(String msg) {
        chatBotItalien.parlerItalien(msg);
    }
}
