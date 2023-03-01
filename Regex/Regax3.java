
//predefind character class

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regax3{
    public static void main(String args[]){
        String s = "asd nwe9 bala  balahasjkdhf89 hsdkfh23# nsdhff% bala you we i";
        Pattern p = Pattern.compile("\\bbala\\b");
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group() +" start at " + m.start());
        }
    }
}
/*
 * //b boundary like letters after space //b... //b which spcified letter start and end in the same way with in the boundary
 * //B negative doesn't
 * //w print the alphanumeric valu in the string
 * //W all spcial character will be print
 * . print every character in string
 * //s print the every space in the string
 * //S print every thing expect the space
 * //d print every digit in the string
 * //D print every non digit character in the string
 * //G oru boundary kulla nama thedura regax irundha print pannum
 *   example balabalaasdjfja bala
 *    idhula nama  //Gbala nu kudutha bala 
 *                                    bala apdinu rendu varum ana nama 3rd kudutha bala varadhu enna anga oru vati dhan andha single boundary la iruku
 */