package com.mysoshake.pm.debug.log;

import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;

public enum Log
{
	Standard(1, "STANDARD")
	{
		@Override
		protected String format1Line(int i, String line)
		{
			line += System.lineSeparator();
			return line;
		}
	},
	
	Error(2, "ERROR   ")
	{
		@Override
		protected String format1Line(int i, String line)
		{
			line += System.lineSeparator();
			return line;
		}
	},
	
	Code(3, "CODE    ")
	{
		
		@Override
		protected void prints(Object... lines)
		{
			super.prints(lines);
			if (lines.length > 0) printLog(-1, "-EOF-");
			else printLog(-1, "");
		}
		
		@Override
		protected String format1Line(int i, String line)
		{
			String ret = "";
			
			String rownum = "";
			
			int width = 1;
			if (getRow() > 0) width = (int) (Math.log10(getRow() + 1) + 1);
			rownum = String.format("%" + (width) + "d", i + 1);
			
			if (i < 0) ret = " ".repeat(width) + " |";
			else ret = rownum + " |";
			
			ret += line + System.lineSeparator();
			
			return ret;
		}
	},
	
	Debug(-1, "DEBUG   ")
	{
		private static int counter = 0;
		
		@Override
		protected void prints(Object... lines)
		{
			super.prints(lines);
			counter++;
		}
		
		@Override
		protected String format1Line(int i, String line)
		{
			interrupt_time = true;
			
			line += System.lineSeparator();
			
			line = String.format("%3d >> ", counter) + line;
			
			return line;
		}
	},
	
	NONE(0, "        ")
	{
		@Override
		protected String format1Line(int i, String line)
		{
			line += System.lineSeparator();
			return line;
		}
	};
	
	private static CopyOnWriteArrayList<LogData> log_list;
	
	static
	{
		log_list = new CopyOnWriteArrayList<LogData>();
	}
	
	private final String DEFAULT_TITLE = "NoTitle";
	private final boolean SHOULD_OUTPUT_TIME = true;
	
	protected final int id;
	protected final String name;
	private int row = 0;
	
	protected boolean interrupt_time = true;
	protected boolean use_title = false;
	
	protected String title = DEFAULT_TITLE;
	
	private Log(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public final void print(Object... lines)
	{
		use_title = false;
		this.title = DEFAULT_TITLE;
		printer(this, lines);
	}
	
	public final void printWithTitle(String newtitle, Object... lines)
	{
		use_title = true;
		this.title = new String(newtitle);
		printer(this, lines);
		printBrankLine();
	}
	
	private synchronized final void printer(Log log, Object... lines)
	{
		this.row = lines.length;
		log.prints(lines);
		log_list.add(LogData.of(log, lines));
	}
	
	protected void prints(Object... lines)
	{
		int i = 0;
		
		if (use_title)
		{
			printLog(-1, title);
		}
		
		for (; i < lines.length; i++)
		{
			printLog(i, lines[i]);
		}
		
		interrupt_time = false;
	}
	
	public static final void printBrankLine()
	{
		System.out.println();
	}
	
	protected synchronized final void printLog(int index, Object text)
	{
		String msg = "";
		if (text != null) msg = addLogInfo(format1Line(index, text.toString()));
		System.out.print(msg);
	}
	
	protected abstract String format1Line(int index, String line);
	
	protected final int getRow()
	{
		return row;
	}
	
	protected final String addLogInfo(String text)
	{
		String time = "";
		if (interrupt_time || SHOULD_OUTPUT_TIME)
		{
			LocalDateTime t = LocalDateTime.now();
			time = String.format("%02d:%02d;%02d.%03d", t.getHour(), t.getMinute(), t.getSecond(), t.getNano() / 1_000_000);
			time = " " + time + " ";
		}
		
		return "[" + name + "]" + time + " :: " + text;
	}
	
}
