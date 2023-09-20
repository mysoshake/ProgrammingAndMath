package com.mysoshake.pm.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mysoshake.pm.debug.log.Log;

public class Terminal
{
	private boolean RUN = true;
	
	private InputStreamReader sysinreader = null;
	private BufferedReader in = null;
	
	public Terminal()
	{
		Log.Standard.print("初期化中");
		sysinreader = new InputStreamReader(System.in);
		in = new BufferedReader(sysinreader);
		Log.Standard.print("初期化終了");
		RUN = true;
		start();
	}
	
	private void start()
	{
		Log.Standard.printWithTitle("情報", "なにもありません");
		while (this.RUN)
		{
			try
			{
				System.out.print(">");
				String input = in.readLine();
				System.out.println("User input:" + input);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
