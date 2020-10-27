package sub2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class NaverCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
		// 띄어쓰기 기준으로 문자 토큰(문자 조각)을 만듬

		String line = value.toString();
		String[] tokens = line.split(",");
		
		context.write(new Text(tokens[1]), new IntWritable(1));
				
	}
	
}

