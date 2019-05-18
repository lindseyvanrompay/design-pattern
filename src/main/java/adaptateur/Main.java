package adaptateur;

import adaptateur.Base.ChatBotAnglais;
import adaptateur.Base.ChatBotAnglaisImpl;
import adaptateur.Base.ChatBotFrImpl;
import adaptateur.Base.ChatBotFrancais;

import adaptateur.pattern.ChatBotAnglaisAdaptateur;
import adaptateur.pattern.ChatBotFrancaisAdaptateur;
import adaptateur.pattern.ChatBotGeneralAdaptateur;


/**
 * Test du design pattern adaptateur
 */
public class Main {
    public static void main(String[] args) {

        // 2 instances de bot. 2 interfaces differentes
        ChatBotFrancais chatBotFrancais = new ChatBotFrImpl();
        ChatBotAnglais chatBotAnglais = new ChatBotAnglaisImpl();


        // Creation d'adaptateurs. 1 interface commune (ChatBotGeneralAdaptateur)
        ChatBotAnglaisAdaptateur chatBotAnglaisAdapte = new ChatBotAnglaisAdaptateur(chatBotAnglais);
        ChatBotFrancaisAdaptateur chatBotFrancaisAdapte = new ChatBotFrancaisAdaptateur(chatBotFrancais);


        // Stockage dans un tableau. Implemente la meme interface !
        ChatBotGeneralAdaptateur[] chatBots = new ChatBotGeneralAdaptateur[2];
        chatBots[0] = chatBotAnglaisAdapte;
        chatBots[1] = chatBotFrancaisAdapte;


        // Utilisation des bots malgré 2 interfaces differentes
        for(ChatBotGeneralAdaptateur chatbot : chatBots){
            chatbot.parler("Je parle ! ");
        }
    }

}
