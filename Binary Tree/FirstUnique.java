import java.util.*;
public class FirstUnique {
    public int kthGrammar(int N, int K) {
        String arr[] =new String[N];
        arr[0]="0";
        for(int i=1;i<N;i++)
        {
            String result =arr[i-1]+arr[i-1].replaceAll("0", "x").replaceAll("1", "0").replaceAll("x", "1");
            arr[i]=result;
        }
        System.out.println(Arrays.toString(arr));
     int value = Character.getNumericValue(arr[N-1].charAt(K-1));
    return value;
    }
    public static void main(String [] args)
    {
        FirstUnique obj = new FirstUnique();
        // System.out.println(obj.kthGrammar(4,5));
        // System.out.println((-4)*(-4));
        int arr[]= new int[]{1,3,4,5};
        System.out.println(arr.i)
    }
}
// --kafkaServer=bt1-kafka-s.webex.com:9092 
// --preProcessorConfig="mas_devops/adaanand_mas_devops_preprocessor.json" 
// --appName=MAS2.0_streaming_devops --zookeeperHost="rpbt1hmn002.webex.com,rpbt1hmn001.webex.com,rpbt1hmn003.webex.com" --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --userName=“adaanand” --isLocalMode=false --isEnvBTS=true --offsetDBConfig=videomesh_offset_db_config.yml

// --kafkaServer=bt1-kafka-s.webex.com:9092 --preProcessorConfig=mas_devops/adaanand_mas_devops_preprocessor.json --userName="" --appName=MAS2_0_videomesh_streaming_adaanand --zookeeperHost="rpbt1hmn002.webex.com,rpbt1hmn001.webex.com,rpbt1hmn003.webex.com" --mySQLHost=rpbt1flu002.webex.com --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --isLocalMode="true" --isEnvBTS="false"
// --kafkaServer=bt1-kafka-s.webex.com:9092 --preProcessorConfig="mas_devops/adaanand_mas_devops_preprocessor.json" --appName=MAS2_0_videomesh_streaming_adaanand --zookeeperHost="rpbt1hmn002.webex.com,rpbt1hmn001.webex.com,rpbt1hmn003.webex.com" --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --userName="" --isLocalMode=false --isEnvBTS=true --offsetDBConfig=videomesh_offset_db_config.yml