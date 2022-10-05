package HomeWork_1.Task_7;

import HomeWork_1.Task_7.Keyboards.KeysOrchestra;
import HomeWork_1.Task_7.Strings.StringOrchestra;

    public class Main {
        public static void main(String[] args) {
            StringOrchestra stringOrchestra=new StringOrchestra();
            stringOrchestra.playYourParts();
            KeysOrchestra keysOrchestra=new KeysOrchestra();
            keysOrchestra.playYourParts();
        }
    }