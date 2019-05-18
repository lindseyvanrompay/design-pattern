package adaptateur.Base;

/**
 * Un bot qui parle anglais
 */
public class ChatBotAnglaisImpl implements ChatBotAnglais {
    @Override
    public void parlerAnglais(String msg) {
        System.out.println("Accent anglais : " + msg);
    }
}
