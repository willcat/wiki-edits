package org.xhyun.flink.streaming.connectors.tushare;

import org.apache.flink.streaming.api.functions.source.RichSourceFunction;

public class TushareSource extends RichSourceFunction<TushareRealTimeShareEvent>{
	
	public TushareSource() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(SourceContext<TushareRealTimeShare> ctx) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

}
