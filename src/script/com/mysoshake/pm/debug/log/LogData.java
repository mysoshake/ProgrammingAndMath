package com.mysoshake.pm.debug.log;

public class LogData
{
	private Log type = Log.NONE;
	private Object[] lines = {};
	
	private LogData(Log type, Object[] lines)
	{
		this.type = type;
		this.lines = lines;
	}
	
	public static LogData of(Log type, Object[] lines)
	{
		return new LogData(type, lines);
	}
	
	public Log getType()
	{
		return type;
	}
	
	public Object[] getData()
	{
		return lines;
	}
}
