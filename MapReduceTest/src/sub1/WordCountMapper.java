package sub1;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
		// 띄어쓰기 기준으로 문자 토큰(문자 조각)을 만듬
		StringTokenizer st = new StringTokenizer(value.toString());
		
		while(st.hasMoreTokens()) {
			
			String word = st.nextToken();
			
			Text txt = new Text(word);
			IntWritable val = new IntWritable(1);
			
			// Split한 단어를 key, value 쌍으로 출력
			context.write(txt, val);			
		}
		
	}
	
}
