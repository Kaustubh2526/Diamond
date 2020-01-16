import java.util.ArrayList;
import java.util.List;

class diamPrinter {

    List<String> printToList(char a) {
        List<String> diam = new ArrayList<>();
        if(a=='A'){
            diam.add("A");
            return diam;
        }
        else{
            int length = a-'A'+1;
            String[] storage = new String[length];
            String temp="";
            for(int i=0;i<length-1;i++){
                temp=temp+" ";
            }
            temp=temp+"A";
            for(int i=0;i<length-1;i++){
                temp=temp+" ";
            }
            storage[0] = temp;
            temp="";
            for(int i=1;i<length;i++){
                for(int j=0;j<2*length-1;j++){
                    int point  = length-i-1;
                    if(j==point||j==(2*length-1)-point-1){
                        temp=temp+((char)('A'+i));
                    }
                    else{
                        temp = temp+" ";
                    }
                }
                storage[i] = temp;
                temp = "";
            }
            for(int i=0;i<length;i++){
                diam.add(storage[i]);
            }
            for(int i=length-2;i>=0;i--){
                diam.add(storage[i]);
            }
            return diam;
        }
    }

}
