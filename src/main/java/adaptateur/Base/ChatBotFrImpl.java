package adaptateur.Base;

/**
 * Bot qui parle français
 */
public class ChatBotFrImpl implements ChatBotFrancais {
    @Override
    public void parlerFrancais(String msg) {
        System.out.println("Accent francais : " + msg);
    }
}
