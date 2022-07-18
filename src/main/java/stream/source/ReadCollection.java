package stream.source;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class ReadCollection {

    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStreamSource<String> data = env.fromElements("David");
        data.print();
        try {
            env.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
